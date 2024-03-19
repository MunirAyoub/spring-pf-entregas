package br.com.fiap.springpfentregas.resource;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import br.com.fiap.springpfentregas.entity.Passageiro;
import br.com.fiap.springpfentregas.repository.PassageiroRepository;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/passageiro")
public class PassageiroResource {

    @Autowired
    private PassageiroRepository repo;

    @GetMapping(value = "/{id}")
    public Passageiro findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }
    @GetMapping
    public List<Passageiro> findAll() {
        return repo.findAll();
    }

    @Transactional
    @PostMapping
    public Passageiro save(@RequestBody Passageiro p) {
        if(Objects.isNull(p)) return null;
        p.setId(null);
        return repo.save(p);

    }

}
