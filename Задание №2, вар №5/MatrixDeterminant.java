class MatrixDeterminant implements MatrixOperation {
    @Override
    public void execute(double[][] matrix, double[][] dummy) {
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Определитель можно вычислить только для квадратной матрицы.");
        }
        double determinant = calculateDeterminant(matrix);
        System.out.println("Определитель: " + determinant);
    }

    private double calculateDeterminant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) return matrix[0][0];
        if (n == 2) return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        double det = 0;
        for (int i = 0; i < n; i++) {
            det += Math.pow(-1, i) * matrix[0][i] * calculateDeterminant(getMinor(matrix, i));
        }
        return det;
    }

    private double[][] getMinor(double[][] matrix, int col) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        for (int i = 1; i < n; i++) {
            int minorCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                minor[i - 1][minorCol++] = matrix[i][j];
            }
        }
        return minor;
    }
}