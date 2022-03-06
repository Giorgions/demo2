package pl.edu.wszib.demo2;

//Create
//Read
//Update
//Delete

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/zasob")
@RestController
public class CrudController {

    public static class Zasob {
        private Integer id;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }

    private Integer idCounter = 1;
    private Map<Integer, Zasob> kontener = new HashMap<>();

    @PostMapping
    public Zasob create(@RequestBody Zasob zasob) {
        zasob.id = idCounter++;
        kontener.put(zasob.id, zasob);
        return zasob;
    }

    @GetMapping
    public Zasob[] list() {
        return kontener.values().toArray(new Zasob[0]);
    }

    @GetMapping("/{id}")
    public Zasob get(@PathVariable Integer id) {
        return kontener.get(id);
    }

    @PutMapping
    public Zasob update(@RequestBody Zasob zasob) {
        if (kontener.containsKey(zasob.id)) {
            kontener.put(zasob.id, zasob);
            return zasob;
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        kontener.remove(id);
    }
}
