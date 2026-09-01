class Solution {
    public int maxScore(String s) {
        int one = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == '1' )
            {
                one++;
            }
        }
         int zero = 0; 
         int maxSum = 0;
        for(int i=0; i<s.length()-1; i++){
            if(i != 0 && s.charAt(i) == '1')
            {
                one--;
            }
            if(s.charAt(i) == '0')
            {
                zero++;
            }

            maxSum = Math.max(maxSum, one+zero);
        }

        return maxSum;
    }
}