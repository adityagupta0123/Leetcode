class Solution {
    public int fib(int n) {
        int qb[]= new int[n+1]; 
        return fibmem(n, qb);
    }
    public int fibmem(int n, int [] qb){
        if(n < 2)
            return n;
        
        if( qb[n] != 0)
            return qb[n];
        
        int fibn = fibmem( n - 1, qb ) + fibmem( n - 2 , qb );
        
        qb[n] = fibn;
        
        return fibn;
    }
}