package com.almeida.bruno.serviceproduto.request;

import java.math.BigDecimal;

public class RequestPostProduto {


    private String descricao;
    private BigDecimal valor;

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
