package com.teste.corridas.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Motorista extends EntidadeGenerica {

	private static final long serialVersionUID = 1L;

	@NotNull
	private Long cpf;

	@NotNull
	private String nome;

	@NotNull
	private Date dataNascimento;

	@NotNull
	private String sexo;

	@NotNull
	private String modeloCarro;

	@NotNull
	private String status;

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
