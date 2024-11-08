import java.util.ArrayList;
import java.util.List;

class HealthTest implements Subject {
    private List<Observer> observers;
    private String result;

    public HealthTest() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(result);
        }
    }

    public void setResult(String result) {
        this.result = result;
        notifyObservers();
    }
}