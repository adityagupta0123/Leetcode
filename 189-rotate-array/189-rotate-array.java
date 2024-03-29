class Solution {
    // public void rotate(int[] nums, int k) {
    //    while (k-- > 0){
    //        int temp = nums[nums.length - 1 ];
    //        for(int i = nums.length - 1 ; i > 0 ; i --){
    //            nums[i] = nums[i-1];
    //        }
    //        nums[0] = temp;
    //    } 
    // }
     public void rotate(int[] nums, int k) {
         k %= nums.length;
         reverse(nums, 0, nums.length -1);
         reverse(nums, 0, k -1);
         reverse(nums, k, nums.length - 1);
     }
    public void reverse(int [] nums, int l, int r){
        while ( l <= r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}