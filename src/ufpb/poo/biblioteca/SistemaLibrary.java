package ufpb.poo.biblioteca;

import java.util.ArrayList;

public class SistemaLibrary implements Library {
	
	ArrayList<Livro> listaLivro;
	ArrayList<Funcionario> listaFuncionario;
	ArrayList<Usuario> listaUsuario;

	public void efetuarEmprestimo(Livro book, Usuario cliente) {
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

	public Livro alterarLivro(Livro book) {
		return this.buscaLivro(book);
	}

	public Livro buscaLivro(Livro book) {
		Livro livro = null;
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(book.getCodigo())) {
				livro = l;
			}
		}
		return livro;
	}

	public boolean excluirLivro(Livro book) {
		boolean tmp = false;
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(book.getCodigo())) {
				tmp = true;
				listaLivro.remove(book);
			}
		}
		return tmp;
	}

	public Usuario consultarUsuario(Usuario cliente) {
		Usuario usuario = null;
		for (Usuario u : listaUsuario) {
			if (u.getCpf().equals(cliente.getCpf())) {
				usuario = u;
			}
		}
		return usuario;
	}

	public void cadastrarUsuario(Usuario cliente) {
		listaUsuario.add(cliente);
	}

	public Usuario alterarUsuario(Usuario cliente) {
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
	public boolean verificarLogin(Funcionario funcionario){
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

	public Usuario buscaCpf(String cpf) {
		Usuario usuario = null;
		for (Usuario c : listaUsuario) {
			if (c.getCpf().equals(cpf)) {
				usuario = c;
			}
		}
		return usuario;
	}
}
