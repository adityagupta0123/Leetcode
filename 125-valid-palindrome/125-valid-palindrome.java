class Solution { 
    
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    
    
    
    
    //      public boolean isPalindrome(String s) {
//          s = s.toLowerCase().replaceAll("[^a-zA-Z]", "");
//         boolean flag = true;
//         for(int i=0; i<s.length(); i++){
//             if(s.charAt(i) != s.charAt(s.length()-1-i)){
//                 flag = false;
//                 break;
//             }
            
//         }
//         return flag;
            
        
//     }
    
    
     // public boolean isPalindrome(String s) {
         // s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
         // return ispalin(s,0,s.length()-1);
     // }
    // boolean ispalin (String s, int l, int r){
    //         if(l>=r)
    //             return true;
    //         if(s.charAt(l) != s.charAt(r))
    //             return false;
    //         return ispalin(s,l+1,r-1);
    // }
}