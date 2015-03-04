package com.lojaveiculo.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Moto;

public class BuscaMoto {
	
Scanner input =  new Scanner(System.in);
	
	public void pesquisaMoto(Loja loja){
		
		String modelo = "", montadora = "", tipo = "", cor = "";
		float preco = 0;
		
		montadora = listarMontadora(loja);
		modelo = listarModelo(loja, montadora);
		if (modelo.equalsIgnoreCase("")) {
			preco = precoCarro();
			if (preco == 0) {
				for (Moto moto : loja.getMotocicletas()) {
					if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getModelo().equalsIgnoreCase(modelo)) {
						exibir(moto);
					}
				}
			}else {
				for (Moto moto : loja.getMotocicletas()) {
					if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getPreco() <= preco) {
						exibir(moto);
					}
				}
			}
		}else{
			tipo = listarTipo(loja, montadora, modelo);
			if (tipo.equalsIgnoreCase("")) {
				for (Moto moto : loja.getMotocicletas()) {
					if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getModelo().equalsIgnoreCase(modelo)) {
						exibir(moto);
					}
				}
			}else{
				cor = listaCor(loja, montadora, modelo, tipo);
				if (cor.equalsIgnoreCase("")) {
					for (Moto moto : loja.getMotocicletas()) {
						if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getModelo().equalsIgnoreCase(modelo)
						&& moto.getTipo().equalsIgnoreCase(tipo)) {
							exibir(moto);
						}
					}
				}else{
					preco = precoCarro();
					if (preco == 0) {
						for (Moto moto : loja.getMotocicletas()) {
							if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getModelo().equalsIgnoreCase(modelo)
							&& moto.getTipo().equalsIgnoreCase(tipo) && moto.getCor().equalsIgnoreCase(cor)) {
								exibir(moto);
							}
						}
					}else {
						for (Moto moto : loja.getMotocicletas()) {
							if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getModelo().equalsIgnoreCase(modelo)
							&& moto.getTipo().equalsIgnoreCase(tipo) && moto.getCor().equalsIgnoreCase(cor) && 
							moto.getPreco() <= preco) {
								exibir(moto);
							}
						}
					}
				}
			}
		}
		
	}
	
	public static void exibir(Moto moto){
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
	}
	
    public String listarMontadora(Loja loja){
		
		ArrayList<String> escolhar = new ArrayList<String>();
		
		int contador = 0;
		escolhar.add(loja.getMotocicletas().get(contador).getMontadora());			
		for (int i = 0; i < loja.getMotocicletas().size(); i++) {
			if (!escolhar.contains(loja.getMotocicletas().get(i).getMontadora())) {
				escolhar.add(loja.getMotocicletas().get(i).getMontadora());
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
		for (int i = 0; i < loja.getMotocicletas().size(); i++) {
			if (loja.getMotocicletas().get(i).getMontadora().equalsIgnoreCase(montadora)) {
				if (!escolhar.contains(loja.getMotocicletas().get(i).getModelo())) {
					escolhar.add(loja.getMotocicletas().get(i).getModelo());
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
		for (int i = 0; i < loja.getMotocicletas().size(); i++) {
			if (loja.getMotocicletas().get(i).getMontadora().equalsIgnoreCase(montadora) &&
			loja.getMotocicletas().get(i).getModelo().equalsIgnoreCase(modelo) &&
			loja.getMotocicletas().get(i).getTipo().equalsIgnoreCase(tipo)) {
				if (!escolhar.contains(loja.getMotocicletas().get(i).getCor())) {
					escolhar.add(loja.getMotocicletas().get(i).getCor());
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
		for (int i = 0; i < loja.getMotocicletas().size(); i++) {
			if (loja.getMotocicletas().get(i).getMontadora().equalsIgnoreCase(montadora) &&
			loja.getMotocicletas().get(i).getModelo().equalsIgnoreCase(modelo)) {
				if (!escolhar.contains(loja.getMotocicletas().get(i).getTipo())) {
					escolhar.add(loja.getMotocicletas().get(i).getTipo());
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
