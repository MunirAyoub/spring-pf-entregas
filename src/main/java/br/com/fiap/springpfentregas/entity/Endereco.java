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
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_ENDERECO")
    @SequenceGenerator(
            name = "SQ_ENDERECO",
            sequenceName = "SQ_ENDERECO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_ENDERECO")
    private Long id;

    @Column(name = "NR_ENDERECO")
    private String numero;

    @Column(name = "CEP")
    private String cep;

    @Column(name = "COMPLEMENTO")
    private String complemento;


    @ManyToOne
    @JoinColumn(name = "ID_ENDERECO_PESSOA",
            referencedColumnName = "ID_PESSOA",
            foreignKey = @ForeignKey(name = "FK_PESSOA_ENDERECO")
    )

    private Pessoa pessoa;
}

