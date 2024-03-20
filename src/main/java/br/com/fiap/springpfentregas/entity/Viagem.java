package br.com.fiap.springpfentregas.entity;

import java.util.List;
import java.util.Set;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.LinkedHashSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_VIAGEM")
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "" )
    @SequenceGenerator(
            name = "SQ_VIAGEM",
            sequenceName = "SQ_VIAGEM",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_VIAGEM")
    private Long id;


    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "TB_CP_PASSAGEIROS",
            joinColumns = {
                    @JoinColumn(
                            name = "VIAGEM",
                            referencedColumnName = "ID_VIAGEM",
                            foreignKey = @ForeignKey(
                                    name = "FK_PASSAGEIRO_VIAGEM"
                            )
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "PASSAGEIRO",
                            referencedColumnName = "ID_PASSAGEIRO",
                            foreignKey = @ForeignKey(
                                    name = "FK_VIAGEM_PASSAGEIRO"
                            )
                    )
            }

    )
    private Set<Passageiro> passageiros = new LinkedHashSet<>();

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "TB_CP_PRODUTOS",
            joinColumns = {
                    @JoinColumn(
                            name = "VIAGEM",
                            referencedColumnName = "ID_VIAGEM",
                            foreignKey = @ForeignKey(
                                    name = "FK_PRODUTOS_VIAGEM"
                            )

                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "PRODUTO",
                            referencedColumnName = "ID_PRODUTO",
                            foreignKey = @ForeignKey(
                                    name = "FK_VIAGEM_PRODUTOS"
                            )
                    )
            }
    )
    private List<Produto> produtos = new ArrayList<>();


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "TB_PESSOA",
            referencedColumnName = "ID_PESSOA",
            foreignKey = @ForeignKey(
                    name = "FK_PESSOA_VIAGEM"
            )
    )

    private Pessoa cliente;

    @ManyToOne
    @JoinColumn(name = "ID_DESTINO",
            referencedColumnName = "ID_ENDERECO",
            foreignKey = @ForeignKey(name = "FK_VIAGEM_DESTINO")
    )

    private Endereco destino;

    @ManyToOne
    @JoinColumn(name = "ID_ORIGEM",
            referencedColumnName = "ID_ENDERECO",
            foreignKey = @ForeignKey(name = "FK_VIAGEM_ORIGEM")
    )

    private Endereco origem;

    @Column(name = "SAIDA")
    private LocalDateTime saida;

    @Column(name = "CHEGADA")
    private LocalDateTime chegada;


}
