package ufpb.poo.biblioteca;

import java.util.Calendar;
import java.util.Random;

public class Livro {

	private String codigo;
	private int ano;
	private int genero;
	private int idioma;
	private String titulo;
	private String autor;
	private boolean disponivel;
//	private int quantidadeDeLivros;

	private Datas dias;

	public Livro(int ano, int genero, int idioma, String titulo, String autor, boolean disponivel) {
		super();
		this.codigo = this.gerarCodigo(genero, idioma, ano);
		this.ano = ano;
		this.genero = genero;
		this.idioma = idioma;
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = disponivel;
//		this.quantidadeDeLivros = quantidade;
		this.dias = new Datas();
	}

	public Livro() {
		super();
		this.codigo = this.gerarCodigo(genero, idioma, ano);
		this.ano = 0;
		this.genero = 0;
		this.idioma = 0;
		this.titulo = "";
		this.autor = "";
		this.disponivel = false;
//		this.quantidadeDeLivros = 0;
		this.dias = new Datas();
	}

	//o codigo é numerico e usa os enum para gerar um codigo diferente para cada livro;
	//o primeiro digito do codigo indica o genero do livro, de acordo com o indice da lista de enum
	//o segundo digito indica o idioma de acordo com indice do enum
	//os dois ultimos numeros antes da virgula indicam o ano de lançamento do livro
	// por fim o numero após a virgula é um randomico para diferenciar todos os livros
	private String gerarCodigo(int gen, int idioma, int ano) {

		Random random = new Random();
		String cod = null;
		this.genero = gen;
		this.idioma = idioma;
		this.ano = ano;
		String dif = String.valueOf(random.nextInt(10000));
		cod = this.genero + this.idioma + this.ano + "." + dif;

		return cod;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public int getIdioma() {
		return idioma;
	}

	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

//	public int getQuantidadeDeLivros() {
//		return quantidadeDeLivros;
//	}
//
//	public void setQuantidadeDeLivros(int quantidadeDeLivros) {
//		this.quantidadeDeLivros = quantidadeDeLivros;
//	}

	public Datas getDias() {
		return dias;
	}

	// para enviar o dia que o livro foi alugado
	public void setDiasEmprestimo(Calendar diaEmprestimo) {
		this.dias.setDataEmprestimo(diaEmprestimo);
	}
	
	//para enviar o dia que o livro foi devolvido
	public void setDiasDevolucao(Calendar diaDevolcao) {
		this.dias.setData_da_devolucao(diaDevolcao);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livro [codigo=" + codigo + ", ano=" + ano + ", genero=" + genero + ", idioma=" + idioma + ", titulo="
				+ titulo + ", autor=" + autor + ", disponivel=" + disponivel + "]";
	}

}
