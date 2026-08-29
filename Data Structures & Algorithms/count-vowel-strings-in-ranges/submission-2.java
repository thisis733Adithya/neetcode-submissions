class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int []ans = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int count = 0;
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if((words[j].charAt(0) == 'a' ||
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
            }
            ans[i] = count;
        }

        return ans;
    }
}