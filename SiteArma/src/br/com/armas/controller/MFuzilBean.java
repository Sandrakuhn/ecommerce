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
