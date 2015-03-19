package com.lojaveiculo.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Veiculo;

public class BuscaMoto {
	
    Scanner input =  new Scanner(System.in);
    static final String definiMoto = "Cilindrada";
	static final String definiMoto2 = "Capacidade";
	
	public void pesquisaMoto(Loja loja){
		
		String modelo = "";
		String montadora = "";
		String tipo = "";
		String cor = "";
		float preco = 0;
		ArrayList<Veiculo> motosDaLoja = new ArrayList<Veiculo>();
		motosDaLoja = MotosDaLoja(loja);
		
		montadora = listarMontadora(motosDaLoja);
		modelo = listarModelo(motosDaLoja, montadora);
		if (modelo.equalsIgnoreCase("")) {
			preco = precoCarro();
			if (preco == 0) {
				for (Veiculo moto : motosDaLoja) {
					if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getModelo().equalsIgnoreCase(modelo)) {
						exibir(moto);
					}
				}
			}else {
				for (Veiculo moto : motosDaLoja) {
					if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getPreco() <= preco) {
						exibir(moto);
					}
				}
			}
		}else{
			tipo = listarTipo(motosDaLoja, montadora, modelo);
			if (tipo.equalsIgnoreCase("")) {
				for (Veiculo moto : motosDaLoja) {
					if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getModelo().equalsIgnoreCase(modelo)) {
						exibir(moto);
					}
				}
			}else{
				cor = listaCor(motosDaLoja, montadora, modelo, tipo);
				if (cor.equalsIgnoreCase("")) {
					for (Veiculo moto : motosDaLoja) {
						if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getModelo().equalsIgnoreCase(modelo)
						&& moto.getTipo().equalsIgnoreCase(tipo)) {
							exibir(moto);
						}
					}
				}else{
					preco = precoCarro();
					if (preco == 0) {
						for (Veiculo moto : motosDaLoja) {
							if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getModelo().equalsIgnoreCase(modelo)
							&& moto.getTipo().equalsIgnoreCase(tipo) && moto.getCor().equalsIgnoreCase(cor)) {
								exibir(moto);
							}
						}
					}else {
						for (Veiculo moto : motosDaLoja) {
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
	
   public ArrayList<Veiculo> MotosDaLoja(Loja loja){
		
		ArrayList<Veiculo> motos = new ArrayList<Veiculo>();
		for (Veiculo veiculo : loja.getVeiculos()) {
			if (veiculo.getCapacidadeOrMotorizacao().containsKey(definiMoto)) {
				motos.add(veiculo);
			}
		}
		return motos;
		
	}
	
	public static void exibir(Veiculo moto){
		
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
	}
	
    public String listarMontadora(ArrayList<Veiculo> motos){
		
		ArrayList<String> escolhar = new ArrayList<String>();
		
		int contador = 0;
		escolhar.add(motos.get(contador).getMontadora());			
		for (int i = 0; i < motos.size(); i++) {
			if (!escolhar.contains(motos.get(i).getMontadora())) {
				escolhar.add(motos.get(i).getMontadora());
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
	
    public String listarModelo(ArrayList<Veiculo> motos, String montadora){
		
		ArrayList<String> escolhar = new ArrayList<String>();
		
		int contador = 1, opcao = 0;
		for (int i = 0; i < motos.size(); i++) {
			if (motos.get(i).getMontadora().equalsIgnoreCase(montadora)) {
				if (!escolhar.contains(motos.get(i).getModelo())) {
					escolhar.add(motos.get(i).getModelo());
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
    
    public String listaCor(ArrayList<Veiculo> motos, String montadora, String modelo, String tipo){
		
		ArrayList<String> escolhar = new ArrayList<String>();
		
		int contador = 1, opcao = 0;
		for (int i = 0; i < motos.size(); i++) {
			if (motos.get(i).getMontadora().equalsIgnoreCase(montadora) &&
			motos.get(i).getModelo().equalsIgnoreCase(modelo) &&
			motos.get(i).getTipo().equalsIgnoreCase(tipo)) {
				if (!escolhar.contains(motos.get(i).getCor())) {
					escolhar.add(motos.get(i).getCor());
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
    
    public String listarTipo(ArrayList<Veiculo> motos, String montadora, String modelo){
    	
        ArrayList<String> escolhar = new ArrayList<String>();
		
		int contador = 1, opcao = 0;
		for (int i = 0; i < motos.size(); i++) {
			if (motos.get(i).getMontadora().equalsIgnoreCase(montadora) &&
			motos.get(i).getModelo().equalsIgnoreCase(modelo)) {
				if (!escolhar.contains(motos.get(i).getTipo())) {
					escolhar.add(motos.get(i).getTipo());
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
