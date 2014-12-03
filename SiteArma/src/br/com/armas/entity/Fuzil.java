package br.com.armas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Fuzil extends Armas {
	@Id
	@GeneratedValue
	private String modelo; /* 12, 38, 42, AR-15) */
	@ManyToOne
	private Armas arma;

	
	public Fuzil(String modelo, double calibre, String tipo, String fabricante,
			String cano, String categoria) {
		super(calibre, tipo, fabricante, cano);
		this.modelo = modelo;
	}

	public Fuzil() {
		// TODO Auto-generated constructor stub
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Armas getArma() {
		return arma;
	}

	public void setArma(Armas arma) {
		this.arma = arma;
	}

}
