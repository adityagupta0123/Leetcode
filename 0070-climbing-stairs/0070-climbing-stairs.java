class Solution {
    
    public int climbStairs(int n) {
//         int qb[] = new int[n + 1];
//         if( n == 0)
//             return 1;
//         else if(n < 0)
//             return 0;
        
//         if( qb[n] != 0 )
//             return qb[n];
        
//         int nm1 = climbStairs(n - 1);
//         int nm2 = climbStairs(n - 2);
        
//         int cp = nm1 + nm2;
        
//         qb[n] = cp;
        
//         return cp;
        
        int dp [] = new int[n + 1];
        
        dp[0] = 1;
        dp[1] = 1;
        for(int i =2; i <= n; i++)
            dp[i] = dp[i-1] + dp[i-2];
        return dp[n];
    }
}