package com.dev.Pedro.APIMercadinho.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dev.Pedro.APIMercadinho.model.Produtos;
import com.dev.Pedro.APIMercadinho.service.ProdutosService;

@RestController
@RequestMapping("/api/produtos")

public class ProdutosController {
	
	@Autowired
	private ProdutosService service;
	
	@PostMapping("/addProduto")
	public ResponseEntity<Produtos> addProduto(@RequestBody Produtos produto) {
		Produtos novoProduto = service.addProduto(produto);
		return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Produtos>> getAllProdutos(){
		List<Produtos> allProdutos = service.getAllProdutos();
		return new ResponseEntity<>(allProdutos, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProdutos(@PathVariable Long id) {
		service.deleteProdutos(id);
	}

}
