package br.com.fiap.springpfentregas.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table (name = "TB_PESSOA")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_PESSOA")
    @SequenceGenerator(
            name = "SQ_PESSOA",
            sequenceName = "SQ_PESSOA",
            initialValue = 1,
            allocationSize = 1
    )

    @Column(name = "ID_PESSOA")
    private Long Id;

    @Column(name = "ID_NOME")
    private String nome;

    @Column(name = "ID_PESSOA")
    private String email;

}
