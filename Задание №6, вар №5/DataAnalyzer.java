import java.util.HashMap;
import java.util.Map;

public class DataAnalyzer {
    private Map<String, AnalysisMethod> methods;

    public DataAnalyzer() {
        methods = new HashMap<>();
        methods.put("statistical", new StatisticalAnalysis());
        methods.put("machineLearning", new MachineAnalysis());
        methods.put("geneticAlgorithm", new AlgorithmAnalysis());
    }

    public void analyze(String methodType, Data data) {
        AnalysisMethod method = methods.get(methodType);
        if (method != null) {
            method.analyze(data);
        } else {
            System.out.println("Неизвестный метод анализа: " + methodType);
        }
    }
}