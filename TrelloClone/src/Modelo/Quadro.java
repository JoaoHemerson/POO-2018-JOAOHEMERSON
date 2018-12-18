package Modelo;
import Modelo.Lista;
import java.util.ArrayList;
//import Modelo.Lista;
import java.util.List;

public class Quadro{
		
	private String titulo;
	private String cor;
	List<Quadro> quadros = new ArrayList<Quadro>();
	List<Lista> listas = new ArrayList<Lista>();
		
	
	Lista novaLista = new Lista();
	
	
	public Quadro() {
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
