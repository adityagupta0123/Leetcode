class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr [] = new int[nums.length];
        int j = 0;
        for(int i = 0; i< nums.length / 2 ; i++){
            arr[j] = nums[i];
            j += 2;  
        }
        j = 1;
        for(int i = nums.length/2; i< nums.length  ; i++){
            arr[j] = nums[i];
            j += 2;  
        }
        return arr;
    }
}