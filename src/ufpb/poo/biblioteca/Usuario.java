package ufpb.poo.biblioteca;

import java.util.ArrayList;

public class Usuario extends Pessoa {

	private ArrayList<Livro> livroLocado;
	private String tempoLocado;
	private String contato;
	private Endereco end;

	public Usuario(String nome, String cpf, long senha, ArrayList<Livro> locado, String duracao, String conta, Endereco ende) {
		super(nome, cpf, senha);
		this.livroLocado = locado;
		this.tempoLocado = duracao;
		this.contato = conta;
		this.end = ende;
	}

	public ArrayList<Livro> getLivroLocado() {
		return livroLocado;
	}

	public void setLivroLocado(Livro livroLocado) {
		this.livroLocado.add(livroLocado);
	}

	public String getTempoLocado() {
		return tempoLocado;
	}

	public void setTempoLocado(String tempoLocado) {
		this.tempoLocado = tempoLocado;
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

}