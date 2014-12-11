package br.com.armas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.armas.dao.CarrinhoDao;
import br.com.armas.dao.PistolaDao;
import br.com.armas.entity.Pistola;
import br.com.armas.dao.FuzilDao;
import br.com.armas.entity.Armas;
import br.com.armas.entity.Carrinho;
import br.com.armas.entity.Fuzil;


@ManagedBean
public class MPistolaBean {
	
	private List<Pistola> pistolas = new ArrayList<Pistola>();
	private Pistola Pistola = new Pistola();

	
	public void gravarPistola9(){
		Carrinho pistola9 = new Carrinho();
		
		System.out.println("GRAVARAKPistola 9!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		pistola9.setCano("longo");
		pistola9.setFabricante("kalashnikov");
		pistola9.setModelo("Pistola-9");
		pistola9.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(pistola9);
		
	}
	
	public void gravarPistola380(){
		Carrinho pistola380 = new Carrinho();
		
		System.out.println("GRAVARAKPistola380!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		pistola380.setCano("longo");
		pistola380.setFabricante("kalashnikov");
		pistola380.setModelo("Pistola-380");
		pistola380.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(pistola380);
		
	}
	public void gravarPistolababy(){
		Carrinho pistolababy = new Carrinho();
		
		System.out.println("GRAVARAKPistolababy!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		pistolababy.setCano("longo");
		pistolababy.setFabricante("kalashnikov");
		pistolababy.setModelo("Pistola-Baby");
		pistolababy.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(pistolababy);
		
	}
	
	public void gravarPistolaberetta(){
		Carrinho pistolaberetta = new Carrinho();
		
		System.out.println("GRAVARAKPistolaberetta!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		 pistolaberetta.setCano("longo");
		 pistolaberetta.setFabricante("kalashnikov");
		 pistolaberetta.setModelo("Pistola-Beretta");
		 pistolaberetta.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(pistolaberetta);
		
	}
	
	public void gravarPistolaluger(){
		Carrinho pistolaluger = new Carrinho();
		
		System.out.println("GRAVARAKPistolaluger!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		pistolaluger.setCano("longo");
		pistolaluger.setFabricante("kalashnikov");
		pistolaluger.setModelo("Pistola-luger");
		pistolaluger.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(pistolaluger);
		
	}
	
	public void gravarPistolaeagle(){
		Carrinho pistolaeagle = new Carrinho();
		
		System.out.println("GRAVARAKPistolaeagle!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		pistolaeagle.setCano("longo");
		pistolaeagle.setFabricante("kalashnikov");
		pistolaeagle.setModelo("Pistola-Eagle");
		pistolaeagle.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(pistolaeagle);
		
	}
	
	public void gravarPistolakan(){
		Carrinho pistolakan = new Carrinho();
		
		System.out.println("GRAVARAKPistolaKan!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		pistolakan.setCano("longo");
		pistolakan.setFabricante("kalashnikov");
		pistolakan.setModelo("Pistola-Kan");
		pistolakan.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(pistolakan);
		
	}
	
	public void gravarPistola19(){
		Carrinho pistola19 = new Carrinho();
		
		System.out.println("GRAVARAKPistola19!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		pistola19.setCano("longo");
		pistola19.setFabricante("kalashnikov");
		pistola19.setModelo("Pistola-19");
		pistola19.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(pistola19);
		
	}
	
	public void gravarPistola(Pistola p) {
		PistolaDao.gravarPistola(p);
	}

	public List<Pistola> getPistolas() {
		return PistolaDao.listarPistolas();
	}

	public Pistola getPistola() {
		return Pistola;
	}

	public void setPistola(Pistola pistola) {
		this.Pistola = pistola;
	}

	public void setPistolas(List<Pistola> pistolas) {
		this.pistolas = pistolas;
	}

}
