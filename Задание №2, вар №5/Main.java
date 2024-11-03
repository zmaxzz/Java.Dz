public class Main {
    public static void main(String[] args) {
        MatrixFactory factory = new ConcreteMatrixFactory();

        double[][] matrixA = {
                {1, 2, 3},
                {4, 5, 5},
                {7, 7, 7}
        };

        double[][] matrixB = {
                {9, 9, 9},
                {6, 1, 4},
                {3, 8, 8}
        };

        MatrixOperation addition = factory.createAddition();
        addition.execute(matrixA, matrixB);

        MatrixOperation multiplication = factory.createMultiplication();
        multiplication.execute(matrixA, matrixB);

        MatrixOperation determinant = factory.createDeterminant();
        determinant.execute(matrixA, null);
    }
}