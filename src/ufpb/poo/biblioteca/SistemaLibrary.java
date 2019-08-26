package ufpb.poo.biblioteca;

import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;

import ufpb.poo.biblioteca.exception.*;

public class SistemaLibrary implements Library {

	ArrayList<Livro> listaLivro;
	ArrayList<Funcionario> listaFuncionario;
	ArrayList<Usuario> listaUsuario;

	public void efetuarEmprestimo(Livro book, Usuario cliente) throws LivroException {
		if (book == null || cliente == null)
			throw new LivroException("Objeto nulo, tente novamente!");
		cliente.setLivroLocado(book);
		book.setDisponivel(false);
	}

	public void efetuarDevolucao(Livro book, Usuario cliente) {
		cliente.setLivroLocado(book);
		book.setDisponivel(true);
	}

	public void cadastrarLivro(Livro book) {
		listaLivro.add(book);
	}

	public Livro alterarLivro(Livro book) throws LivroException {
		return this.buscaLivro(book);
	}

	public Livro buscaLivro(Livro book) throws LivroException {
		Livro livro = null;
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(book.getCodigo())) {
				livro = l;
			}
		}
		if (livro == null)
			throw new LivroException("Livro não encontrado");
		return livro;
	}

	public boolean excluirLivro(Livro book) throws LivroException{
		boolean tmp = false;
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(book.getCodigo())) {
				tmp = true;
				listaLivro.remove(book);
			}
		}
		if(tmp == false)
			throw new LivroException("Livro não encontrado!");
		return tmp;
	}

	public Usuario consultarUsuario(Usuario cliente) throws UsuarioException {
		Usuario usuario = null;
		for (Usuario u : listaUsuario) {
			if (u.getCpf().equals(cliente.getCpf())) {
				usuario = u;
			}
		}
		if (usuario == null)
			throw new UsuarioException("Usuário não encontrado");
		return usuario;
	}

	public void cadastrarUsuario(Usuario cliente) throws UsuarioException {
		if (isEqualsCpf(cliente))
			throw new UsuarioException("Usuário já existe!");
		listaUsuario.add(cliente);
	}

	public Usuario alterarUsuario(Usuario cliente) throws UsuarioException {
		return this.consultarUsuario(cliente);
	}

	public boolean excluirUsuario(Usuario cliente) {
		boolean tmp = false;
		for (Usuario c : listaUsuario) {
			if (c.getCpf().equals(cliente.getCpf())) {
				tmp = true;
				listaUsuario.remove(cliente);
			}
		}
		return tmp;
	}

	@Override
	public void cadastrarFuncionario(Funcionario fun) {
		this.listaFuncionario.add(fun);
	}

	@Override
	public ArrayList<String> listarArcevo() {
		ArrayList<String> livros = new ArrayList<String>();
		for (Livro l : this.listaLivro) {
			livros.add(l.getTitulo());
			livros.add(":");
			livros.add(l.getAutor());
		}
		return livros;
	}

	@Override
	public boolean verificarLogin(Funcionario funcionario) {
		boolean logado = false;
		for (Funcionario f : this.listaFuncionario) {
			if (f.equals(funcionario)) {
				logado = true;
			}
		}
		return logado;
	}

	public ArrayList<Usuario> buscaUsu(String nome) {
		ArrayList<Usuario> usuariosEncontrados = new ArrayList<Usuario>();
		for (Usuario c : listaUsuario) {
			if (c.getNome().equals(nome)) {
				usuariosEncontrados.add(c);
			}
		}
		return usuariosEncontrados;
	}

	public Usuario buscaCpf(String cpf) throws UsuarioException {
		Usuario usuario = null;
		for (Usuario c : listaUsuario) {
			if (c.getCpf().equals(cpf)) {
				usuario = c;
			}
		}
		return usuario;
	}

	public boolean isEqualsCpf(Usuario usuario) throws UsuarioException {
		boolean cpfIgual = false;
		for (Usuario c : listaUsuario) {
			if (usuario.getCpf().equals(c.getCpf())) {
				cpfIgual = true;
			}
		}
		return cpfIgual;
	}
}
