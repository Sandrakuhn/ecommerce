package br.com.armas.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class Bazooka {
	@Id
	@GeneratedValue
	private int id;
	private double calibre;
	private String tipo; /* para ver se é automática - semi automática*/
	private String fabricante;
	private String cano; /* cano curto cano longo*/
	private String modelo;
	
	
	
	public int getId() {
		return id;
	}
public void setId(int id) {
		this.id = id;
	}
	public double getCalibre() {
		return calibre;
	}
	public void setCalibre(double calibre) {
		this.calibre = calibre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCano() {
		return cano;
	}
	public void setCano(String cano) {
		this.cano = cano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
