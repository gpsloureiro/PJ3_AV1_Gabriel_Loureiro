package com.lojaveiculo.controller;

import java.util.Scanner;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Moto;

public class BuscarMotoChassi {
	
Scanner input =  new Scanner(System.in);
	
	public void pesquisaMotoChassi(Loja loja){
		
		String chassi = "";
		int naoString = 0, verificador = 0;
		
		while (naoString == 0) {
			System.out.print("Informe o chassi da moto para buscar: ");
			chassi =  input.nextLine();
			if (!chassi.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o chassi da moto!!");
			}
		}
		
		for (Moto moto : loja.getMotocicletas()) {
			if (moto.getChassi().equalsIgnoreCase(chassi)) {
				System.out.println();
				System.out.println();
				System.out.println("Chassi: " + moto.getChassi());
				System.out.println("Montadora: " + moto.getMontadora());
				System.out.println("Modelo: " + moto.getModelo());
				System.out.println("Tipo: " + moto.getTipo());
				System.out.println("Cor: " + moto.getCor());
				System.out.println("Cilindradas: " + moto.getCilindrada());
				System.out.println("Preço: " + moto.getPreco());
				System.out.println("Capacidade: " + moto.getCapacidade());
				verificador = 1;
			}
		}
		
		if (verificador == 0) {
			System.out.println("Nenhuma moto encontrada com esse Chassi " + chassi);
		}
		
	}

}
