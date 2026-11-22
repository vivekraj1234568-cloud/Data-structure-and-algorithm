class Solution {
    public boolean checkString(String s) {
          int  n= s.length();
          int count =0;
          boolean flag=false;
          
         for(int i=0; i<n; i++){
              
               if(s.charAt(i)=='b'){
                  flag=true ;

               }
               if(s.charAt(i)=='a' && flag==true) return false;
             
            }
         return true;
    }
}