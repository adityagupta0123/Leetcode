class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {
            return false;  // If the array has less than 3 elements, return false immediately
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] % 2 != 0) && (arr[i + 1] % 2 != 0) && (arr[i + 2] % 2 != 0)) {
                return true;  // If three consecutive odd numbers are found, return true
            }
        }

        return false;  // If no such triplet is found, return false
    }
}
