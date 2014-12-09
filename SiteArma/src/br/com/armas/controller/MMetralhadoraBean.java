package br.com.armas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.armas.dao.CarrinhoDao;
import br.com.armas.dao.FuzilDao;
import br.com.armas.dao.MetralhadoraDao;
import br.com.armas.entity.Armas;
import br.com.armas.entity.Carrinho;
import br.com.armas.entity.Metralhadora;

@ManagedBean
public class MMetralhadoraBean {

	private List<Metralhadora> Metralhadoras = new ArrayList<Metralhadora>();
	private Metralhadora Metralhadora = new Metralhadora();
	private int armaId;

	
	
	public void gravarAK47(){
		Carrinho ak47 = new Carrinho();
		
		System.out.println("GRAVARAK47!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		ak47.setCano("longo");
		ak47.setFabricante("kalashnikov");
		ak47.setModelo("AK-47");
		ak47.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(ak47);
		
	}
	
	
	public void gravarNG7(){
		Carrinho ng7 = new Carrinho();
		
		System.out.println("GRAVARAK NG7!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		ng7.setCano("longo");
		ng7.setFabricante("kalashnikov");
		ng7.setModelo("NG-7");
		ng7.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(ng7);
		
	}
	
	
	public void gravarMetralhadora(Metralhadora p) {
		MetralhadoraDao.gravarMetralhadora(p);
	}

	public List<Metralhadora> getMetralhadoras() {
		return MetralhadoraDao.listarMetralhadoras();

	}

	public void setMetralhadoras(List<Metralhadora> metralhadoras) {
		this.Metralhadoras = metralhadoras;
	}

	public Metralhadora getMetralhadora() {
		return Metralhadora;
	}

	public void setMetralhadora(Metralhadora metralhadora) {
		this.Metralhadora = metralhadora;
	}

}
