package com.lojaveiculo.principal;

import java.util.Scanner;

import com.lojaveiculo.controller.GerenciadorLoja;


public class Principal {

	private static Scanner input;

	public static void main(String[] args) {
		
		GerenciadorLoja gerenciar = new GerenciadorLoja();
		input = new Scanner(System.in);
		gerenciar.estoqueRecupera();
		int op = 0;
		
		while (op == 0) {
			try {
				gerenciar.Menu();
				System.out.print("Escolhar a opção: ");
				op = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				for (int i = 0; i < 10; i++) {
					System.out.println();
				}
				System.out.println("Digitou Errado tente novamete!!!");
			}
			switch (op) {
			case 1:
				gerenciar.adicionarCarro();
				op = 0;
				break;
			case 2: 
				gerenciar.adicionarMoto();
				op = 0;
				break;
			case 3: 
				gerenciar.buscaCarro();
				op = 0;
				break;
			case 4: 
				gerenciar.buscarMoto();
				op = 0;
				break;
			case 5:
				gerenciar.buscarCarroChassi();
				op = 0;
				break;
			case 6:
				gerenciar.buscarMotoChassi();
				op = 0;
				break;
			case 7:
				gerenciar.listaEstoque(true);
				op = 0;
				break;
			case 8:
				gerenciar.listaEstoque(false);
				op = 0;
				break;
			case 9:
				gerenciar.estoqueSalva();
				System.out.println("MUITO OBRIGADO POR USAR NOSSO SISTEMA!!!!");
				op = 1;
			default:
				break;
			}
			
		}

	}

}
