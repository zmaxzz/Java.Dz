public class Main {
    public static void main(String[] args) {
        Data data = new Data(new double[]{0.1, 1.0, 2.20, 4.87, 11.0});
        DataAnalyzer analyzer = new DataAnalyzer();

        analyzer.analyze("statistical", data);
        analyzer.analyze("machineLearning", data);
        analyzer.analyze("geneticAlgorithm", data);
    }
}