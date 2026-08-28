class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
         for(int j:nums)
        {
          if(j != val) k++;
        }
        int  i=0;
       while(i < nums.length ){
            if(nums[i] == val)
            {
                for(int j=i; j<nums.length-1; j++)
                {
                    nums[j] = nums[j+1];  
                }
                nums[nums.length-1] = -1;
               
            }else{
                i++;
            }
       }
        return k;
    }
}