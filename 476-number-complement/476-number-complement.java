class Solution {
    public int findComplement(int num) {
        int bitLeng =  (int)( Math.log(num) / Math.log(2) ) + 1;

        int bitMask = ( 1 << (bitLeng)) - 1;
        
        return bitMask ^ num ;   
            
    }
}