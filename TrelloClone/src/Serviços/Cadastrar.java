package Serviços;

import Modelo.Usuario;

public class Cadastrar {
	
	public Cadastrar(String nomeUsuario,String email, String senha) {
		new Usuario(nomeUsuario, email, senha);
	}
	
	public void listarUsuarios(Usuario usuario) {
		usuario.getLista().add(usuario);
	}

}
