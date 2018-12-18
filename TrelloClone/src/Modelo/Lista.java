package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	
	private String nome;
	List<Cartao> cartoes = new ArrayList<>();
	
	
	public Lista(){
	}
	
		
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
	

}
