package com.lojaveiculo.veiculo;

import java.io.Serializable;

public class Carro implements Serializable{
	
	private static final long serialVersionUID = 5611515966235758563L;
	private String Chassi, Montadora, Tipo, Cor, Cambio, Modelo;
	private float Motorizacao, Preco;

	public Carro() {
		
	}
	
	public Carro(String chassi, String montadora, String modelo, String tipo, String cor, String cambio, float motorizacao, float preco){
		this.setChassi(chassi);
		this.setMontadora(montadora);
		this.setModelo(modelo);
		this.setTipo(tipo);
		this.setCor(cor);
		this.setCambio(cambio);
		this.setMotorizacao(motorizacao);
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

	public String getCambio() {
		return Cambio;
	}

	public void setCambio(String cambio) {
		Cambio = cambio;
	}

	public float getMotorizacao() {
		return Motorizacao;
	}

	public void setMotorizacao(float motorizacao) {
		Motorizacao = motorizacao;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}

	@Override
	public String toString() {
		return "Carro [Chassi=" + Chassi + ", Montadora=" + Montadora
				+ ", Tipo=" + Tipo + ", Cor=" + Cor + ", Cambio=" + Cambio
				+ ", Modelo=" + Modelo + ", Motorizacao=" + Motorizacao
				+ ", Preco=" + Preco + "]";
	}

}
