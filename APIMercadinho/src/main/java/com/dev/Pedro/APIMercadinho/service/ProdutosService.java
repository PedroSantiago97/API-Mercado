package com.dev.Pedro.APIMercadinho.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.Pedro.APIMercadinho.model.Produtos;
import com.dev.Pedro.APIMercadinho.repository.ProdutosRepository;

@Service
public class ProdutosService {
	
	@Autowired
	private ProdutosRepository repo;
	
	//Adiconar um novo produto ao estoque
	public Produtos addProduto(Produtos produto) {
		return repo.save(produto);
		
	}
	
	//Mostrar estoque de produtos
	
	public List<Produtos> getAllProdutos(){
		return repo.findAll();
	}
	//Mostrar produtos por ID
	public Optional<Produtos> getProdutosId(Long id){
		return repo.findById(id);
	}
	
	//Deletar produto
	public void deleteProdutos(Long id) {
		repo.deleteById(id);
		
	}
	//Atualizar produto
	
	

}
