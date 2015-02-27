package com.lojaveiculo.controller;

import java.util.Scanner;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Carro;

public class BuscaCarro {
	
	Scanner input =  new Scanner(System.in);
	
	public void pesquisaCarro(Loja loja){
		
		String modelo = "", montadora = "", tipo = "";
		float preco = 0;
		int verificador = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		
		System.out.print("Informe o modelo do carro: ");
		modelo = input.nextLine();
		System.out.print("Informe a montadora do carro: ");
		montadora = input.nextLine();
		System.out.print("Informe o tipo do carro: ");
		tipo = input.nextLine();
		try {
			System.out.print("Informe até quanto quer o preçoo do carro: ");
			preco = Float.parseFloat(input.nextLine());
			if (preco < 0) {
				System.out.println("Não existe esse preço então o valor vai ficar ZERO!!!");
				preco = 0;
			}
		} catch (NumberFormatException e) {
			System.out.println("Digitou Errado!!!");
			preco = 0;
		}
		
		if (montadora.equalsIgnoreCase("") && tipo.equalsIgnoreCase("") && preco == 0) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getModelo().equalsIgnoreCase(modelo)) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (modelo.equalsIgnoreCase("") && tipo.equalsIgnoreCase("") && preco == 0) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getMontadora().equalsIgnoreCase(montadora)) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("") && modelo.equalsIgnoreCase("") && preco == 0) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getTipo().equalsIgnoreCase(tipo)) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("") && tipo.equalsIgnoreCase("") && modelo.equalsIgnoreCase("")) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getPreco() < preco) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (tipo.equalsIgnoreCase("") && modelo.equalsIgnoreCase("")) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getPreco() < preco && carros.getMontadora().equalsIgnoreCase(montadora)) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("") && tipo.equalsIgnoreCase("")) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getPreco() < preco && carros.getModelo().equalsIgnoreCase(modelo)) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("") && modelo.equalsIgnoreCase("")) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getPreco() < preco && carros.getTipo().equalsIgnoreCase(tipo)) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("") && preco == 0) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getModelo().equalsIgnoreCase(modelo) && carros.getTipo().equalsIgnoreCase(tipo)) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (modelo.equalsIgnoreCase("") && preco == 0) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getMontadora().equalsIgnoreCase(montadora) && carros.getTipo().equalsIgnoreCase(tipo)) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (tipo.equalsIgnoreCase("") && preco == 0) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getModelo().equalsIgnoreCase(modelo) && carros.getMontadora().equalsIgnoreCase(montadora)) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("")) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getModelo().equalsIgnoreCase(modelo) && carros.getTipo().equalsIgnoreCase(tipo)
				&& carros.getPreco() < preco) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (tipo.equalsIgnoreCase("")) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getModelo().equalsIgnoreCase(modelo) && carros.getMontadora().equalsIgnoreCase(montadora)
				&& carros.getPreco() < preco) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (modelo.equalsIgnoreCase("")) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getMontadora().equalsIgnoreCase(montadora) && carros.getTipo().equalsIgnoreCase(tipo)
				&& carros.getPreco() < preco) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (preco == 0) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getModelo().equalsIgnoreCase(modelo) && carros.getTipo().equalsIgnoreCase(tipo)
				&& carros.getMontadora().equalsIgnoreCase(montadora)) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
		if (!montadora.equalsIgnoreCase("") && !modelo.equalsIgnoreCase("") && !tipo.equalsIgnoreCase("") && preco != 0) {
			for (Carro carros : loja.getCarros()) {
				if (carros.getModelo().equalsIgnoreCase(modelo) && carros.getTipo().equalsIgnoreCase(tipo)
				&& carros.getPreco() < preco && carros.getMontadora().equalsIgnoreCase(montadora)) {
					exibir(carros);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhum carro encontrado!!!!");
			}
		}
		
	}
	
	public static void exibir(Carro carros){
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
	}

}
