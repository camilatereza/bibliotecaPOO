package ufpb.poo.biblioteca;

public class Funcionario extends Pessoa {
	
	public Funcionario (String cpf,long senha) {
		this("", cpf, senha);
	}
	
	public Funcionario(String nome, String cpf, long senha) {
		super(nome, cpf, senha);
	}
}