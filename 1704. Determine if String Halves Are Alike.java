class Solution { 
        public boolean halvesAreAlike(String s) {  
            s = s.toLowerCase();   
            int c1 = 0 ;
            int c2 = 0;
            for(int i= 0; i < s.length() / 2; i++){    
                if( s.charAt(i) == 'i' || s.charAt(i) == 'a' || s.charAt(i) =='e' || s.charAt(i) =='o' || s.charAt(i) == 'u' )               
                    c1++;        
            }        
            for(int i= s.length() / 2; i < s.length(); i++){  
                if( s.charAt(i) == 'i' || s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='o' || s.charAt(i) =='u' )              
                    c2++;         
            }        
            return c1 == c2 ? true : false ;  
    }
}
