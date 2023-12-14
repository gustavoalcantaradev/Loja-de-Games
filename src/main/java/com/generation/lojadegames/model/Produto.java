package com.generation.lojadegames.model;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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
	private String descricao;
	
	@NotNull(message = "A quantidade é obrigatorio!")
	private long quantidade;
	
	@NotNull(message = "O Atributo valor é obrigatório!")
	@Column(name="valor", precision=6, scale=2)
	@Positive (message = "O valor do preço deve ser algo positivo!")
	private BigDecimal valor;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
	
}
