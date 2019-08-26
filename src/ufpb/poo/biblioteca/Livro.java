package ufpb.poo.biblioteca;

import java.math.MathContext;
import java.util.Random;

public class Livro {

	private String codigo;
	private int ano;
	private int genero;
	private int idioma;
	private String titulo;
	private String autor;
	private boolean disponivel;
	private int quantidade;

	public Livro(String codigo, int ano, int genero, int idioma, String titulo, String autor, int quantidade) {
		this.codigo = codigo;
		this.ano = ano;
		this.genero = genero;
		this.idioma = idioma;
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = true;
		this.quantidade = quantidade;
	}
	public Livro() {
		super();
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
				+ titulo + ", autor=" + autor + ", disponivel=" + disponivel + ", quantidade=" + quantidade + "]";
	}

	public String gerarCodigo(int gen, int idioma, int anoo) {

		Random random = new Random();
		String cod = null;
		String genero = Integer.toString(gen);
		String lingua = Integer.toString(idioma);
		String ano = Integer.toString(anoo);
		String dif = String.valueOf(random.nextInt(10000));
		cod = genero + lingua + ano + "."+ dif;

		return cod;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
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

}
