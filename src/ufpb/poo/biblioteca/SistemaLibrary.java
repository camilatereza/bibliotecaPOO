package ufpb.poo.biblioteca;


import java.util.ArrayList;

import ufpb.poo.biblioteca.exception.*;

public class SistemaLibrary implements Library {

	public ArrayList<Livro> listaLivro;
	public ArrayList<Funcionario> listaFuncionario;
	public ArrayList<Usuario> listaUsuario;
	
	

	public SistemaLibrary() {
		super();
		listaLivro = new ArrayList<Livro>();
		listaFuncionario = new ArrayList<Funcionario>();
		listaUsuario = new ArrayList<Usuario>();
	}

	public void efetuarEmprestimo(Livro book, Usuario cliente) throws LivroException {
		if (book == null || cliente == null)
			throw new LivroException("Objeto nulo, tente novamente!");
		cliente.setLivroLocado(book);
		book.setDisponivel(false);
	}

	public boolean verificaCodigo(Livro livro) {
		boolean encontrou = false;
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(livro.getCodigo()))
				encontrou = true;
		}

		return encontrou;
	}

	public void efetuarDevolucao(Livro book, Usuario cliente) {
		cliente.devolverLivro(book);
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
			throw new LivroException("Livro n�o encontrado");
		return livro;
	}

	public boolean excluirLivro(Livro book) throws LivroException {
		boolean tmp = false;
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(book.getCodigo())) {
				tmp = true;
				listaLivro.remove(book);
			}
		}
		if (tmp == false)
			throw new LivroException("Livro n�o encontrado!");
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
			throw new UsuarioException("Usu�rio n�o encontrado");
		return usuario;
	}

	public void cadastrarUsuario(Usuario cliente) throws UsuarioException {
		if (isEqualsCpf(cliente))
			throw new UsuarioException("Usu�rio j� existe!");
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

	public ArrayList<Usuario> buscaUsu(String nome) throws UsuarioException {
		ArrayList<Usuario> usuariosEncontrados = new ArrayList<Usuario>();
		for (Usuario c : listaUsuario) {
			if (c.getNome().equals(nome)) {
				usuariosEncontrados.add(c);
			}
		}
		if (usuariosEncontrados.size() == 0)
			throw new UsuarioException("Nenhum usu�rio encontrado com este nome!");
		return usuariosEncontrados;
	}

	public Usuario buscaCpf(String cpf) throws UsuarioException {
		Usuario usuario = null;
		for (Usuario c : listaUsuario) {
			if (c.getCpf().equals(cpf)) {
				usuario = c;
			}
		}
		if (usuario == null)
			throw new UsuarioException("Nenhum usu�rio encontrado com este cpf!");
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
