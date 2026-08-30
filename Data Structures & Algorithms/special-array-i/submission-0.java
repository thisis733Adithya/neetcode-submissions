class Solution {
    public boolean isArraySpecial(int[] nums) {
       boolean flag = nums[0] % 2 == 0 ? true : false;
       for(int i=1; i<nums.length; i++){
        if((flag && nums[i] % 2 == 0) || (!flag && nums[i] % 2 != 0))
        {
            return false;
        }
        flag = nums[i] % 2 == 0 ? true : false;
       } 

       return true;
    }
}