package br.com.fiap.springpfentregas.repository;

import org.springframework.stereotype.Repository;
import br.com.fiap.springpfentregas.entity.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {

}