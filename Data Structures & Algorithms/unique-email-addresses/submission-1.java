class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String s:emails)
        {
            //process the email and store in a hash set
            
            //email processing
            StringBuilder str = new StringBuilder();
            if(s.indexOf('@') != -1)
            {
              String left =  s.substring(0, s.indexOf('@'));
                int i=0;
                // appending the left of email
                while(i < left.length() && left.charAt(i) != '+')
                {
                    if(left.charAt(i) != '.')
                    {
                        str.append(left.charAt(i));
                    }
                    i++;
                }
                // appending the right of email

                str.append(s.substring(s.indexOf('@'), s.length()));
            }

            

            //storing the email

            set.add(str.toString());
        }
        return set.size();
    }
}