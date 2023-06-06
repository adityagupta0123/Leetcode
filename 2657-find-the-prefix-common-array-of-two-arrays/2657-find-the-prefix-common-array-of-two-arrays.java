class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans[] = new int [A.length];
        // for(int i =0; i< A.length; i++){
        //     boolean found = false;
        //     for(int j =0; j< B.length; j++){
        //         if(A[i] == B[j])
        //             found = true;
        //         if(found && j >= i)
        //             ans[j]++;
        //     }
        // }
        // return  ans;
        
        
        int []freq = new int[A.length + 1];
        int count = 0;
        // Arrays.fills(freq,0);
        for(int i =0 ; i< A.length; i++){
            int indA = A[i];
            freq[indA]++;
            if(freq[indA] == 2) 
                count++;
            
            int indB = B[i];            
            freq[indB]++; 
            if(freq[indB] == 2) 
                count++;
            
            ans[i] = count;
            
        }
        return ans;
    }
    
}