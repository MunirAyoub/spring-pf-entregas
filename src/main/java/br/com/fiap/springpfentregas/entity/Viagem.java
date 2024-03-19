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
@Table(name = "TB_VIAGEM")
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "" )

    @Column(name = "ID_VIAGEM")
    private Long id;




}
