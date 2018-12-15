package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Lista extends Cartao {
	
	private static final String Lista = null;


	public Lista(String titulo) {
		super(titulo);
		
	}

	private String nome;
	List<Cartao> cartoes = new ArrayList<>();
	
		
	//public Lista(String nome){
		//this.nome = nome;
	//}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void criarCartao(String titulo){
		Cartao novoCartao = new Cartao(titulo); 
		cartoes.add(novoCartao);

	}
	
	public void excluirCartao(Cartao cartao) {
		cartoes.remove(cartao);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Lista: " + Lista + "|" + "Cartoes " + cartoes  ;
	}

}
