package Aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Cartao;
import Modelo.Lista;
import Modelo.Quadro;

public class Menu {
	
	public static void menu(){
		System.out.println("\tMenu: ");
		System.out.println("1 - Novo Quadro ");
		System.out.println("2 - Adicionar Lista");
		System.out.println("3 - Imprimir");
		System.out.println("4 - Adicionar Cartao");
		System.out.println("4 - Sair");
		System.out.println("Selecione a opção -> ");
		
	}
	
	public static void menuCartao(){
		ArrayList<Cartao> novoCartao = new ArrayList<Cartao>();
		Scanner leitura;
		Scanner entrada;
		
		System.out.println("\tCartao: ");
		System.out.println("1 - Insira um titulo pra esse cartao: ");
		System.out.println("2 - Adicionar descrição: ");
		System.out.println("4 - Arquivar");
		System.out.println("Selecione a opção -> ");
		
		int opcao;
		entrada = new Scanner(System.in);
		leitura = new Scanner(System.in);
		opcao = entrada.nextInt();
		Scanner escolha;
			
			switch (opcao) {
				case 1:
					System.out.println("Titulo do cartao: ");
					leitura.nextLine();
					String nomeDoCartao = leitura.nextLine();
					Cartao cartao = new Cartao(nomeDoCartao);
					cartao.setTitulo(nomeDoCartao);
					novoCartao.add(cartao);
					System.out.println(novoCartao.size());
					break;
//				case 2:
//					System.out.println("Descrição: ");
//					leitura.nextLine();
//					String descricaoDoCartao = leitura.nextLine();
//					cartao.setDescricao(descricaoDoCartao);
//					System.out.println(cartao.getDescricao());
//					break;
//				case 3:
//					int selecionado;
//					escolha = new Scanner(System.in);
//					selecionado = escolha.nextInt();
//					System.out.println("Arquivar: ");
//					leitura.nextLine();
//					cartao.mudancaDeStatus(selecionado);				
//					break;
				}
			}
		
}


