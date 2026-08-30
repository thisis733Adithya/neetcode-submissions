class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map =new HashMap<>();
        for(int i:nums)
        {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b)->{
            int freqA = map.get(a); 
            int freqB = map.get(b);
            if(freqA == freqB)
            {
                return b-a;
            }
            return freqA-freqB;
        });
        int index = 0;
        for(int n:list)
        {
            int count = map.get(n);
            for(int i=0; i<count; i++)
            {
                nums[index++] = n;
            }
        }
        return nums;
    }
}