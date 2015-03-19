package com.lojaveiculo.controller;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Veiculo;
import com.lojaveiculo.controller.CadastrarLoja;
import com.lojaveiculo.controller.AdicionarCarro;
import com.lojaveiculo.controller.AdicionarMoto;
import com.lojaveiculo.controller.BuscaCarro;
import com.lojaveiculo.dao.EstoqueDAO;

public class GerenciadorLoja {
	
	Loja loja = new Loja();
	Veiculo veiculo;
	
	public void cadastrarLoja(){
		
		CadastrarLoja adlojas = new CadastrarLoja();
		adlojas.addLoja(loja);
		
	}
	
	public void adicionarCarro(){
		
		AdicionarCarro adCarro = new AdicionarCarro();
		adCarro.addCarro(loja, veiculo);
		
	}
	
	public void adicionarMoto(){
		
		AdicionarMoto adMoto = new AdicionarMoto();
		adMoto.addMoto(loja, veiculo);
		
	}
	
	public void buscaCarro(){
		
		BuscaCarro bCarro = new BuscaCarro();
		bCarro.pesquisaCarro(loja);
		
	}
	
	public void buscarMoto(){
		
		BuscaMoto bMoto = new BuscaMoto();
		bMoto.pesquisaMoto(loja);
		
	}
	
	public void buscarCarroChassi(){
		
		BuscarCarroChassi bCarroChassi = new BuscarCarroChassi();
		bCarroChassi.pesquisaCarroChassi(loja);
		
	}
	
    public void buscarMotoChassi(){
		
		BuscarMotoChassi bMotoChassi = new BuscarMotoChassi();
		bMotoChassi.pesquisaMotoChassi(loja);
		
	}
    
    public void listaEstoque(boolean type){
    	
    	ListarEstoque listar = new ListarEstoque();
    	listar.listarEstoque(loja, type);
    	
    }
    
    public void Menu(){
    	
    	System.out.println("***************************************************");
		System.out.println("**                                               **");
		System.out.println("**           1 - Adicionar Carro                 **");
		System.out.println("**           2 - Adicionar Moto                  **");
		System.out.println("**           3 - Pesquisa Carro                  **");
		System.out.println("**           4 - Pesquisa Moto                   **");
		System.out.println("**           5 - Pesquisa Carro pelo Chassi      **");
		System.out.println("**           6 - Pesquisa Moto pelo Chassi       **");
		System.out.println("**           7 - Listar Estoque Carro            **");
		System.out.println("**           8 - Listar Estoque Moto             **");
		System.out.println("**           9 - Sair                            **");
		System.out.println("**                                               **");
		System.out.println("***************************************************");
		
    }
    
    public void estoqueSalva(){
    	
    	EstoqueDAO arquivo = new EstoqueDAO();
    	arquivo.salvarEstoque(loja);
    	
    }
    
    public void estoqueRecupera(){
    	
    	EstoqueDAO arquivo = new EstoqueDAO();
    	loja = arquivo.recuperarEstoque();
    	
    }

}
