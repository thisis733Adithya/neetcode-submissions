class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int []ans = new int[queries.length];
        int []prefix = new int[words.length];
        int count = 0;
        // creating a prefix array
        for(int j=0; j<words.length; j++){
            if((words[j].charAt(0) == 'a'   ||
                  words[j].charAt(0) == 'e' ||
                  words[j].charAt(0) == 'i' ||
                  words[j].charAt(0) == 'o' ||
                  words[j].charAt(0) == 'u') &&
                  (words[j].charAt(words[j].length()-1) == 'a' ||
                  words[j].charAt(words[j].length()-1) == 'e' ||
                  words[j].charAt(words[j].length()-1) == 'i' ||
                  words[j].charAt(words[j].length()-1) == 'o' ||
                  words[j].charAt(words[j].length()-1) == 'u')
                   )
                   {
                    count++;
                   }
             prefix[j] = count;
            }

        for(int i=0; i<queries.length; i++){
            if(queries[i][0] == 0 )
            {
                ans[i] = prefix[queries[i][1]];
            }
            else{
                 ans[i] = prefix[queries[i][1]] - prefix[queries[i][0] - 1];
            }
        }

        return ans;
}
}
