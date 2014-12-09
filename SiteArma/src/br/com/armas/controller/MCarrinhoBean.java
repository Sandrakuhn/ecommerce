package br.com.armas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.armas.dao.CarrinhoDao;
import br.com.armas.entity.Armas;
import br.com.armas.entity.Carrinho;
import br.com.armas.entity.Fuzil;


@ManagedBean
public class MCarrinhoBean {
	
	private List<Carrinho> carrinhos = new ArrayList<Carrinho>();
	private Carrinho carrinho = new Carrinho();
	
	
	
	
	public void AdicionarProdudutoAoCarrinho(Carrinho c){
		
		CarrinhoDao.AdicionarProdudutoAoCarrinho(c);
	}
	
	public void ListarProdutosDoCarrinho(){
		CarrinhoDao.ListarProdutosDoCarrinho();
	}
	
	public void excluir(Carrinho c){
		CarrinhoDao.excluir(c);
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public List<Carrinho> getCarrinhos() {
		return CarrinhoDao.ListarProdutosDoCarrinho();
	}

	public void setCarrinhos(List<Carrinho> carrinhos) {
		this.carrinhos = carrinhos;
	}

}
