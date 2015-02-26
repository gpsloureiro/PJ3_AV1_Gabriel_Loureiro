package com.lojaveiculo.veiculo;

import java.io.Serializable;

public class Moto implements Serializable{
	
	private static final long serialVersionUID = 4568600111081886572L;
	private String Chassi, Montadora, Modelo, Tipo, Cor;
	private int Cilindrada, Capacidade;
	private float Preco;

	public Moto() {
		
	}
	
	public Moto(String chassi, String montadora, String modelo, String tipo, 
			    String cor, int cilindrada, int capacidade, float preco){
		this.setChassi(chassi);
		this.setMontadora(montadora);
		this.setModelo(modelo);
		this.setTipo(tipo);
		this.setCor(cor);
		this.setCilindrada(cilindrada);
		this.setCapacidade(capacidade);
		this.setPreco(preco);
	}

	public String getChassi() {
		return Chassi;
	}

	public void setChassi(String chassi) {
		Chassi = chassi;
	}

	public String getMontadora() {
		return Montadora;
	}

	public void setMontadora(String montadora) {
		Montadora = montadora;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public int getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}

	public int getCapacidade() {
		return Capacidade;
	}

	public void setCapacidade(int capacidade) {
		Capacidade = capacidade;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}

	@Override
	public String toString() {
		return "Moto [Chassi=" + Chassi + ", Montadora=" + Montadora
				+ ", Modelo=" + Modelo + ", Tipo=" + Tipo + ", Cor=" + Cor
				+ ", Cilindrada=" + Cilindrada + ", Capacidade=" + Capacidade
				+ ", Preco=" + Preco + "]";
	}
	
	
}
