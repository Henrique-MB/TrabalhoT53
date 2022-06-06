package com.generation.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

	public List<Produto> findAllByDescricãoContainingIgnoreCase(@Param("decricão") String decricão);
public List<Produto>findAllByMarcaContainingIgnoreCase(@Param("marca")String marca);
public List<Produto>findAllByContaCategoriainingIgnoreCase(@Param("categoria")String categoria);
}