class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];
        int n = candies.length;
        for(int i =1; i< n ; i++){
            if ( max < candies[i]) max = candies[i];
        }
        for(int i =0 ; i< n ; i++){
            if(candies[i] + extraCandies >= max)
            ans.add(true);
            else
            ans.add(false);
        }

        return ans;
    }
}