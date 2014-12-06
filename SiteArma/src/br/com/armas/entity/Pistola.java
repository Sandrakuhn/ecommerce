package br.com.armas.entity;

import javax.persistence.Entity;


@Entity
public class Pistola extends Armas {

	
	private String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
