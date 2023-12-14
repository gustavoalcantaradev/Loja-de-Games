package com.generation.lojadegames.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")	
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Informe o nome do Jogo!")
	@Size(min = 5, max = 40, message = "O nome do Jogo deve ter no minimo 5 e no maximo 40 caracteres.")
	@Column(length = 40)
	private String nome;
	
	@NotBlank(message = "Informe a descrição do Jogo!")
	@Size(min = 5, max = 40, message = "A descrição do Jogo deve ter no minimo 5 e no maximo 40 caracteres.")
	@Column(length = 40)
	private String descricaoJogo;
	
	@NotNull(message = "O Atributo valor é obrigatório")
	private float valor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricaoJogo() {
		return descricaoJogo;
	}

	public void setDescricaoJogo(String descricaoJogo) {
		this.descricaoJogo = descricaoJogo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
