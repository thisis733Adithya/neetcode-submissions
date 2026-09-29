class Solution {
    public boolean isPalindrome(String s) {
     s = s.toLowerCase();
     int l = 0, r = s.length()-1;
     while(l < r)
     {
        while( l < s.length() && !((s.charAt(l) >= 'a' && s.charAt(l) <= 'z') ||

              (s.charAt(l) >= '0' && s.charAt(l) <= '9') 

            //   ( s.charAt(l) >= ' ' && s.charAt(l) <= ' ')
              )
              )
              {
                l++;
              }
        
         while(r >= 0  && !((s.charAt(r) >= 'a' && s.charAt(r) <= 'z') ||

              (s.charAt(r) >= '0' && s.charAt(r) <= '9') 

            //   ( s.charAt(r) >= ' ' && s.charAt(r) <= ' ')
              )
              )
              {
                r--;
              }
        
        if(l < s.length() && r >= 0 && s.charAt(l) != s.charAt(r))
        {
            System.out.println( s.charAt(l) +"  - "+s.charAt(r));
            return false;
        }else{
            // System.out.println( s.charAt(l) +"  - "+s.charAt(r));
            l++;
            r--;
        }
     }

     return true;    
    }
}
