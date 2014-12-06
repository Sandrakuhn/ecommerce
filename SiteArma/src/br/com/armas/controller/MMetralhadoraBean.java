package br.com.armas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.armas.dao.FuzilDao;
import br.com.armas.dao.MetralhadoraDao;
import br.com.armas.entity.Armas;
import br.com.armas.entity.Metralhadora;

@ManagedBean
public class MMetralhadoraBean {

	private List<Metralhadora> Metralhadoras = new ArrayList<Metralhadora>();
	private Metralhadora Metralhadora = new Metralhadora();
	private int armaId;

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
