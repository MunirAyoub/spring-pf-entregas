package br.com.fiap.springpfentregas.repository;

import org.springframework.stereotype.Repository;
import br.com.fiap.springpfentregas.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}