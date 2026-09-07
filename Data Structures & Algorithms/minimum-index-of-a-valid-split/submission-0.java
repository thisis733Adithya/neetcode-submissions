class Solution {
    public int minimumIndex(List<Integer> nums) {
        int dominantNumber = -1;
        int n = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i, map.getOrDefault(i, 0)+1);
            if(map.get(i) > n)
            {
                dominantNumber = i;
                n = map.get(i);
            }
        }

        int right = n;
        int left = 0;
        n = nums.size();
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) == dominantNumber)
            {
                right--;
                left++;
            }
            if(left > ((i+1)/2) && right > ((Math.abs((i-n))-1) / 2))
            {
                return i;
            }
        }

        return -1; 
    }
}