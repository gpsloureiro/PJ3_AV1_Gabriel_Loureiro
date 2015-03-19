package com.lojaveiculo.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Veiculo;

public class AdicionarCarro {
	
	Scanner input =  new Scanner(System.in);
	
public void addCarro(Loja loja, Veiculo carro){
		
		String chassi = "";
		String montadora = "";
		String tipo = "";
		String cor = "";
		String modelo = "";
		float preco = 0;
		int naoString = 0;
		int cambio = 0;
		int motorizacao = 0;
		HashMap<String, Integer> cilindradaOrCambio = new HashMap<String, Integer>();
		HashMap<String, Integer> capacidadeOrMotorizacao = new HashMap<String, Integer>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		
		while (naoString == 0) {
			System.out.print("Informe o chassi do carro: ");
			chassi =  input.nextLine();
			if (!chassi.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o chassi do carro!!");
			}
		}
		
		naoString = 0;
		while (naoString == 0) {
			System.out.print("Informe a montadora do carro: ");
			montadora =  input.nextLine();
			if (!montadora.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar a montadora do carro!!");
			}
		}
		
		naoString = 0;
		while (naoString == 0) {
			System.out.print("Informe o modelo do carro: ");
			modelo =  input.nextLine();
			if (!modelo.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o modelo do carro!!");
			}
		}
		
		naoString = 0;
		while (naoString == 0) {
			System.out.print("Informe o tipo do carro Sedan ou Hatch: ");
			tipo =  input.nextLine();
			if (!tipo.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o tipo do carro!!");
			}
			if (!tipo.equalsIgnoreCase("Sedan") && !tipo.equalsIgnoreCase("Hatch")) {
				System.out.println("O tipo do carro deve ser Sedan ou Hatch!!!");
				naoString = 0;
			}
		}
		
		naoString = 0;
		while (naoString == 0) {
			System.out.print("Informe a cor do carro: ");
			cor =  input.nextLine();
			if (!cor.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar a cor do carro!!");
			}
		}
		
		while (cambio == 0) {
			try {
				System.out.print("Informe o cambio do carro: ");
				cambio = Integer.parseInt(input.nextLine());
				if (cambio <= 0) {
					System.out.println("Dever informa uma valor não negatio e acima de ZERO!!!!");
					cambio = 0;
				}
			} catch (NumberFormatException e) {
				System.out.println("Digitou Errado tente novamete!!!");
			}
		}
		cilindradaOrCambio.put("Cambio", cambio);
		
		while (motorizacao == 0) {
			try {
				System.out.print("Informe a motorização do carro: ");
				motorizacao = Integer.parseInt(input.nextLine());
				if (motorizacao <= 0) {
					System.out.println("Dever informa uma valor não negatio e acima de ZERO!!!!");
					motorizacao = 0;
				}
			} catch (NumberFormatException e) {
				System.out.println("Digitou Errado tente novamete!!!");
			}
		}
		capacidadeOrMotorizacao.put("Motorização", motorizacao);
		
		while (preco == 0) {
			try {
				System.out.print("Informe o preço do carro: ");
				preco = Float.parseFloat(input.nextLine());
				if (preco <= 0) {
					System.out.println("Dever informa uma valor não negatio e acima de ZERO!!!!");
					preco = 0;
				}
			} catch (NumberFormatException e) {
				System.out.println("Digitou Errado tente novamete!!!");
			}
		}
		
		carro = new Veiculo(chassi, montadora, modelo, tipo, cor, preco, 
				cilindradaOrCambio,  capacidadeOrMotorizacao);
		loja.getVeiculos().add(carro);
	}

}
