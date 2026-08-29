class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length ==1) return 1;
        int ptr = 0;
        int incLength = 0;
        // inreasing 
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1])
            {
                incLength = Math.max(incLength, (i-ptr)+1);
            }else{
                ptr = i;
            }
        }

        // decreasing
        ptr = 0;
        int decLength = 0;
         for(int i=1; i<nums.length; i++){
            if(nums[i] < nums[i-1])
            {
                decLength = Math.max(decLength, (i-ptr)+1);
            }else{
                ptr = i;
            }
        }

        return Math.max(incLength, decLength) == 0 ? 1 : Math.max(incLength, decLength);
    }
}