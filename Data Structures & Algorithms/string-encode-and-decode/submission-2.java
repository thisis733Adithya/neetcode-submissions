class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        // appending the length of the stsrs
        if(strs.size() < 10)
        {
             s.append("0"+strs.size());
        }
        else{
            s.append(strs.size()+"");
        }
        

        // appending the length of each String
        for(String i:strs)
        {
            String len = "";
            if(i.length() < 10)
            {
                len +="00"+i.length();
            }
            else if(i.length() < 100 && i.length() > 9)
            {
                len +="0"+i.length();
            }
            else{
                len += i.length();
            }
            s.append(len);
        }

        // appending the Strings

        for(String item : strs)
        {
            s.append(item);
        }

        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        int size = 0;
        int i;
        for(i=0; i<2; i++){
            size = size * 10 + (str.charAt(i) - '0');
        }
        start = (size * 3) + 2;

        int count = 0;
        while(i < (size * 3) + 2 && count < size)
        {

            // find the length of each string
            int len = 0;
            for(int j=i; j<i+3; j++){
                len = len * 10 + (str.charAt(j) - '0');
            }
            end = start + len;
            list.add(str.substring(start, end));
            start = end;
            i+=3;
            count++;
        }

        return list;
    }
}