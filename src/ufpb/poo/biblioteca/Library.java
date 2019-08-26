package ufpb.poo.biblioteca;

import java.util.ArrayList;

import ufpb.poo.biblioteca.exception.LivroException;
import ufpb.poo.biblioteca.exception.UsuarioException;

public interface Library {

	public void cadastrarFuncionario(Funcionario fun);

	public ArrayList<String> listarArcevo();

	public boolean verificarLogin(Funcionario funcionario) throws UsuarioException;

	public void efetuarEmprestimo(Livro book, Usuario cliente) throws LivroException; 

	public void efetuarDevolucao(Livro book, Usuario cliente);

	public void cadastrarLivro(Livro book);

	public Livro alterarLivro(Livro book)  throws LivroException;

	public boolean excluirLivro(Livro book) throws LivroException;

	public Usuario consultarUsuario(Usuario cliente) throws UsuarioException;

	public void cadastrarUsuario(Usuario cliente) throws UsuarioException;

	public Usuario alterarUsuario(Usuario cliente) throws UsuarioException;

	public boolean excluirUsuario(Usuario Cliente);

	public Livro buscaLivro(Livro book)  throws LivroException;

}
