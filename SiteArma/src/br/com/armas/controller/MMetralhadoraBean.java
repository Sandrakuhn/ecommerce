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
	
	public void gravarBrownining(){
		Carrinho brownining = new Carrinho();
		
		System.out.println("GRAVARmetralhadorabrownining!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		brownining.setCano("longo");
		brownining.setFabricante("kalashnikov");
		brownining.setModelo("Browning");
		brownining.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(brownining);
		
	}
	
	public void gravarFnm249(){
		Carrinho fnm249 = new Carrinho();
		
		System.out.println("GRAVARmetralhadorafnm249!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		fnm249.setCano("longo");
		fnm249.setFabricante("kalashnikov");
		fnm249.setModelo("FNM-249");
		fnm249.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(fnm249);
		
	}
	
	public void gravarGiratoria(){
		Carrinho giratoria = new Carrinho();
		
		System.out.println("GRAVARgiratoria!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		giratoria.setCano("longo");
		giratoria.setFabricante("kalashnikov");
		giratoria.setModelo("Giratoria");
		giratoria.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(giratoria);
		
	}
	
	public void gravarModel(){
		Carrinho model = new Carrinho();
		
		System.out.println("GRAVARmodel!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		model.setCano("longo");
		model.setFabricante("kalashnikov");
		model.setModelo("Model");
		model.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(model);
		
	}
	
	public void gravarMp5(){
		Carrinho mp5 = new Carrinho();
		
		System.out.println("GRAVARMP5!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		mp5.setCano("longo");
		mp5.setFabricante("kalashnikov");
		mp5.setModelo("MP5");
		mp5.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(mp5);
		
	}
	public void gravarsofber406(){
		Carrinho sofber406 = new Carrinho();
		
		System.out.println("GRAVARsofber406!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		sofber406.setCano("longo");
		sofber406.setFabricante("kalashnikov");
		sofber406.setModelo("Sofber-406");
		sofber406.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(sofber406);
		
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
