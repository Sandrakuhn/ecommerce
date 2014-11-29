package br.com.armas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Categoria {

	
	@Id
	@GeneratedValue
	public int Id;
	public String categoria;

	
	public Categoria(String categoria){
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}

	private void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
