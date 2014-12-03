package br.com.armas.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Armas {
	
	@Id
	@GeneratedValue
	private int id;
	private double calibre;
	private String tipo; /* para ver se é automática - semi automática*/
	private String fabricante;
	private String cano; /* cano curto cano longo*/
	
	@OneToMany
	private List<Fuzil> fuzis; 
	
	public Armas (){
		
	}
	
	
	public Armas(double calibre, String tipo, String fabricante, String cano){
		this.calibre = calibre;
		this.tipo = tipo;
		this.fabricante = fabricante;
		this.cano = cano;
		
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
