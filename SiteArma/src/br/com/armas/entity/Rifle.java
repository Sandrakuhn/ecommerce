package br.com.armas.entity;

public class Rifle extends Armas{
	private String modelo; /* 12, 38, 42, AR-15)*/
	
	public Rifle(String modelo, double calibre, String tipo, String fabricante, String cano, String categoria)	{
		super(calibre, tipo,fabricante,cano, categoria);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

}
