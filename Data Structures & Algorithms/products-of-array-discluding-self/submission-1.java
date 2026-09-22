class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []arr = new int[nums.length];
        int prod = 1;
        for(int i=nums.length-1; i>=0; i--)
        {
            arr[i] = prod;
            prod *= nums[i]; 
        }

        prod = 1;
        for(int i=0; i<nums.length; i++)
        {
            arr[i] = prod * arr[i];
            prod *= nums[i];
        }
        
        // System.out.println(Arrays.toString(arr));

        return arr;
    }
}  
