package br.com.fiap.springpfentregas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_PASSAGEIRO")

public class Passageiro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_PASSAGEIRO")
    @SequenceGenerator(
            name = "SQ_PASSAGEIRO",
            sequenceName = "SQ_PASSAGEIRO",
            initialValue = 1,
            allocationSize = 1
    )

    @Column(name = "ID PASSAGEIRO")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_PESSOA_PASSAGEIRO",
            referencedColumnName = "ID_PESSOA",
            foreignKey = @ForeignKey(name = "FK_PESSOA_PASSAGEIRO")
    )

    private Pessoa pessoa;
}
