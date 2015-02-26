package com.lojaveiculo.controller;

import java.util.Scanner;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Moto;

public class BuscaMoto {
	
Scanner input =  new Scanner(System.in);
	
	public void pesquisaMoto(Loja loja){
		
		String modelo = "", montadora = "", tipo = "";
		float preco = 0;
		int verificador = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		
		System.out.print("Informe o modelo da moto: ");
		modelo = input.nextLine();
		System.out.print("Informe a montadora da moto: ");
		montadora = input.nextLine();
		System.out.print("Informe o tipo da moto: ");
		tipo = input.nextLine();
		try {
			System.out.print("Informe o preco da moto: ");
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
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getModelo().equalsIgnoreCase(modelo)) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (modelo.equalsIgnoreCase("") && tipo.equalsIgnoreCase("") && preco == 0) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getMontadora().equalsIgnoreCase(montadora)) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("") && modelo.equalsIgnoreCase("") && preco == 0) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getTipo().equalsIgnoreCase(tipo)) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("") && tipo.equalsIgnoreCase("") && modelo.equalsIgnoreCase("")) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getPreco() == preco) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (tipo.equalsIgnoreCase("") && modelo.equalsIgnoreCase("")) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getPreco() == preco && moto.getMontadora().equalsIgnoreCase(montadora)) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("") && tipo.equalsIgnoreCase("")) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getPreco() == preco && moto.getModelo().equalsIgnoreCase(modelo)) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("") && modelo.equalsIgnoreCase("")) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getPreco() == preco && moto.getTipo().equalsIgnoreCase(tipo)) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("") && preco == 0) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getModelo().equalsIgnoreCase(modelo) && moto.getTipo().equalsIgnoreCase(tipo)) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (modelo.equalsIgnoreCase("") && preco == 0) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getTipo().equalsIgnoreCase(tipo)) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (tipo.equalsIgnoreCase("") && preco == 0) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getModelo().equalsIgnoreCase(modelo) && moto.getMontadora().equalsIgnoreCase(montadora)) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (montadora.equalsIgnoreCase("")) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getModelo().equalsIgnoreCase(modelo) && moto.getTipo().equalsIgnoreCase(tipo)
				&& moto.getPreco() == preco) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (tipo.equalsIgnoreCase("")) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getModelo().equalsIgnoreCase(modelo) && moto.getMontadora().equalsIgnoreCase(montadora)
				&& moto.getPreco() == preco) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (modelo.equalsIgnoreCase("")) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getMontadora().equalsIgnoreCase(montadora) && moto.getTipo().equalsIgnoreCase(tipo)
				&& moto.getPreco() == preco) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (preco == 0) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getModelo().equalsIgnoreCase(modelo) && moto.getTipo().equalsIgnoreCase(tipo)
				&& moto.getMontadora().equalsIgnoreCase(montadora)) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
			}
		}
		
		if (!montadora.equalsIgnoreCase("") && !modelo.equalsIgnoreCase("") && !tipo.equalsIgnoreCase("") && preco != 0) {
			for (Moto moto : loja.getMotocicletas()) {
				if (moto.getModelo().equalsIgnoreCase(modelo) && moto.getTipo().equalsIgnoreCase(tipo)
				&& moto.getPreco() == preco && moto.getMontadora().equalsIgnoreCase(montadora)) {
					exibir(moto);
					verificador = 1;
				}
			}
			if (verificador == 0) {
				System.out.println("Não tem nenhuma moto encontrada!!!!");
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

}
