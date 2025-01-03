package repositories;


import models.Macro;
import java.util.ArrayList;
import java.util.List;

public class MacroRepository implements Repository<Macro> {
    private List<Macro> macros = new ArrayList<>();

    @Override
    public void save(Macro macro) {
        macros.add(macro);
    }

    @Override
    public Macro findById(Long id) {
        return macros.stream()
                .filter(macro -> macro.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(Long id) {
        macros.removeIf(macro -> macro.getId().equals(id));
    }

    @Override
    public List<Macro> findAll() {
        return macros;
    }
}
