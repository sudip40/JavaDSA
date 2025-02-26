package Arrays.DSA;

public class RotateMatrix {
    public void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        // Transpose of a matrix (swap rows and columns)
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row to rotate the matrix 90 degrees clockwise
        for(int i=0;i<n;i++){
            for(int j=0;j<(n/2);j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}
