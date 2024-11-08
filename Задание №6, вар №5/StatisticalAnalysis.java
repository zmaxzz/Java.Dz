public class StatisticalAnalysis implements AnalysisMethod {
    @Override
    public void analyze(Data data) {

        System.out.println("Выполнение статистического анализа...");

        double mean = calculateMean(data.getValues());
        System.out.println("Среднее значение: " + mean);
    }

    private double calculateMean(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}