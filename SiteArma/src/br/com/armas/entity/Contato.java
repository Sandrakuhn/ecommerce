package br.com.armas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.armas.dao.ContatoDao;
import br.com.armas.dao.FuzilDao;

@Entity
public class Contato {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String Email;
	private String assunto;
	
	
	public Contato(){}
	
	
	public void gravarContato(Contato p) {
		ContatoDao.gravarContato(p);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	
	
}
