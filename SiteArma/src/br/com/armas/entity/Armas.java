package br.com.armas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Armas extends Categoria {
	
	@Id
	@GeneratedValue;
	private int id;
	private double calibre;
	private String tipo; /* para ver se � autom�tica - semi autom�tica*/
	private String fabricante;
	private String cano; /* cano curto cano longo*/
	
	public Armas(double calibre, String tipo, String fabricante, String cano, String categoria){
		super(categoria);
	}
	
	public double getCalibre() {
		return calibre;
	}
	private void setCalibre(double calibre) {
		this.calibre = calibre;
	}
	public String getTipo() {
		return tipo;
	}
	private void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFabricante() {
		return fabricante;
	}
	private void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCano() {
		return cano;
	}
	private void setCano(String cano) {
		this.cano = cano;
	}

	
	
	
	
	
	
	
	
	
	

}
