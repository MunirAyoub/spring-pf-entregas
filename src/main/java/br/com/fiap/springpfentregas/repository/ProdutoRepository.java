package br.com.fiap.springpfentregas.repository;

import org.springframework.stereotype.Repository;
import br.com.fiap.springpfentregas.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}