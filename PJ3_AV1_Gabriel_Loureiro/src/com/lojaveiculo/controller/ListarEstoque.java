package com.lojaveiculo.controller;

import java.util.ArrayList;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Veiculo;

public class ListarEstoque {
	
	static final String definiCarro = "Cambio";
	static final String definiCarro2 = "Motorização";
	static final String definiMoto = "Cilindrada";
	static final String definiMoto2 = "Capacidade";
	
	public void listarEstoque(Loja loja, boolean type){
		
		int verificarCarro = 0;
		int verificarMoto = 0;
		ArrayList<Veiculo> carrosDaLoja = new ArrayList<Veiculo>();
		ArrayList<Veiculo> motosDaLoja = new ArrayList<Veiculo>();
		motosDaLoja = MotosDaLoja(loja);
		carrosDaLoja = CarrosDaLoja(loja);
		
		if (type) {
			for (Veiculo carros : carrosDaLoja) {
				
				Integer cambio = carros.getCilindradaOrCambio().get(definiCarro);
				Integer motor = carros.getCapacidadeOrMotorizacao().get(definiCarro2);
				
				System.out.println();
				System.out.println();
				System.out.println("Chassi: " + carros.getChassi());
				System.out.println("Montadora: " + carros.getMontadora());
				System.out.println("Modelo: " + carros.getModelo());
				System.out.println("Tipo: " + carros.getTipo());
				System.out.println("Cor: " + carros.getCor());
				System.out.println("Câmbio: " + cambio);
				System.out.println("Preço: " + carros.getPreco());
				System.out.println("Motorização: " + motor);
				verificarCarro = 1;
			}
			if (verificarCarro == 0) {
				System.out.println("Não existe nenhum carro no estoque!!!");
			}
		}else{
			for (Veiculo moto : motosDaLoja) {
				
				Integer cilindrada = moto.getCilindradaOrCambio().get(definiMoto);
				Integer capacidade = moto.getCapacidadeOrMotorizacao().get(definiMoto2);
				
				System.out.println();
				System.out.println();
				System.out.println("Chassi: " + moto.getChassi());
				System.out.println("Montadora: " + moto.getMontadora());
				System.out.println("Modelo: " + moto.getModelo());
				System.out.println("Tipo: " + moto.getTipo());
				System.out.println("Cor: " + moto.getCor());
				System.out.println("Cilindradas: " + cilindrada);
				System.out.println("Preço: " + moto.getPreco());
				System.out.println("Capacidade: " + capacidade);
				verificarMoto = 1;
			}
			if (verificarMoto == 0) {
				System.out.println("Não existe nenhuma moto no estoque!!!");
			}
		}
		
	}
	
    public ArrayList<Veiculo> CarrosDaLoja(Loja loja){
		
		ArrayList<Veiculo> carros = new ArrayList<Veiculo>();
		for (Veiculo veiculo : loja.getVeiculos()) {
			if (veiculo.getCapacidadeOrMotorizacao().containsKey(definiCarro2)) {
				carros.add(veiculo);
			}
		}
		return carros;
		
	}
    
    public ArrayList<Veiculo> MotosDaLoja(Loja loja){
		
		ArrayList<Veiculo> motos = new ArrayList<Veiculo>();
		for (Veiculo veiculo : loja.getVeiculos()) {
			if (veiculo.getCapacidadeOrMotorizacao().containsKey(definiMoto)) {
				motos.add(veiculo);
			}
		}
		return motos;
		
	}

}
