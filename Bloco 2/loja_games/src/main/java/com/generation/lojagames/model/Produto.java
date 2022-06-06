package com.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produtos")

public class Produto {
	
	@id
	@generaitedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(Menssagem="o atributo é prenchimento obrigatorio e não aceita espaço em branco")
	@Size(min=5,max=40)
	private String nome;
	
	@NotNull
	private double preco;
	@NotBlank(Menssagem="o atributo aceita no minimo 5 e no maximo 500 caracteres")
	@Size(min=5,max=500)
	
	private String descricao;
	@NotBlank(Menssagem="o atributo é prenchimento obrigatorio e não aceita espaço em branco")
	@Size(min=5,max=40)
	private String plataforma;
	@NotNull(menssagem="o atributo é de preenchimento obrigatorio")
	private int quantidade;
	
	
	@NotBlank(Menssagem="o atributo é prenchimento obrigatorio e não aceita espaço em branco")
	@Size(max=50)
	private String foto;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	

}
