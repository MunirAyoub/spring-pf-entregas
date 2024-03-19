package br.com.fiap.springpfentregas.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table (name = "TB_PRODUTO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_PRODUTO")
    @SequenceGenerator(
            name = "SQ_PRODUTO",
            sequenceName = "SQ_PRODUTO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_PRODUTO")
    private Long Id;

    @Column(name = "ETIQUETA_PRODUTO")
    private String etiqueta;

    @Column(name = "NM_PRODUTO")
    private String nome;

    @Column(name = "PESO_PRODUTO")
    private Float peso;

    @Column(name = "LARG_PRODUTO")
    private Float largura;

    @Column(name = "ALT_PRODUTO")
    private Float altura;

    @Column(name = "PRFND_PRODUTO")
    private Float profundidade;



}
