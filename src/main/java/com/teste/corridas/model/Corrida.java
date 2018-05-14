package com.teste.corridas.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Corrida extends EntidadeGenerica {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Motorista motorista;	
	@ManyToOne
	private Passageiro passageiro;
	private Double valor;

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
