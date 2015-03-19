package com.lojaveiculo.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.lojaveiculo.loja.Loja;
import com.lojaveiculo.veiculo.Veiculo;

public class BuscarMotoChassi {
	
    Scanner input =  new Scanner(System.in);
    static final String definiMoto = "Cilindrada";
	static final String definiMoto2 = "Capacidade";
	
	public void pesquisaMotoChassi(Loja loja){
		
		String chassi = "";
		int naoString = 0;
		int verificador = 0;
		ArrayList<Veiculo> motosDaLoja = new ArrayList<Veiculo>();
		motosDaLoja = MotosDaLoja(loja);
		
		while (naoString == 0) {
			System.out.print("Informe o chassi da moto para buscar: ");
			chassi =  input.nextLine();
			if (!chassi.equalsIgnoreCase("")) {
				naoString = 1;
			}else{
				System.out.println("Deve informar o chassi da moto!!");
			}
		}
		
		for (Veiculo moto : motosDaLoja) {
			if (moto.getChassi().equalsIgnoreCase(chassi)) {
				
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
				verificador = 1;
			}
		}
		
		if (verificador == 0) {
			System.out.println("Nenhuma moto encontrada com esse Chassi " + chassi);
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

}
