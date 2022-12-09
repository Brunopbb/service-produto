package com.almeida.bruno.serviceproduto.service;

import com.almeida.bruno.serviceproduto.model.Produto;
import com.almeida.bruno.serviceproduto.repository.ProdutoRepository;
import com.almeida.bruno.serviceproduto.request.RequestPostProduto;
import org.springframework.stereotype.Service;

@Service

public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public Produto salvar(RequestPostProduto requestPostProduto){
        Produto produto = new Produto(requestPostProduto.getDescricao(), requestPostProduto.getValor());
        return produtoRepository.save(produto);
    }

}
