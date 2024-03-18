package br.com.fiap.springpfentregas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_ENDERECO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Endereco {

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "RG_ENDERECO")
    @SequenceGenerator(
            name = "RG_ENDERECO",
            sequenceName = "RG_ENDERECO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_ENDERECO")
    private Long id;

    @Column(name = "CEP_ENDERECO")
    private String cep;

    @Column(name = "NR_ENDERECO")
    private String numero;

    @Column(name = "COMPL_ENDERECO")
    private String complemento;

}
