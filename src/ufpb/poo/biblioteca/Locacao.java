package ufpb.poo.biblioteca;

import java.util.ArrayList;

import ufpb.poo.biblioteca.exception.LivroException;

public class Locacao {
	
	private Datas data;
	private Usuario usuario;
	private Funcionario funcionario;
	private ArrayList<Livro> livros;
	
	public Locacao(Datas data, Usuario usuario, Funcionario funcionario, ArrayList<Livro> livros) {
		super();
		this.data = data;
		this.usuario = usuario;
		this.funcionario = funcionario;
		this.livros = livros;
	}
	
	public Locacao() {
		super();
	}

	@Override
	public String toString() {
		return "Locacao [data=" + data + ", usuario=" + usuario + ", funcionario=" + funcionario + ", livros=" + livros
				+ "]";
	}

	public void efetuarDevolucao(Livro book, Usuario cliente) {
		this.devolverLivro(book);
		book.setDisponivel(true);
	}
	
	public void efetuarEmprestimo(Livro book, Usuario cliente) throws LivroException {
		if (book == null || cliente == null)
			throw new LivroException("Objeto nulo, tente novamente!");
		cliente.setLivroLocado(book);
		book.setDisponivel(false);
	}
	
	public void devolverLivro(Livro livro) {
		this.livros.remove(livro);
	}

	public Datas getData() {
		return data;
	}

	public void setData(Datas data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
}
