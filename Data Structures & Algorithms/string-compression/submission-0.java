class Solution {
    public int compress(char[] chars) {
      StringBuilder s = new StringBuilder();
        int ptr = 0;
       for(int i=1; i<chars.length; i++)
       {
        if(chars[i] != chars[i-1])
        {
            int len = (((i-1)-ptr)+1);
            if(len > 1){
            s.append(""+chars[i-1]+len+"");
            }else{
                s.append(chars[i-1]);
            }
          System.out.println(chars[i-1] +" -> "+len);
          ptr = i;  
        }
    }

         int len = (chars.length - ptr);
        if(len > 1){
        s.append(""+chars[chars.length-1]+len+"");
        }else{
                s.append(chars[chars.length-1]);
            }
         System.out.println(chars[chars.length-1] +" -> "+len);



         for(int i=0; i<s.length(); i++)
         {
            chars[i] = s.charAt(i);
         }
    

       return s.length();
    }
}