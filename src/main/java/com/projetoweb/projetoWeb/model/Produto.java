package com.projetoweb.projetoWeb.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Produto {
	
	@Id
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal valor;
	private String Imagem;
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getImagem() {
		return Imagem;
	}
	public void setImagem(String imagem) {
		Imagem = imagem;
	}
}
