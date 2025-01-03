package repositories;

import models.File;
import observer.Subject;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class FileRepository implements Repository<File>, Subject {
    private List<File> files = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void save(File file) {
        files.add(file);
        notifyObservers("File saved: " + file.getFileName());
    }

    @Override
    public File findById(Long id) {
        return files.stream().filter(file -> file.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void delete(Long id) {
        files.removeIf(file -> file.getId().equals(id));
        notifyObservers("File deleted with ID: " + id);
    }

    @Override
    public List<File> findAll() {
        return files;
    }

    // Methods for managing observers
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
