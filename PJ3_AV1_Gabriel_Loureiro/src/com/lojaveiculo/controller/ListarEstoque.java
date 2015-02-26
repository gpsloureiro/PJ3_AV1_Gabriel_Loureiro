package com.lojaveiculo.controller;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Carro;
import com.lojaveiculo.veiculo.Moto;

public class ListarEstoque {
	
	public void listarEstoque(Loja loja, boolean type){
		
		int verificarCarro = 0, verificarMoto = 0;
		
		if (type) {
			for (Carro carros : loja.getCarros()) {
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
				verificarCarro = 1;
			}
			if (verificarCarro == 0) {
				System.out.println("Não existe nenhum carro no estoque!!!");
			}
		}else{
			for (Moto moto : loja.getMotocicletas()) {
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
				verificarMoto = 1;
			}
			if (verificarMoto == 0) {
				System.out.println("Não existe nenhuma moto no estoque!!!");
			}
		}
		
	}

}
