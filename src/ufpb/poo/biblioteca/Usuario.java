package ufpb.poo.biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class Usuario extends Pessoa {

	private ArrayList<Livro> livroLocado;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private String contato;
	private Endereco end;

	public Usuario(String nome, String cpf, long senha, ArrayList<Livro> locado, Date emprestimo, Date devolucao,
			String conta, Endereco ende) {
		super(nome, cpf, senha);
		this.livroLocado = locado;
		this.contato = conta;
		this.dataEmprestimo = emprestimo;
		this.dataDevolucao = devolucao;
		this.end = ende;
	}

	public Usuario(String nome, String cpf, long senha) {
		super(nome, cpf, senha);
		livroLocado = new ArrayList<Livro>();
		dataEmprestimo = new Date();
		dataDevolucao = new Date();

	}

	public ArrayList<Livro> getLivroLocado() {
		return livroLocado;
	}

	public void setLivroLocado(Livro livroLocado) {
		this.livroLocado.add(livroLocado);
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public void setLivroLocado(ArrayList<Livro> livroLocado) {
		this.livroLocado = livroLocado;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public void devolverLivro(Livro livro) {
		this.livroLocado.remove(livro);
	}

}