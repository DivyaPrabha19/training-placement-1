public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2},
            {3, 4}
        };
        int[][] matrixB = {
            {2, 0},
            {1, 2}
        };

        int[][] result = multiplyMatrices(matrixA, matrixB);

        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
