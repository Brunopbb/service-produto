package com.almeida.bruno.serviceproduto.controller;

import com.almeida.bruno.serviceproduto.model.Produto;
import com.almeida.bruno.serviceproduto.request.RequestPostProduto;
import com.almeida.bruno.serviceproduto.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {


    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody RequestPostProduto requestPostProduto){
        return new ResponseEntity<>(produtoService.salvar(requestPostProduto), HttpStatus.OK);
    }

}
