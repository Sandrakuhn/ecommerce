package br.com.armas.entity;

public class Armas extends Categoria {
	
	private double calibre;
	private String tipo; /* para ver se é automática - semi automática*/
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
