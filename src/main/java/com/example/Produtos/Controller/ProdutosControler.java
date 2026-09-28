package com.example.Produtos.Controller;

import com.example.Produtos.Entity.Produtos;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Produtos.service.ProdutosService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ProdutosControler {

    @GetMapping("/listar")
    public ResponseEntity<List<Produtos>> listar(Produtos produto){
        List<Produtos> produtos = new ArrayList<>();
        ProdutosService produtosService = new ProdutosService();
        return ResponseEntity.ok(produtosService.lista(produtos);
    }

}
