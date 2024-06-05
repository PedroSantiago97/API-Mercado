package com.dev.Pedro.APIMercadinho.repository;

import org.springframework.data.jpa.repository.*;
import com.dev.Pedro.APIMercadinho.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

}
