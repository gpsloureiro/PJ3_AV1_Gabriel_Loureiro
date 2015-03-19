package com.lojaveiculo.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Veiculo;

public class BuscarCarroChassi {
	
	Scanner input =  new Scanner(System.in);
	static final String definiCarro = "Cambio";
	static final String definiCarro2 = "Motorização";
	
	public void pesquisaCarroChassi(Loja loja){
		
		String chassi = "";
		int naoString = 0;
		int verificador = 0;
		ArrayList<Veiculo> carrosDaLoja = new ArrayList<Veiculo>();
		carrosDaLoja = CarrosDaLoja(loja);
		
		while (naoString == 0) {
			System.out.print("Informe o chassi do carro para buscar: ");
			chassi =  input.nextLine();
			if (!chassi.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o chassi do carro!!");
			}
		}
		
		for (Veiculo carros : carrosDaLoja) {
			if (carros.getChassi().equalsIgnoreCase(chassi)) {
				
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
				verificador = 1;
			}
		}
		
		if (verificador == 0) {
			System.out.println("Nenhum carro encontrado com esse Chassi " + chassi);
		}
		
	}
	
    public ArrayList<Veiculo> CarrosDaLoja(Loja loja){
		
		ArrayList<Veiculo> carros = new ArrayList<Veiculo>();
		for (Veiculo veiculo : loja.getVeiculos()) {
			if (veiculo.getCapacidadeOrMotorizacao().containsKey(definiCarro)) {
				carros.add(veiculo);
			}
		}
		return carros;
		
	}

}
