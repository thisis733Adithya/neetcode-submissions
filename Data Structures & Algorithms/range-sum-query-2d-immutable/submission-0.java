class NumMatrix {

    public static int [][] sum;

    public NumMatrix(int[][] matrix) {
        sum = new int[matrix.length+1][matrix[0].length+1];
        for(int i=0; i<matrix.length; i++){
            // keeping the Runsum of every row 
            // then adding it with the upper sum of the above element
            int runSum = 0;
            for(int j=0; j<matrix[0].length; j++)
            {
                runSum += matrix[i][j];
                sum[i+1][j+1] = runSum + sum[i][j+1]; 
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int upperSum = sum[row2+1][col1];
        int leftSum = sum[row1][col2+1];
        int cornerSum = sum[row1][col1];

        int fullSum = sum[row2+1][col2+1];

        fullSum -= upperSum;
        fullSum -= leftSum;
        fullSum += cornerSum;

        return fullSum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */