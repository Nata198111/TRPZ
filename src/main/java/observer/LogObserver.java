package observer;

public class LogObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Log: " + message);
    }
}
