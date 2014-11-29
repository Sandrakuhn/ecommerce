package br.com.armas.entity;

public class Categoria {
	/*private Armas arma;
	private Equipamentos equipamento;
	private Municao municao;*/
	
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
