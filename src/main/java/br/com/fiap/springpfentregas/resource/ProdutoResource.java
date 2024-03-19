package br.com.fiap.springpfentregas.resource;

import java.util.List;
import java.util.Objects;

import br.com.fiap.springpfentregas.entity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import br.com.fiap.springpfentregas.entity.Produto;
import br.com.fiap.springpfentregas.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {

    @Autowired
    private ProdutoRepository repo;

    @GetMapping(value = "/{id}")
    public Produto findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }
    @GetMapping
    public List<Produto> findAll() {
        return repo.findAll();
    }

    @Transactional
    @PostMapping
    public Produto save(@RequestBody Produto p) {
        if(Objects.isNull(p)) return null;
        p.setId(null);
        return repo.save(p);
    }

}
