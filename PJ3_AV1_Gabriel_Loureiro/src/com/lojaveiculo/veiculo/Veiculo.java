package com.lojaveiculo.veiculo;

import java.util.HashMap;
import java.util.Map;

public class Veiculo {
	
	private String chassi;
	private String montadora;
	private String modelo;
	private String tipo;
	private String cor;
	private float preco;
	private Map<String, Integer> cilindradaOrCambio = new HashMap<String, Integer>();
	private Map<String, Integer> capacidadeOrMotorizacao = new HashMap<String, Integer>();
	
	public Veiculo(){
		
	}
	
	public Veiculo(String chassi, String montadora, String modelo, String tipo, String cor, float preco, 
			HashMap<String, Integer> cilindradaOrCambio, HashMap<String, Integer> capacidadeOrMotorizacao){
		
		this.setChassi(chassi);
		this.setMontadora(montadora);
		this.setModelo(modelo);
		this.setTipo(tipo);
		this.setCor(cor);
		this.setPreco(preco);
		this.setCilindradaOrCambio(cilindradaOrCambio);
		this.setCapacidadeOrMotorizacao(capacidadeOrMotorizacao);
		
	}
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public HashMap<String, Integer> getCilindradaOrCambio() {
		return (HashMap<String, Integer>) cilindradaOrCambio;
	}
	public void setCilindradaOrCambio(HashMap<String, Integer> cilindradaOrCambio) {
		this.cilindradaOrCambio = cilindradaOrCambio;
	}
	public HashMap<String, Integer> getCapacidadeOrMotorizacao() {
		return (HashMap<String, Integer>) capacidadeOrMotorizacao;
	}
	public void setCapacidadeOrMotorizacao(
			HashMap<String, Integer> capacidadeOrMotorizacao) {
		this.capacidadeOrMotorizacao = capacidadeOrMotorizacao;
	}

}
