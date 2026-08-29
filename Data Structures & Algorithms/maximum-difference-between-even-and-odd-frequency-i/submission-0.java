class Solution {
    public int maxDifference(String s) {
        int [] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[(s.charAt(i) - 'a')]++;
        }
        // int maxOdd = 0;
        // int minOdd = s.length();
        // int maxEven = 0;
        // int minEven = s.length();
        //  if(arr[i] > 0 && arr[i] % 2 == 0)
        //     {
        //         maxEven = Math.max(arr[i], maxEven);
        //         minEven = Math.min(arr[i], minEven);
        //     }
        //     if(arr[i] > 0 && arr[i] % 2 != 0)
        //     {
        //         maxOdd = Math.max(arr[i], maxOdd);
        //         minOdd = Math.min(arr[i], maxOdd);
        //     }
        int max = 0;
        int min = s.length();
        for(int i=0; i<arr.length; i++)
        {
           if(arr[i] > 0 && arr[i] % 2 == 0)
           {
              min = Math.min(arr[i], min);
           }
            if(arr[i] > 0 && arr[i] % 2 != 0)
           {
            max = Math.max(max, arr[i]);
           }
        }

        return max - min;
    }
}