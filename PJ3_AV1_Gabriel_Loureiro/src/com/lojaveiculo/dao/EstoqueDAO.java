package com.lojaveiculo.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.lojaveiculo.controller.GerenciadorLoja;
import com.lojaveiculo.loja.Loja;

public class EstoqueDAO {
	/**
	 * salvarEstoque e recuperarEstoque
	 */
	private static final String NOME = "loja_veiculos.txt";
	GerenciadorLoja gerenciar = null;
	
	
	public void salvarEstoque( Loja loja ){
		FileOutputStream fileOut = null;
		ObjectOutputStream out = null;
		try{
		fileOut = new FileOutputStream( NOME );
		out = new ObjectOutputStream(fileOut);
		out.writeObject( loja );
		
		} catch( IOException e){
			System.out.println("Houve um problema ao tentar gravar arquivo no disco");
		} finally {
			try {
				out.close();
				fileOut.close(); 
			} catch (IOException e) {
				System.out.println("Falha ao fechar arquivo");
			}
		}
		
	}
	
	
	public Loja recuperarEstoque(){
		FileInputStream fis = null;
		ObjectInputStream in = null;
		Loja loja = null;
		
		try {
			fis = new FileInputStream( NOME );
			in = new ObjectInputStream(fis);
			loja = (Loja) in.readObject();
			
		} catch (FileNotFoundException e) {
			System.out.println("O arquivo não foi encontrado");
			criarArquivo();
		} catch (IOException e) {
			this.salvarEstoque(loja);
			System.out.println("Houve um falha ao tentar ler o conteúdo do arquivo");
		} catch (ClassNotFoundException e) {
			System.out.println("Houve uma falha ao tentar converter conteudo do arquivo para objeto");
		} finally {
			try {
				in.close();
				fis.close();
			} catch (IOException e) {
				System.out.println("Falha ao fechar arquivo");
			} catch (NullPointerException e) {
				gerenciar.estoqueSalva();
				try {
					fis = new FileInputStream( NOME );
					in = new ObjectInputStream(fis);
				} catch (FileNotFoundException e1) {
					System.out.println("Não conseguer ler de jeito nenhum");
				} catch (IOException e1){
					System.out.println("Não conseguer ler de jeito nenhum");
				} finally {
					try {
						in.close();
						fis.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		}
		
		if( loja != null){
			return loja;
		}

		return new Loja();
		
	
	}
	
	private void criarArquivo() {
		File file = new File(NOME);
		
		if ( !file.exists() ){
			FileWriter fw = null;
			try {
				new FileWriter(file);
			} catch (IOException ioe) {
				System.out.println("Não foi possivel criar o arquivo");
			} finally {
				try {
					gerenciar = new GerenciadorLoja();
					gerenciar.cadastrarLoja();
					fw.close();
				} catch (IOException e) {
					System.out.println("criar o arquivo, mas ao tentar fechar deu um erro.");
				} catch (NullPointerException e){
					try {
						fw = new FileWriter(file);
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
		}
	}
	
}
