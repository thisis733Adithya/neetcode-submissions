class Solution {
    public int minSwaps(String s) {
        int count = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ']')
            {
                count++;
            }else{
                count--;
            }

          
            max = Math.max(max, count);
            System.out.println(max);
        }

        return (max + 1)/2;
    }
}