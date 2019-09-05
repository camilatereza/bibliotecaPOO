package ufpb.poo.biblioteca;

import java.util.ArrayList;
import ufpb.poo.biblioteca.exception.*;

public interface Library {

	public void cadastrarFuncionario(Funcionario fun)throws FuncionarioException;

	public ArrayList<String> listarArcevo();

	public boolean verificarLogin(Funcionario funcionario) throws UsuarioException;

	public void cadastrarLivro(Livro book);

	public Livro alterarLivro(Livro book)  throws LivroException;

	public boolean removerLivro(Livro book) throws LivroException;

	public Usuario consultarUsuario(Usuario cliente) throws UsuarioException;

	public void cadastrarUsuario(Usuario cliente) throws UsuarioException;

	public Usuario alterarUsuario(Usuario cliente) throws UsuarioException;

	public boolean removerUsuario(Usuario Cliente) throws UsuarioException;

	public Livro buscaLivro(Livro book)  throws LivroException;

}
