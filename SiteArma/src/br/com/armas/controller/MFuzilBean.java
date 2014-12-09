package br.com.armas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;


import br.com.armas.dao.CarrinhoDao;
import br.com.armas.dao.FuzilDao;
import br.com.armas.entity.Carrinho;
import br.com.armas.entity.Fuzil;

@ManagedBean(name="mFuzilBean")
public class MFuzilBean {
	private List<Fuzil> fuzis = new ArrayList<Fuzil>();
	private Fuzil fuzil = new Fuzil();
	

	
	
	
	public void removerFuzil(Fuzil v){
		FuzilDao.removerFuzil(v);
	}
	
	/**
	public void gravarAK47(){
		Carrinho ak47 = new Carrinho();
		
		System.out.println("GRAVARAK47!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		ak47.setCano("longo");
		ak47.setFabricante("kalashnikov");
		ak47.setModelo("AK-47");
		ak47.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(ak47);
		
	}**/
	
	public void gravarM4A1(){
		Carrinho m4a1 = new Carrinho();
		
		System.out.println("GRAVARAM4A1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		m4a1.setCano("longo");
		m4a1.setFabricante("kalashnikov");
		m4a1.setModelo("M4-A1");
		m4a1.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(m4a1);
		
	}
	
	public void gravarM4(){
		Carrinho m4 = new Carrinho();
		
		System.out.println("GRAVARAR M4!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		m4.setCano("longo");
		m4.setFabricante("kalashnikov");
		m4.setModelo("M4");
		m4.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(m4);
		
	}
	
	
	
	
	public void gravarFuzil(Fuzil p) {
	   

		FuzilDao.gravarFuzil(p);
	}

	public List<Fuzil> getFuzis() {
		return FuzilDao.listarFuzis();
	}

	public void setFuzis(List<Fuzil> fuzis) {
		this.fuzis = fuzis;
	}

	public Fuzil getFuzil() {
		return fuzil;
	}

	public void setFuzil(Fuzil fuzil) {
		this.fuzil = fuzil;
	}

}
