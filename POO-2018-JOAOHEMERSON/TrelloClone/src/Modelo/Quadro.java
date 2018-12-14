package Modelo;

public class Quadro {
	
	private String titulo;
	private String cor;
	private boolean particular;
	
	public Quadro(String novoTitulo, String cor) {
		this.titulo = novoTitulo;
		this.cor = cor;
		this.particular = true;
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
	public boolean mudarTipo(int num ) {
		if(num == 1) {
			this.particular = false;
		}return particular;
	}
	

}
