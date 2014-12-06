package br.com.armas.entity;



import javax.persistence.Entity;


import br.com.armas.entity.Armas;


@Entity
public class Carrinho extends Armas{
	
	private String modelo;
	


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
}
