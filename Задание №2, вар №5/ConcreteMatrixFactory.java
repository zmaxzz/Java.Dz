class ConcreteMatrixFactory implements MatrixFactory {
    @Override
    public MatrixOperation createAddition() {
        return new MatrixAddition();
    }

    @Override
    public MatrixOperation createMultiplication() {
        return new MatrixMultiplication();
    }

    @Override
    public MatrixOperation createDeterminant() {
        return new MatrixDeterminant();
    }
}