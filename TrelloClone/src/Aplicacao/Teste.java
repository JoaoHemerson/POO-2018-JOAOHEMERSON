package Aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.*;
//import Servicos.*;

public class Teste{

	
	
	private static Scanner leitura;

	public static void main(String[] args) {
		leitura = new Scanner(System.in);
		
		ArrayList<Quadro> novoQuadro = new ArrayList<Quadro>();
		ArrayList<Lista> novaLista = new ArrayList<Lista>();
		ArrayList<Cartao> novoCartao = new ArrayList<Cartao>();
		
		//ServicosTrello funcao = new ServicosTrello();
		
		

		
//		System.out.println("Titulo: ");
//		String titulo = leitura.nextLine();
//		leitura.nextLine();
//		Quadro quadro = new Quadro();
//		quadro.setTitulo(titulo);
//		//funcao.adicionarQuadro(titulo);
//		//System.out.println(quadro.getTitulo());
//		novoQuadro.add(quadro);
		
//		System.out.println("Nome da lista: ");
//		leitura.nextLine();
//		String nome = leitura.nextLine();
//		Lista lista = new Lista();
//		lista.setNome(nome);
//		novaLista.add(lista);
//		
//		System.out.println("Seus quadros");
//		for (int i = 0; i < novoQuadro.size(); i++) {
//			System.out.println(novoQuadro.get(i).getTitulo());
//		}
//		
//		System.out.println("Suas listas");
//		for (int i = 0; i < novaLista.size(); i++) {
//			System.out.println(novaLista.get(i).getNome());
//		}
//		
		System.out.println("Titulo do cartao: ");
		leitura.nextLine();
		String nomeDoCartao = leitura.nextLine();
		Cartao cartao = new Cartao(nomeDoCartao);
		cartao.setTitulo(nomeDoCartao);
		novoCartao.add(cartao);
		System.out.println(novoCartao.size());		
	}
}
//System.out.println("Menu: " + 
//"\n 1 - Novo Quadro \n 2 - Adicionar Lista \n 3 - Imprimir\n");
//
//leitura = new Scanner(System.in);
//System.out.println("Selecione a Opcão");
//opcao = leitura.nextInt();