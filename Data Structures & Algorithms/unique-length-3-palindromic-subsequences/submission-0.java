class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character, Integer> left = new HashMap<>();
        HashMap<Character, Integer> right = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<s.length(); i++)
        {
            right.put(s.charAt(i), right.getOrDefault(s.charAt(i), 0)+1);
        }

        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            // removing the right 

         
        right.put(ch, right.get(ch)-1);
          if(right.get(ch) == 0)
        {
        right.remove(ch);
        }
         
        

        for(char c = 'a' ; c<='z'; c++){
         if(right.containsKey(c) && left.containsKey(c)  && !set.contains(""+c+ch+c+""))
        {
          count++;
          set.add(""+c+ch+c+"");
        }
        }
        

        // adding to the left
        left.put(s.charAt(i), left.getOrDefault(s.charAt(i), 0)+1);
    }


    return count;
    }
}