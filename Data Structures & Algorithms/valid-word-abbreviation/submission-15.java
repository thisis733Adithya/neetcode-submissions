class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

     List<Character> list = new ArrayList<>();
     int i=0;
     while(i<abbr.length())
     {
        if((abbr.charAt(i) >= 'a' && abbr.charAt(i) <= 'z') || abbr.charAt(i) == '0' )
        {
            list.add(abbr.charAt(i));
            i++;
        }else{
            int n = 0;
           
            while( i < abbr.length() && (abbr.charAt(i) < 'a' || abbr.charAt(i) > 'z'))
            {
              n = n * 10 + (abbr.charAt(i) - '0');
              i++;  
            }
             while(n-- > 0)
            {
                list.add('#');
            }
        }
     }

     if(word.length() != list.size())
     {
        return false;
     }

     for(i=0; i<word.length(); i++){
        if(list.get(i) != '#' && list.get(i) != word.charAt(i))
        {
            return false;
        }
     }

     return true;   
    }
}