package com.dev.Pedro.APIMercadinho.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name = "Produto")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Produtos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	long id;
	int codigoDeBarras;
	double peso;
	String nomeDoProduto;
	boolean perecivel;
	

}
