package com.lojaveiculo.loja;

import java.io.Serializable;
import java.util.ArrayList;

import com.lojaveiculo.veiculo.Carro;
import com.lojaveiculo.veiculo.Moto;

public class Loja implements Serializable {
	
	private static final long serialVersionUID = 1948685044103125308L;
	private String Endereco, Nome;
	private ArrayList<Carro> Carros = new ArrayList<Carro>();
	private ArrayList<Moto> Motocicletas =  new ArrayList<Moto>();

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

	public ArrayList<Carro> getCarros() {
		return Carros;
	}

	public void setCarros(ArrayList<Carro> carros) {
		Carros = carros;
	}

	public ArrayList<Moto> getMotocicletas() {
		return Motocicletas;
	}

	public void setMotocicletas(ArrayList<Moto> motocicletas) {
		Motocicletas = motocicletas;
	}

	@Override
	public String toString() {
		return "Loja [Endereco=" + Endereco + ", Nome=" + Nome + ", Carros="
				+ Carros + ", Motocicletas=" + Motocicletas + "]";
	}
}
