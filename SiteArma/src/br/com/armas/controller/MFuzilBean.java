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
	
	
	public void gravarFuzilak105(){
		Carrinho fuzilak105 = new Carrinho();
		
		System.out.println("GRAVARAK105!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		fuzilak105.setCano("longo");
		fuzilak105.setFabricante("kalashnikov");
		fuzilak105.setModelo("AK-105");
		fuzilak105.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(fuzilak105);
		
	}
	
	public void gravarFuzilm4a1(){
		Carrinho m4a1 = new Carrinho();
		
		System.out.println("GRAVARAM4A1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		m4a1.setCano("longo");
		m4a1.setFabricante("kalashnikov");
		m4a1.setModelo("M4-A1");
		m4a1.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(m4a1);
		
	}
	
	public void gravarFuzilm4(){
		Carrinho m4 = new Carrinho();
		
		System.out.println("GRAVARAR M4!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		m4.setCano("longo");
		m4.setFabricante("kalashnikov");
		m4.setModelo("M4");
		m4.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(m4);
		
	}
	
	public void gravarFuzilfamas(){
		Carrinho famas = new Carrinho();
		
		System.out.println("GRAVARAfamas!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		famas.setCano("longo");
		famas.setFabricante("kalashnikov");
		famas.setModelo("Famas");
		famas.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(famas);
		
	}
	
	public void gravarFuzilfn2000(){
		Carrinho fn2000 = new Carrinho();
		
		System.out.println("GRAVARAfn2000!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		fn2000.setCano("longo");
		fn2000.setFabricante("kalashnikov");
		fn2000.setModelo("Fn2000");
		fn2000.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(fn2000);
		
	}
	
	public void gravarFuzilfnscarl(){
		Carrinho fnscarl = new Carrinho();
		
		System.out.println("GRAVARAfnscarl!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		fnscarl.setCano("longo");
		fnscarl.setFabricante("kalashnikov");
		fnscarl.setModelo("FNSCarL");
		fnscarl.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(fnscarl);
		
	}
	
	public void gravarFuzilhk416(){
		Carrinho hk416 = new Carrinho();
		
		System.out.println("GRAVARAhk416!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		hk416.setCano("longo");
		hk416.setFabricante("kalashnikov");
		hk416.setModelo("HK416");
		hk416.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(hk416);
		
	}
	public void gravarFuzilhk417(){
		Carrinho hk417 = new Carrinho();
		
		System.out.println("GRAVARAhk417!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		hk417.setCano("longo");
		hk417.setFabricante("kalashnikov");
		hk417.setModelo("HK417");
		hk417.setTipo("Semi-Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(hk417);
		
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
