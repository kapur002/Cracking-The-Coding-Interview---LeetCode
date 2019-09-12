public class Solution {

    static void setZeros(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        //store the row & column index with value 0
        //the above comment means that we are merely searching thru the matrix for where we find zeros
        //and then we are marking their positions. At this point, we are not making any edits to the matrix.
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            } // end of inner for loop
        } //end of outer for loop

        //we will nullify the row
        for (int i = 0; i < row.length; i++){
            if(row[i]){
                nullifyRow(matrix, i);
            }
        }

        //we will nullify the column
        for (int j = 0; j < column.length; j++){
            if(column[j]){
                nullifyColumn(matrix, j);
            }
        }
    }

    static void nullifyRow(int[][] matrix, int row){
        for(int j = 0; j < matrix[0].length; j++){
            matrix[row][j] = 0;
        }
    }

    static void nullifyColumn(int[][] matrix, int column){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][column] = 0;
        }
    }
    public static void main(String[] args) {

    }
}
