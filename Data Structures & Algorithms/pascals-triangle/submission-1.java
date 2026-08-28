class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();        
        result.add(Arrays.asList(1));
        for(int i=1; i<numRows; i++)
        {
        List<Integer> prev =  result.get(i-1);
        List<Integer> list = new ArrayList<>();
        list.add(prev.get(0));
        for(int j=1; j<prev.size(); j++){
            list.add(prev.get(j)+prev.get(j-1));
        }
        list.add(prev.get(prev.size()-1));
        result.add(new ArrayList<>(list));
        }

        return result;
    }
}