package repositories;


import models.File;

import java.util.ArrayList;
import java.util.List;

public class FileRepository implements Repository<File> {
    private List<File> files = new ArrayList<>();

    @Override
    public void save(File file) {
        files.add(file);
    }

    @Override
    public File findById(Long id) {
        return files.stream().filter(file -> file.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void delete(Long id) {
        files.removeIf(file -> file.getId().equals(id));
    }

    @Override
    public List<File> findAll() {
        return files;
    }
}
