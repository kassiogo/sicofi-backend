package com.kassiogo.sicofibackend.model;

import com.kassiogo.sicofibackend.enums.TipoCategoriaEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Categoria")
@Data
@NoArgsConstructor
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false, length = 500)
    private String nome;

    @Column(name = "tipoCategoria", nullable = false)
    private int tipoCategoria;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategoriaPai", referencedColumnName = "id")
    private Categoria categoriaPai;
}
