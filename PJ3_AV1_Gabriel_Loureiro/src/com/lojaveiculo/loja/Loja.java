package com.lojaveiculo.loja;

import java.io.Serializable;
import java.util.ArrayList;

import com.lojaveiculo.veiculo.Veiculo;

public class Loja implements Serializable {
	
	private static final long serialVersionUID = 1948685044103125308L;
	private String Endereco;
	private String Nome;
	private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(ArrayList<Veiculo> veiculos2) {
		veiculos = veiculos2;
	}

	public Loja() {
		
	}
	
	public Loja(String endereco, String nome){
		this.setEndereco(endereco);
		this.setNome(nome);
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public String toString() {
		return "Loja [Endereco=" + Endereco + ", Nome=" + Nome + "]";
	}
}
