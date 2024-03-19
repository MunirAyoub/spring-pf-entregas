package br.com.fiap.springpfentregas.repository;

import org.springframework.stereotype.Repository;
import br.com.fiap.springpfentregas.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}