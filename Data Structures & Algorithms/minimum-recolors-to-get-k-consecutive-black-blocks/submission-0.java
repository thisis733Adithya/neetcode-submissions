class Solution {
    public int minimumRecolors(String blocks, int k) {
          int min = Integer.MAX_VALUE;
        int white = 0;
        for(int i=0; i<blocks.length(); i++){

            if(blocks.charAt(i) == 'W')
            {
                white++;
            }
            if(i >= (k-1))
            {
                min = Math.min(min, white);
                if(blocks.charAt((i-k)+1) == 'W' )
                {
                    white--;
                }
            }
        }


        return min;
    }
}