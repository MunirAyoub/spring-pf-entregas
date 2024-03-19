package br.com.fiap.springpfentregas.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Objects;
import br.com.fiap.springpfentregas.entity.Pessoa;
import br.com.fiap.springpfentregas.repository.PessoaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaResource {

    @Autowired
    private PessoaRepository repo;

    @GetMapping(value = "/{id}")
    public Pessoa findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }
    @GetMapping
    public List<Pessoa> findAll() {
        return repo.findAll();
    }

    @Transactional
    @PostMapping
    public Pessoa save(@RequestBody Pessoa p) {
        if(Objects.isNull(p)) return null;
        p.setId(null);

        return repo.save(p);

    }

}
