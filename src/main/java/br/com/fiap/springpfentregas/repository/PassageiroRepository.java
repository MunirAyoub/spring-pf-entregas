package br.com.fiap.springpfentregas.repository;

import org.springframework.stereotype.Repository;
import br.com.fiap.springpfentregas.entity.Passageiro;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PassageiroRepository extends JpaRepository<Passageiro, Long> {

}