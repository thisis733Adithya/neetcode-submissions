class Solution {
    public int minSubarray(int[] nums, int p) {
          long sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        if(sum < p)
        {
            return -1;
        }
        long k = sum % p;
        if(k == 0)
        {
            return 0;
        }

        HashMap<Long, Integer> map = new HashMap<>();
        int length = nums.length;
        map.put(0L, -1);
        long prefix = 0;
        for(int i=0; i<nums.length; i++){
            prefix = (prefix+nums[i])%p;
            long need = ((prefix - k) % p + p) % p;
            if(map.containsKey(need))
            {
                length = Math.min(length,(i-map.get(need)));
            } 
            map.put(prefix, i);
        }

        return length >= nums.length? -1 :length;
    }
}