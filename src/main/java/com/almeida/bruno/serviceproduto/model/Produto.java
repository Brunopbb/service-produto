package com.almeida.bruno.serviceproduto.model;


import jakarta.persistence.*;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.Objects;

@Entity

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Descricao", length = 100, nullable = false)
    private final String descricao;
    @Column(name = "Valor", nullable = false)
    private final BigDecimal valor;

    public Produto(@NonNull String descricao, @NonNull BigDecimal valor){
        this.descricao = Objects.requireNonNull(descricao);
        this.valor = Objects.requireNonNull(valor);
    }


    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
