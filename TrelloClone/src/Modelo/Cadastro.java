package Modelo;

public class Cadastro {
	
	private String nomeDeUsurario;
	private String email;
	private String senha;
	
	
	public void cadastrar(String nomeUsuario, String email, String senha) {
		this.nomeDeUsurario = nomeUsuario;
		this.email = email;
		this.senha = senha;
	}
	
	public void setNomeDeUsuario(String nome) {
		this.nomeDeUsurario = nome;
	}
	public String getNomeDeUsuario() {
		return this.nomeDeUsurario;
	}
	
	public void setEmail(String novoEmail) {
		this.email = novoEmail;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setSenha(String novaSenha) {
		this.senha = novaSenha;
	}
	public String getSenha() {
		return this.senha;
	}
	
	
	

}
