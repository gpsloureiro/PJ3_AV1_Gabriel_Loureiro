package com.lojaveiculo.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Carro;

public class BuscaCarro {
	
	Scanner input =  new Scanner(System.in);
	
	public void pesquisaCarro(Loja loja){
		
		String modelo = "", montadora = "", tipo = "", cor = "";
		float preco = 0;
		
		montadora = listarMontadora(loja);
		modelo = listarModelo(loja, montadora);
		if (modelo.equalsIgnoreCase("")) {
			preco = precoCarro();
			if (preco == 0) {
				for (Carro carros : loja.getCarros()) {
					if (carros.getMontadora().equalsIgnoreCase(montadora) && carros.getModelo().equalsIgnoreCase(modelo)) {
						exibir(carros);
					}
				}
			}else {
				for (Carro carros : loja.getCarros()) {
					if (carros.getMontadora().equalsIgnoreCase(montadora) && carros.getPreco() <= preco) {
						exibir(carros);
					}
				}
			}
		}else{
			tipo = listarTipo(loja, montadora, modelo);
			if (tipo.equalsIgnoreCase("")) {
				for (Carro carros : loja.getCarros()) {
					if (carros.getMontadora().equalsIgnoreCase(montadora) && carros.getModelo().equalsIgnoreCase(modelo)) {
						exibir(carros);
					}
				}
			}else{
				cor = listaCor(loja, montadora, modelo, tipo);
				if (cor.equalsIgnoreCase("")) {
					for (Carro carros : loja.getCarros()) {
						if (carros.getMontadora().equalsIgnoreCase(montadora) && carros.getModelo().equalsIgnoreCase(modelo)
						&& carros.getTipo().equalsIgnoreCase(tipo)) {
							exibir(carros);
						}
					}
				}else{
					preco = precoCarro();
					if (preco == 0) {
						for (Carro carros : loja.getCarros()) {
							if (carros.getMontadora().equalsIgnoreCase(montadora) && carros.getModelo().equalsIgnoreCase(modelo)
							&& carros.getTipo().equalsIgnoreCase(tipo) && carros.getCor().equalsIgnoreCase(cor)) {
								exibir(carros);
							}
						}
					}else {
						for (Carro carros : loja.getCarros()) {
							if (carros.getMontadora().equalsIgnoreCase(montadora) && carros.getModelo().equalsIgnoreCase(modelo)
							&& carros.getTipo().equalsIgnoreCase(tipo) && carros.getCor().equalsIgnoreCase(cor) && 
							carros.getPreco() <= preco) {
								exibir(carros);
							}
						}
					}
				}
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
		System.out.println();
		System.out.println();
	}
	
	public String listarMontadora(Loja loja){
		
		ArrayList<String> escolhar = new ArrayList<String>();
		
		int contador = 0;
		escolhar.add(loja.getCarros().get(contador).getMontadora());			
		for (int i = 0; i < loja.getCarros().size(); i++) {
			if (!escolhar.contains(loja.getCarros().get(i).getMontadora())) {
				escolhar.add(loja.getCarros().get(i).getMontadora());
			}
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < escolhar.size(); i++) {
			System.out.println("   " + (i + 1) +" - " + escolhar.get(i));
		}
		System.out.println();
		while (contador == 0) {
			try {
				System.out.print("Informe qual a Montadora do carro: ");
				contador = Integer.parseInt(input.nextLine());
				if (contador <= 0) {
					System.out.println("Dever Escolher umas das opções!!!");
					contador = 0;
				}
			} catch (NumberFormatException e) {
				contador = 0;
			}
		}
	    return escolhar.get(contador - 1);			
		
	}
	
    public String listarModelo(Loja loja, String montadora){
		
		ArrayList<String> escolhar = new ArrayList<String>();
		
		int contador = 1, opcao = 0;
		for (int i = 0; i < loja.getCarros().size(); i++) {
			if (loja.getCarros().get(i).getMontadora().equalsIgnoreCase(montadora)) {
				if (!escolhar.contains(loja.getCarros().get(i).getModelo())) {
					escolhar.add(loja.getCarros().get(i).getModelo());
				}
			}
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < escolhar.size(); i++) {
			System.out.println("   " + (i + 1) +" - " + escolhar.get(i));
			contador = contador + 1;
		}
		System.out.println("   " + contador +" - " + "Sair" );
		System.out.println();
		while (opcao == 0) {
			try {
				System.out.print("Informe qual o Modelo do carro: ");
				opcao = Integer.parseInt(input.nextLine());
				if (opcao <= 0 && opcao > contador) {
					System.out.println("Dever Escolher umas das opções!!!");
					opcao = 0;
				}else if (opcao == contador) {
					return "";
				}
			} catch (NumberFormatException e) {
				opcao = 0;
			}
		}
	    return escolhar.get(opcao - 1);	
		
	}
    
    public String listaCor(Loja loja, String montadora, String modelo, String tipo){
		
		ArrayList<String> escolhar = new ArrayList<String>();
		
		int contador = 1, opcao = 0;
		for (int i = 0; i < loja.getCarros().size(); i++) {
			if (loja.getCarros().get(i).getMontadora().equalsIgnoreCase(montadora) &&
			loja.getCarros().get(i).getModelo().equalsIgnoreCase(modelo) &&
			loja.getCarros().get(i).getTipo().equalsIgnoreCase(tipo)) {
				if (!escolhar.contains(loja.getCarros().get(i).getCor())) {
					escolhar.add(loja.getCarros().get(i).getCor());
				}
			}
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < escolhar.size(); i++) {
			System.out.println("   " + (i + 1) +" - " + escolhar.get(i));
			contador = contador + 1;
		}
		System.out.println("   " + contador +" - " + "Sair" );
		System.out.println();
		while (opcao == 0) {
			try {
				System.out.print("Informe qual a Cor do carro: ");
				opcao = Integer.parseInt(input.nextLine());
				if (opcao <= 0 && opcao > contador) {
					System.out.println("Dever Escolher umas das opções!!!");
					opcao = 0;
				}else if (opcao == contador) {
					return "";
				}
			} catch (NumberFormatException e) {
				opcao = 0;
			}
		}
	    return escolhar.get(opcao - 1);	
		
	}
    
    public String listarTipo(Loja loja, String montadora, String modelo){
    	
        ArrayList<String> escolhar = new ArrayList<String>();
		
		int contador = 1, opcao = 0;
		for (int i = 0; i < loja.getCarros().size(); i++) {
			if (loja.getCarros().get(i).getMontadora().equalsIgnoreCase(montadora) &&
			loja.getCarros().get(i).getModelo().equalsIgnoreCase(modelo)) {
				if (!escolhar.contains(loja.getCarros().get(i).getTipo())) {
					escolhar.add(loja.getCarros().get(i).getTipo());
				}
			}
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < escolhar.size(); i++) {
			System.out.println("   " + (i + 1) +" - " + escolhar.get(i));
			contador = contador + 1;
		}
    	while (opcao == 0) {
			try {
				System.out.print("Informe qual o Tipo do carro: ");
				opcao = Integer.parseInt(input.nextLine());
				if (opcao <= 0 && opcao > contador) {
					System.out.println("Dever Escolher umas das opções!!!");
					opcao = 0;
				}else if (opcao == contador) {
					return "";
				}
			} catch (NumberFormatException e) {
				opcao = 0;
			}
		}
    	return escolhar.get(opcao - 1);
    }
    
    public float precoCarro(){
    	
    	float preco = -1;
    	while (preco == -1) {
			try {
				System.out.print("Informe até quanto gostaria de pagar: ");
				preco = Float.parseFloat(input.nextLine());
				if (preco < 0 ) {
					System.out.println("Dever informa uma valor valido!!!");
					preco = -1;
				}else if (preco == 0) {
					return preco;
				}
			} catch (NumberFormatException e) {
				preco = -1;
			}
		}
    	return preco;
    	
    }
		
}
