class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a); 
        // for(int i =0; i< matrix.length; i++){
        //     for(int j=0; j< matrix[0].length; j++){
        //         pq.add(matrix[i][j]);
        //         if(pq.size() > k)
        //             pq.remove();
        //     }
        // }
        // return pq.poll();
        
     // binary search
        int n= matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        
        while(low < high){
            int mid = low + (high - low)/2;
            int count = lessEqual(matrix,mid);
            if(count < k){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
        
    }
    
    //from left bottom or right top we can count how many numbers are equal or less than our target
    
    public int lessEqual(int[][] matrix, int target){
        int count = 0 , len = matrix.length, i = len-1, j=0;
        
        while(i >=0 && j<len){
            if(matrix[i][j] > target){
                i--;
            }
            else
            {
                count = count + i +1;
                j++;
            }
        }
        return count;
    }
}
        