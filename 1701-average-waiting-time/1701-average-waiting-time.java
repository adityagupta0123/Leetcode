// class Solution {
//     public double averageWaitingTime(int[][] customer) {
//         int op[]= new int[customer.length];
        
//         Arrays.fill(op,0);
//         op[0] = customer[0][0] + customer[0][1];
//         int wt = op[0] - customer[0][0] ;
//         for(int i=1; i< customer.length; i++){
//             if(customer[i][0] > op[i-1]){
//                 op[i]= customer[i][0] + customer[i][1];
//             } else{
//                 op[i] = op[i-1] + customer[i][1];
//             }  
//             wt += (op[i] - customer[i][0]);
//         }
        
//         return (double) wt / customer.length;
//     }
    
// }
class Solution {
    public double averageWaitingTime(int[][] customers) {
        double total_waiting_time = 0;
        int current_time = 0;

        for (int[] customer : customers) {
            int arrival = customer[0];
            int service = customer[1];
            if (current_time < arrival) {
                current_time = arrival;
            }
            int waiting_time = current_time - arrival + service;
            total_waiting_time += waiting_time;
            current_time += service;
        }

        return total_waiting_time / customers.length;
    }
}