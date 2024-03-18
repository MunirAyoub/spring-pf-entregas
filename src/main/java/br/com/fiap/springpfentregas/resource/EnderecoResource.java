package br.com.fiap.springpfentregas.resource;


import br.com.fiap.springpfentregas.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.list;


@RestController
@RequestMapping(value = "/endereco")
public class EnderecoResource {
    @Autowired
    private EnderecoRepository repo;

    @GetMapping
    public List<Endereco> findAll() {

    }
    }
