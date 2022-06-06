package com.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name= "tb_categorias")
public class Categoria {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull(message ="o atributo descricao não pode ser nulo")
	@Size(max=50,message = "no maximo 50 caracteres")
	private String descricão;
	@OneToMany(mappedBy = "categoria",cascade= CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	@Size(max=50,message = "no maximo 50 caracteres")
	private String classficacão;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricão() {
		return descricão;
	}
	public void setDescricão(String descricão) {
		this.descricão = descricão;
	}
	
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	public String getClassficacão() {
		return classficacão;
	}
	public void setClassficacão(String classficacão) {
		this.classficacão = classficacão;
	}
	
	
	

}
