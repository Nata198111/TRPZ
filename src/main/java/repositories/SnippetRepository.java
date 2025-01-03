package repositories;



import models.Snippet;
import java.util.ArrayList;
import java.util.List;

public class SnippetRepository implements Repository<Snippet> {
    private List<Snippet> snippets = new ArrayList<>();

    @Override
    public void save(Snippet snippet) {
        snippets.add(snippet);
    }

    @Override
    public Snippet findById(Long id) {
        return snippets.stream()
                .filter(snippet -> snippet.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(Long id) {
        snippets.removeIf(snippet -> snippet.getId().equals(id));
    }

    @Override
    public List<Snippet> findAll() {
        return snippets;
    }
}