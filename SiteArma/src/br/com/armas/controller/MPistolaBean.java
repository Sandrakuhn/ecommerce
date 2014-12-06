package br.com.armas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.armas.dao.PistolaDao;
import br.com.armas.entity.Pistola;


@ManagedBean
public class MPistolaBean {
	
	private List<Pistola> Pistolas = new ArrayList<Pistola>();
	private Pistola Pistola = new Pistola();
	private int armaId;

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
		this.Pistolas = pistolas;
	}

}
