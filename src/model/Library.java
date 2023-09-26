package model;

import java.util.ArrayList;

import model.exception.LivroException;
import model.exception.UsuarioException;
import ufpb.poo.biblioteca.exception.*;

public interface Library {
	
	public ArrayList<String> listarArcevo();

	public void cadastrarLivro(Livro book);

	public void alterarLivro(Livro book)  throws LivroException;

	public boolean removerLivro(Livro book) throws LivroException;

	public Usuario consultarUsuario(Usuario cliente) throws UsuarioException;

	public void cadastrarUsuario(Usuario cliente) throws UsuarioException;

	public void alterarUsuario(Usuario cliente) throws UsuarioException;

	public boolean removerUsuario(Usuario Cliente) throws UsuarioException;

	public Livro buscaLivro(Livro book)  throws LivroException;

}
