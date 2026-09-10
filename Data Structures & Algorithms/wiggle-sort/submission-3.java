class Solution {
    public void wiggleSort(int[] nums) {
        // use counting sort
        int max = Arrays.stream(nums).max().getAsInt();
        int [] arr = new int[max+1];
        for(int i:nums)
        {
            arr[i]++;
        }
        int index = 0;
        int []val = new int[nums.length];
        for(int i=0; i<arr.length; i++)
        {
            while(--arr[i] >= 0)
            {
                val[index++] = i;
            }
        }
        index = 0;
        for(int i=0, j=val.length-1; i<=j; i++, j--)
        {
            if(i == j)
            {
                nums[index] = val[i];
            }else{
                 nums[index++] = val[i];
                 nums[index++] = val[j];   
            }
        }
    }
}
