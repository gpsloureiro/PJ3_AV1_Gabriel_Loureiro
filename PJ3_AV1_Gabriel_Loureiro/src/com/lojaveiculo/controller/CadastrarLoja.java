package com.lojaveiculo.controller;

import java.util.Scanner;

import com.lojaveiculo.loja.Loja;

public class CadastrarLoja {
	
	Scanner input =  new Scanner(System.in);
	
public void addLoja(Loja loja){
		
		int naoString = 0;
		
		while (naoString == 0) {
			System.out.print("Informe o nome da Loja: ");
			loja.setNome(input.nextLine());
			if (!loja.getNome().equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o nome!!");
			}
		}
		
		naoString = 0;
		while (naoString == 0) {
			System.out.print("Informe o endereço da Loja: ");
			loja.setEndereco(input.nextLine());
			if (!loja.getEndereco().equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o endereço!!");
			}
		}
		
	}

}
