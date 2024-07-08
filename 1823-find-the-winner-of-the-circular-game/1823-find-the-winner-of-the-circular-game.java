class Solution {
    // public int findTheWinner(int n, int k) {
    //     int ans = solve(n, k) + 1;
    //     return ans;
    // }
    // public int solve(int n, int k){
    //     if(n == 1)
    //         return 0;
    //     return (solve(n -1, k) + k) % n;
    // }
    
    public int findTheWinner(int n, int k) {
        int winner=0;
        for (int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1;
    }
}
