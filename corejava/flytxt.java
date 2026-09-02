public class flytxt{
    public static int diagonalDifference(int[][] matrix) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int n = matrix.length;  // Assuming it's an n x n matrix

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];              // Primary diagonal element
            secondaryDiagonalSum += matrix[i][n - i - 1];    // Secondary diagonal element
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {11, 2, 4},
            {4, 5, 6},
            {10, 8, -12}
        };

        int result = diagonalDifference(matrix);
        System.out.println("Difference of the sums of diagonals: " + result);
    }
}
		