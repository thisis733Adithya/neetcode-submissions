class Solution {
    public int minOperations(String[] logs) {
        int top = 0;
        for(String s:logs)
        {
            if(s.equals("../") && top > 0)
            {
                top--;
            }else if(s.equals("./")){

            }else if( !s.equals("../") && !s.equals("./")){
                top++;
            }
        }

        return top;
    }
}