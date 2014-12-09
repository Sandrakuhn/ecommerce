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
		pistola9.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(pistola9);
		
	}
	
	public void gravarPistola380(){
		Carrinho pistola380 = new Carrinho();
		
		System.out.println("GRAVARAKPistola380!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		pistola380.setCano("longo");
		pistola380.setFabricante("kalashnikov");
		pistola380.setModelo("Pistola-380");
		pistola380.setTipo("Automática");
		CarrinhoDao.AdicionarProdudutoAoCarrinho(pistola380);
		
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
