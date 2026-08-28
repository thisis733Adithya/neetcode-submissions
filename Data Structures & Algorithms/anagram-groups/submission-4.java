class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashSet<String> set = new HashSet<>();
        List<List<String>> result = new ArrayList<>();

        for(int i=0; i<strs.length; i++)
        {
            
            if(!set.contains(strs[i])){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                set.add(strs[i]);

                for(int j=i+1; j<strs.length; j++)
                {
                     if(isAnagram(strs[i], strs[j]))
                    {
                        list.add(strs[j]);
                        set.add(strs[j]);
                    }
                }

            if(list.size() > 0)
            {
                result.add(list);
            }

            }
           


        }

        return result;
    }
    private boolean isAnagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        int []arr = new int[26];
        for(int i=0; i<s1.length(); i++){
            arr[(s1.charAt(i) - 'a')]++;
        }
         for(int i=0; i<s2.length(); i++){
           if(--arr[(s2.charAt(i) - 'a')]  < 0)
           {
            return false;
           }
        }
        return true;
    }
}
