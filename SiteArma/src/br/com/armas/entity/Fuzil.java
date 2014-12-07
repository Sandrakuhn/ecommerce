package br.com.armas.entity;

import javax.persistence.Entity;



@Entity
public class Fuzil extends Armas {

	private String modelo; /* 12, 38, 42, AR-15) */

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	



}
