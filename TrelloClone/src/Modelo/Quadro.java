package Modelo;

import java.util.ArrayList;
import Modelo.Lista;
import java.util.List;

public class Quadro {
		
	private String titulo;
	private String cor;
	private List<Quadro> quadros = new ArrayList<>(); 
	
	
	public void criarLista(String lista) {
		new Lista(lista);
	}
	
	
	
	public Quadro(String novoTitulo) {
		this.titulo = novoTitulo;
	}
	
	public void setTitulo(String novoTitulo) {
		this.titulo = novoTitulo;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	
		
	public List<Quadro> getQuadros(){
		return this.quadros;
	}
	

}
