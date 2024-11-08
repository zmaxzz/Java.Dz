public class MonitoringSystem {
    public static void main(String[] args) {
        HealthTest healthTest = new HealthTest();

        Patient patient1 = new Patient("Иван");
        Patient patient2 = new Patient("Анна");

        healthTest.registerObserver(patient1);
        healthTest.registerObserver(patient2);

        healthTest.setResult("Результат: Все в норме");

        healthTest.setResult("Результат: Повышенный уровень сахара");
    }
}