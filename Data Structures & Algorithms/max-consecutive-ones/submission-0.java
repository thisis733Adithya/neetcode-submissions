class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = 0;
        int curLen = 0;
     for(int i=0; i<nums.length; i++){
        if(i == nums.length-1 && nums[i] == 1)
        {
            curLen++;
            length = Math.max(length, curLen);
        }
        else if(nums[i] == 1)
        {
            curLen++;
        }else{
            length = Math.max(length, curLen);
            curLen = 0;
        }
     }
     return length;   
    }
}