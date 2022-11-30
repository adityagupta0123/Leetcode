class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        for (int n : arr) 
           mp.put(n, mp.getOrDefault(n, 0)+1);    // [1] count frequencies
           
        HashSet<Integer> unq = new HashSet<>(mp.values());        // [2] collect unique frequencies
        
        return unq.size() == mp.size();
    }
}
