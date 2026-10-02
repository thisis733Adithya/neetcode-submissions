class Solution {
    public boolean validPalindrome(String s) {

        for(int i=0; i<s.length(); i++)
        {
            if(isPalindrome(s.substring(0, i)+s.substring(i+1, s.length())))
            {
                return true;
            }

        }

        return false;
    }
    private boolean isPalindrome(String s)
    {
        for(int i=0, j=s.length()-1;  i < j; i++, j--)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
        }

        return true;
    }
}