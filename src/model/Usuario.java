package model;

public class Usuario extends Pessoa {

	private Endereco end;

	public Usuario() {
		super();
	}
	
	public Usuario(String nome, String cpf, Endereco ende) {
		super(nome, cpf, 0);
		this.end = ende;
	}

	public Usuario(String nome, String cpf, long senha) {
		super(nome, cpf, senha);
//		livroLocado = new ArrayList<Livro>();
	}
	
//	public ArrayList<Livro> getLivroLocado() {
//		return livroLocado;
//	}
//
//	public void setLivroLocado(Livro livroLocado) {
//		this.livroLocado.add(livroLocado);
//	}
//
//	public void setLivroLocado(ArrayList<Livro> livroLocado) {
//		this.livroLocado = livroLocado;
//	}
//
//	public String getContato() {
//		return contato;
//	}
//
//	public void setContato(String contato) {
//		this.contato = contato;
//	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}
	
}