package Modelo;

public class Cartao{
	
	
	private String titulo;
	private String descricao;
	private boolean StatusArquivado;
	
	public Cartao(String titulo) {
		this.titulo = titulo;
		this.descricao = "";
		this.StatusArquivado = false;
	
		
	}
	public void setTitulo(String meuTitulo){
		this.titulo = meuTitulo;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public boolean mudancaDeStatus(int num) {
		if(num == 2) {
			this.StatusArquivado = true;
			
		}return this.StatusArquivado;
	}
	
	
}
