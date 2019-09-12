import java.util.Random;

public class Solution {

    static boolean rotate(int[][] matrix){
        //if matrix is not a matrix
        if(matrix.length == 0 || matrix.length != matrix[0].length){
            return false;
        }
        int matrixLength = matrix.length;

        for (int layer = 0; layer < matrixLength / 2; layer++){
            int first = layer;
            int last = matrixLength - 1 - layer;
            for(int i = first; i < last; i++){
                int offset = i - first;
                int top = matrix[first][i]; //saving the top
                matrix[first][i] = matrix[last-offset][first]; //move the left edge to the top
                matrix[last - offset][first] = matrix[last][last-offset]; //move the bottom edge to the left
                matrix[last][last-offset] = matrix[i][last]; //move the right edge to the bottom
                matrix[i][last] = top; // move the previously saved top (in top variable) to the right edge
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        int [][] randomMatrix = new int [n][n];

        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Integer r = rand.nextInt()% 100;
                randomMatrix[i][j] = Math.abs(r);
            }

        }

        System.out.println(rotate(randomMatrix));
    }
}
