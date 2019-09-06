package ufpb.poo.biblioteca;

public enum Genero {
	GENERALIDADES(1), FILOSOFIA(2), RELIGIAO(3), SOCIAIS(4), LINGUAGEM(5), CIENCIAS(6), TECNOLOGIA(7), ARTE(9),
	LITERATURA(10), HISTORIA_GEOGRAFIA(11);

	int valor;

	Genero(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	
	
	
}
