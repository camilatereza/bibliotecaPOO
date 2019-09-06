package ufpb.poo.biblioteca;

public enum Idioma {
	AMERICANA_CANADENSE(1), INGLESA(2), ALEMA(3), FRANCESA(4), ITALIANA_ROMENA(5), ESPANHOL(6), PORTUGUESA(7),
	LATINA(8), GREGO_LINGUASCLASSICAS(9), OUTRAS(10);
	
	int valor;

	Idioma(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
}
