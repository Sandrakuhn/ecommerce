package br.com.armas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.armas.dao.ContatoDao;
import br.com.armas.entity.Contato;


@ManagedBean
public class MContatoBean {
	
	private List<Contato> contatos = new ArrayList<Contato>();
	private Contato contato = new Contato();
	
	
	
	
	public void gravarContato(Contato v){
		ContatoDao.gravarContato(v);
	}




	public List<Contato> getContatos() {
		return ContatoDao.listarContatos();
	}




	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}




	public Contato getContato() {
		return contato;
	}




	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	

	
	
}
