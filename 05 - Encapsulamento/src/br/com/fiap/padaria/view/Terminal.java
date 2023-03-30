package br.com.fiap.padaria.view;

import java.util.Scanner;

import br.com.fiap.padaria.model.produto;

public class Terminal {

	public static void main(String[] args) {
		
	//instanciar um produto
	Scanner leitor = new Scanner(System.in);
	
	produto produto = new produto();
	
	
	//definir o nome do produto
	System.out.println("Digite o nome do Produto");
	produto.nome = leitor.next();
	
	System.out.println(produto.nome);
	leitor.close();
	}

}
