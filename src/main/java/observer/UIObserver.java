package observer;

public class UIObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("UI updated with message: " + message);
    }
}
