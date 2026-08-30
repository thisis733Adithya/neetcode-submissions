class Solution {
    public String customSortString(String order, String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder sub = new StringBuilder();
        int []arr = new int[26];
        for(int i=0; i<s.length(); i++)
        {
            if(order.indexOf(s.charAt(i)) != -1){
            arr[(s.charAt(i) - 'a')]++;
            }else{
                sub.append(s.charAt(i));
            }
        }
        for(int i:arr)
        {
            System.out.println(i);
        }

        for(int i=0; i<order.length(); i++){
            if(s.indexOf(order.charAt(i)) != -1)
            {
                while(arr[(order.charAt(i) - 'a')] > 0)
                {
                    str.append(order.charAt(i));
                    arr[(order.charAt(i) - 'a')]--;
                }
            }
        }

        str.append(sub);

        return str.toString();
    }
}