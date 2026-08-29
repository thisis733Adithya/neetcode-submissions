class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
          if((flowerbed.length == 1 && flowerbed[0] != 1 && n == 1) ||
           (flowerbed.length == 1 && flowerbed[0] == 1 && n == 0) ||
           (flowerbed.length == 0 && n == 0)
           )
           {
            return true;
           }







        if( flowerbed.length > 1){
     for(int i=0; i<flowerbed.length; i++){
        
        if(i == 0)
        {
            if(i+1 < flowerbed.length  && flowerbed[i] != 1 && flowerbed[i+1] != 1)
            {
                n--;
                flowerbed[i] = 1;

            }
        }
        else if( i == flowerbed.length-1)
        {
             if(i-1 >= 0 &&  flowerbed[i] != 1 && flowerbed[i-1] != 1)
            {
                n--;
                flowerbed[i] = 1;
            }

        }else{
             if( i-1 >=0  && i+1 < flowerbed.length  &&  flowerbed[i] != 1 && flowerbed[i-1] != 1 && flowerbed[i+1] != 1)
            {
                n--;
                flowerbed[i] = 1;
            }

        }

        if(n <= 0)
        {
            return true;
        }

     }
        }

     return n==0;   
    }
}