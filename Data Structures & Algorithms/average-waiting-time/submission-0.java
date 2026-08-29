class Solution {
    public double averageWaitingTime(int[][] customers) {
     int start = customers[0][0];
     double totalTime = 0;
     for(int i=0; i<customers.length; i++){
        start = Math.max(start +  customers[i][1], customers[i][0] + customers[i][1]);
        totalTime += (start - customers[i][0]);
        System.out.println(start +" - "+customers[i][0]+" = "+totalTime);
     }

     return (totalTime / customers.length);   
    }
}