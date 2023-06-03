class Solution {
    public int mySqrt(int x) {
        int l = 1, r= x ;
        while(l <= r){
            int mid = l + ( r - l) / 2;
            if(Math.pow(mid,2) == x)
                return mid;
            else if ( Math.pow(mid,2) > x )
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l - 1;
    }
}