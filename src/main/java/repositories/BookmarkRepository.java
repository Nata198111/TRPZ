package repositories;


import models.Bookmark;
import java.util.ArrayList;
import java.util.List;

public class BookmarkRepository implements Repository<Bookmark> {
    private List<Bookmark> bookmarks = new ArrayList<>();

    @Override
    public void save(Bookmark bookmark) {
        bookmarks.add(bookmark);
    }

    @Override
    public Bookmark findById(Long id) {
        return bookmarks.stream()
                .filter(bookmark -> bookmark.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(Long id) {
        bookmarks.removeIf(bookmark -> bookmark.getId().equals(id));
    }

    @Override
    public List<Bookmark> findAll() {
        return bookmarks;
    }
}
