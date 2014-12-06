package br.com.armas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.armas.dao.RevolverDao;
import br.com.armas.entity.Revolver;


@ManagedBean
public class MRevolverBean {
	
	private List<Revolver> Revolvers = new ArrayList<Revolver>();
	private Revolver Revolver = new Revolver();
	private int armaId;

	public void gravarRevolver(Revolver p) {
		RevolverDao.gravarRevolver(p);
	}

	public List<Revolver> getRevolvers() {
		return RevolverDao.listarRevolvers();
	}

	public Revolver getRevolver() {
		return Revolver;
	}

	public void setRevolver(Revolver revolver) {
		this.Revolver = revolver;
	}

	public void setRevolvers(List<Revolver> revolvers) {
		this.Revolvers = revolvers;
	}

}
