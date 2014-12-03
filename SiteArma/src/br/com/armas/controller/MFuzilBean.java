package br.com.armas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.armas.dao.FuzilDao;
import br.com.armas.entity.Armas;
import br.com.armas.entity.Fuzil;

@ManagedBean
public class MFuzilBean {
	 private List<Fuzil> fuzis = new ArrayList<Fuzil>();
     private Fuzil fuzil = new Fuzil();
     private int armaId;
     
     

     private List<Armas> armas = new ArrayList<Armas>();
     
     public List<Armas> getMarcas(){
             return ArmasDAO.listarArmas();
     }
     

     public void gravarFuzil(Fuzil fuzil){
             
             Armas m = ArmasDAO.buscarArmasPorId(armaId);
             fuzil.setArma(m);
             FuzilDao.gravarFuzil(fuzil);
             
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

	public int getArmaId() {
		return armaId;
	}

	public void setArmaId(int armaId) {
		this.armaId = armaId;
	}

}
