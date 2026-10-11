class KthLargest {
    int k;
    PriorityQueue<Integer> minHeap;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for(int i:nums)
        {
            minHeap.add(i);
        }
    }
    public int add(int val) {
        minHeap.add(val);
        int i=1;
        int size = minHeap.size() - k;
        List<Integer> list = new ArrayList<>();
        while(i++ <= size)
        {
            list.add(minHeap.poll());
        }
        int ele = minHeap.peek();

        for(int j:list)
        {
            minHeap.add(j);
        }
        return ele;
    }
}
