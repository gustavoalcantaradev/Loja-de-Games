package com.generation.lojadegames.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Informe o nome da Categoria!")
	@Size(min = 1, max = 20, message = "O nome da categoria deve ter no minimo 5  e no maximo 20 caracteres.")
	@Column(length = 20)
	private String tipo;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return tipo;
	}

	public void setNome(String nome) {
		this.tipo = nome;
	}
	
}
