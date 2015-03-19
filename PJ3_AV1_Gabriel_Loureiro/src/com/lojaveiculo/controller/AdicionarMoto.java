package com.lojaveiculo.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Veiculo;

public class AdicionarMoto {
	
	Scanner input =  new Scanner(System.in);
	
public void addMoto(Loja loja, Veiculo moto){
		
		String chassi = "";
		String montadora = "";
		String tipo = "";
		String cor = "";
		String modelo = "";
		float preco = 0;
		int naoString = 0;
		int cilindrada = 0;
		int capacidade = 0;
		HashMap<String, Integer> cilindradaOrCambio = new HashMap<String, Integer>();
		HashMap<String, Integer> capacidadeOrMotorizacao = new HashMap<String, Integer>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		
		while (naoString == 0) {
			System.out.print("Informe o chassi da Moto: ");
			chassi =  input.nextLine();
			if (!chassi.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o chassi da moto!!");
			}
		}
		
		naoString = 0;
		while (naoString == 0) {
			System.out.print("Informe a montadora da Moto: ");
			montadora =  input.nextLine();
			if (!montadora.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar a montadora da Moto!!");
			}
		}
		
		naoString = 0;
		while (naoString == 0) {
			System.out.print("Informe o modelo da moto: ");
			modelo =  input.nextLine();
			if (!modelo.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o modelo da moto!!");
			}
		}
		
		naoString = 0;
		while (naoString == 0) {
			System.out.print("Informe o tipo da moto de Corrida ou Urbano: ");
			tipo =  input.nextLine();
			if (!tipo.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o tipo da moto!!");
			}
			if (!tipo.equalsIgnoreCase("Corrida") && !tipo.equalsIgnoreCase("Urbano")) {
				System.out.println("O tipo da moto deve ser de Corrida ou Urbano!!!");
				naoString = 0;
			}
		}
		
		naoString = 0;
		while (naoString == 0) {
			System.out.print("Informe a cor da moto: ");
			cor =  input.nextLine();
			if (!cor.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar a cor da moto!!");
			}
		}
		
		while (cilindrada == 0) {
			try {
				System.out.print("Informe a cilindrada da moto: ");
				cilindrada = Integer.parseInt(input.nextLine());
				if (cilindrada <= 0) {
					System.out.println("Dever informa uma valor não negatio e acima de ZERO!!!!");
					cilindrada = 0;
				}
			} catch (NumberFormatException e) {
				System.out.println("Digitou Errado tente novamete!!!");
			}
		}
		cilindradaOrCambio.put("Cilindrada", cilindrada);
		
		while (capacidade == 0) {
			try {
				System.out.print("Informe a capacidade da moto: ");
				capacidade = Integer.parseInt(input.nextLine());
				if (capacidade <= 0) {
					System.out.println("Dever informa uma valor não negatio e acima de ZERO!!!!");
					capacidade = 0;
				}
			} catch (NumberFormatException e) {
				System.out.println("Digitou Errado tente novamete!!!");
			}
		}
		capacidadeOrMotorizacao.put("Capacidade", capacidade);
		
		while (preco == 0) {
			try {
				System.out.print("Informe o preço da moto: ");
				preco = Float.parseFloat(input.nextLine());
				if (preco <= 0) {
					System.out.println("Dever informa uma valor não negatio e acima de ZERO!!!!");
					preco = 0;
				}
			} catch (NumberFormatException e) {
				System.out.println("Digitou Errado tente novamete!!!");
			}
		}
		
		moto = new Veiculo(chassi, montadora, modelo, tipo, cor, preco, 
				cilindradaOrCambio,  capacidadeOrMotorizacao);
		loja.getVeiculos().add(moto);
	}

}
