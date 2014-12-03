package br.com.armas.entity;

public class Metralhadora extends Armas {
	private String modelo; /* 12, 38, 42, AR-15)*/
	
	public Metralhadora(String modelo, double calibre, String tipo, String fabricante, String cano, String categoria)	{
		super(calibre, tipo,fabricante,cano);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
