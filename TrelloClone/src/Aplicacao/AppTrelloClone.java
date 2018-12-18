package Aplicacao;

import java.util.ArrayList;
import java.util.Scanner;
import Modelo.*;
//import Servicos.*;

public class AppTrelloClone{

	private static Scanner leitura;
	private static Scanner entrada;


	public static void main(String[] args) {
		
		ArrayList<Quadro> novoQuadro = new ArrayList<Quadro>();
		ArrayList<Lista> novaLista = new ArrayList<Lista>();
		//int menu = 0;
		int opcao;
		entrada = new Scanner(System.in);
		do {
			
			leitura = new Scanner(System.in);
			Menu.menu();
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Titulo do Quadro");
				leitura.nextLine();
				String titulo = leitura.nextLine();
				Quadro quadro = new Quadro();
				quadro.setTitulo(titulo);
				novoQuadro.add(quadro);
				break;
			case 2:
				System.out.println("Nome da lista: ");
				leitura.nextLine();
				String nome = leitura.nextLine();
				Lista lista = new Lista();
				lista.setNome(nome);
				novaLista.add(lista);
				System.out.println(novaLista.size());
				break;
			case 3:
				
				for (int i = 0; i < novoQuadro.size(); i++) {
					System.out.println("Seus quadros");
					System.out.println("- " + novoQuadro.get(i).getTitulo());
				}
				
				
				for (int i = 0; i < novaLista.size(); i++) {
					System.out.println("Suas listas");
					System.out.println("- "+ novaLista.get(i).getNome());
				}
				break;
			case 4:
				Menu.menuCartao();
				break;
				}
			
			}while (opcao != 4);
		
		
		
		
	}
}
