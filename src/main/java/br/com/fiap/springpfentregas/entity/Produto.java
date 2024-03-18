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

    private Long Id;
    private String etiqueta;
    private String nome;
    private Float peso;
    private Float largura;
    private Float altura;
    private Float profundidade;
}
