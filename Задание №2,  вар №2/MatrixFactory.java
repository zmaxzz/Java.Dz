// Интерфейс для создания матриц
interface MatrixFactory {
    MatrixOperation createAddition();
    MatrixOperation createMultiplication();
    MatrixOperation createDeterminant();
}