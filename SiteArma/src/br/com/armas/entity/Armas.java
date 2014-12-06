package br.com.armas.entity;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorType;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="ARMAS")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="FROM_CLASS", discriminatorType=DiscriminatorType.STRING)



public abstract class Armas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private double calibre;
	private String tipo; /* para ver se é automática - semi automática*/
	private String fabricante;
	private String cano; /* cano curto cano longo*/
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getCalibre() {
		return calibre;
	}
	public void setCalibre(double calibre) {
		this.calibre = calibre;
	}
	

}
