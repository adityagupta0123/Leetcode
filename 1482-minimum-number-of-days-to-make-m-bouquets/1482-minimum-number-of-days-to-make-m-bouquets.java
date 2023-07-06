class Solution {
    public int minDays(int[] bloomDay, int bouq, int flow) {
        if( bouq * flow > bloomDay.length)
            return -1;
        
        int l = bloomDay[0], r = bloomDay[0], res = -1;
        for(int i =0; i< bloomDay.length; i++){
            l = Math.min(l, bloomDay[i]);
            r = Math.max(r, bloomDay[i]);
        }
        while(l <= r){
            int m = l + (r - l) / 2;
            if(isPossible(bloomDay, m, bouq, flow) == true){
                res = m;
                r = m - 1;
            } else
                l = m + 1; 
        }
        return res;
    }
    public boolean isPossible(int []Days, int m, int bouq, int flow){
        int adj = 0,  bCount = 0;
        for(int i=0; i< Days.length; i++){
            if(Days[i] <= m){
                adj++;
                if(adj == flow){
                    bCount++;
                    if( bCount == bouq)
                        return true;
                    adj = 0;
                }
            }else{
                adj = 0;
            }     
        }
        return false;
    }
}