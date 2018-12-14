package Modelo;

public class Cartao{
	
	//private String etiqueta;
	private String titulo;
	//private String data;
	private String descricao;
	private String comentario;
	//private String checkList;
	private boolean StatusArquivado;
	
	public Cartao(String titulo) {
		this.titulo = titulo;
		this.descricao = "";
		this.comentario = "";
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
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getComentario() {
		return this.comentario;
	}
	public boolean mudancaDeStatus(int num) {
		if(num == 1) {
			this.StatusArquivado = true;
			
		}return this.StatusArquivado;
	}
	
	
}
