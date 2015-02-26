package com.lojaveiculo.controller;

import java.util.Scanner;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Carro;

public class BuscarCarroChassi {
	
	Scanner input =  new Scanner(System.in);
	
	public void pesquisaCarroChassi(Loja loja){
		
		String chassi = "";
		int naoString = 0, verificador = 0;
		
		while (naoString == 0) {
			System.out.print("Informe o chassi do carro para buscar: ");
			chassi =  input.nextLine();
			if (!chassi.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o chassi do carro!!");
			}
		}
		
		for (Carro carros : loja.getCarros()) {
			if (carros.getChassi().equalsIgnoreCase(chassi)) {
				System.out.println();
				System.out.println();
				System.out.println("Chassi: " + carros.getChassi());
				System.out.println("Montadora: " + carros.getMontadora());
				System.out.println("Modelo: " + carros.getModelo());
				System.out.println("Tipo: " + carros.getTipo());
				System.out.println("Cor: " + carros.getCor());
				System.out.println("Câmbio: " + carros.getCambio());
				System.out.println("Preço: " + carros.getPreco());
				System.out.println("Motorização: " + carros.getMotorizacao());
				verificador = 1;
			}
		}
		
		if (verificador == 0) {
			System.out.println("Nenhum carro encontrado com esse Chassi " + chassi);
		}
		
	}

}
