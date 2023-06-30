class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Integer.MIN_VALUE;

        for (int p : piles) {
            high = Math.max(p, high);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isBananaPossible(piles, mid, h)) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return low;
    }


    private boolean isBananaPossible(int[] piles, int k, int h) {
        int total = 0;
        for (int p : piles) {
            total += Math.ceil((double) p / k);
        }

        return total <= h;
    }
}