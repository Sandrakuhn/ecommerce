package br.com.armas.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.armas.dao.BazookaDao;
import br.com.armas.entity.Bazooka;

public class MBazookaBean {

	public List<Bazooka> bazookas = new ArrayList<Bazooka>();
	
	private Bazooka bazooka = new Bazooka();
	
	
	public void gravarBazooka(Bazooka b){
		BazookaDao.gravarBazooka(b);
	}
	
	public void listarBazooka(){
		BazookaDao.listarBazooka();
	}
	
	
	

	public List<Bazooka> getBazookas() {
		return bazookas;
	}

	public void setBazookas(List<Bazooka> bazookas) {
		this.bazookas = bazookas;
	}

	public Bazooka getBazooka() {
		return bazooka;
	}

	public void setBazooka(Bazooka bazooka) {
		this.bazooka = bazooka;
	}
	
	
	
	
	
}
