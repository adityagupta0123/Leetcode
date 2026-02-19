class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int i = 0;
            for(int j=1; j<nums.length; j++){
                if(nums[i] != nums[j]){
                    i++;
                    nums[i] = nums[j];
                }     
            }
        return i+1;
        // HashSet<Integer> hs = new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     hs.add(nums[i]);
        // }
        // return hs.size();
    }
}