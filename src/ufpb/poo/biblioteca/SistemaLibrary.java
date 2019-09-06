package ufpb.poo.biblioteca;

import java.util.ArrayList;
import java.util.List;

import connections.dao.LivroDAO;
import ufpb.poo.biblioteca.exception.*;

public class SistemaLibrary implements Library {
	
	
	private List<Livro> listaLivro;
	private List<Funcionario> listaFuncionario;
	private List<Usuario> listaUsuario;
	
	private LivroDAO livroDao = new LivroDAO();
	
	public void carregarLivro() {
		listaLivro = livroDao.consultarLivro();
	}
	
	public SistemaLibrary() {
		super();
		listaLivro = new ArrayList<Livro>();
		listaFuncionario = new ArrayList<Funcionario>();
		listaUsuario = new ArrayList<Usuario>();
	}

	public boolean verificaCodigo(Livro livro) {
		boolean encontrou = false;
		for (Livro l : listaLivro)
			if (l.getCodigo().equals(livro.getCodigo()))
				encontrou = true;
		return encontrou;
	}

	public void cadastrarLivro(Livro book) {
		listaLivro.add(book);
	}

	//a exception é lançada caso algum atibuto do livro não tenha sido informado
	public Livro alterarLivro(Livro book) throws LivroException {
		if (book == null){
			throw new LivroException("Livro inválido");
		}
		return this.buscaLivro(book);
	}

	//exception lançada caso o livro não exista na biblioteca
	public Livro buscaLivro(Livro book) throws LivroException {
		Livro livro = null;
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(book.getCodigo())) {
				livro = l;
			}
		}
		if (livro == null)
			throw new LivroException("Livro não encontrado");
		return livro;
	}

	public boolean removerLivro(Livro book) throws LivroException {
		boolean tmp = false;
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(book.getCodigo())) {
				tmp = true;
				listaLivro.remove(book);
			}
		}
		if (tmp == false) {
			throw new LivroException("Livro não encontrado!");
		}
		return tmp;
	}

	//gera a exception se o usuario não existir
	public Usuario consultarUsuario(Usuario cliente) throws UsuarioException {
		Usuario usuario = null;
		for (Usuario u : listaUsuario)
			if (u.getCpf().equals(cliente.getCpf()))
				usuario = u;
		if (usuario == null)
			throw new UsuarioException("Usuário não encontrado");
		return usuario;
	}

	//retorna a exception se existir um funcionario já cadastrado com o cpf informado
	public void cadastrarUsuario(Usuario cliente) throws UsuarioException {
		if (isEqualsCpfUsu(cliente)) {
			throw new UsuarioException("Usuário já existe!");
		}
		listaUsuario.add(cliente);
	}

	public Usuario alterarUsuario(Usuario cliente) throws UsuarioException {
		if(cliente == null) {
			throw new UsuarioException("Usuario inválido");
		}
		return this.consultarUsuario(cliente);
	}

	public boolean removerUsuario(Usuario cliente) throws UsuarioException{
		boolean tmp = false;
		for (Usuario c : listaUsuario) {
			if (c.getCpf().equals(cliente.getCpf())) {
				tmp = true;
				listaUsuario.remove(cliente);
			}
		}
		if (tmp == false) {
			throw new UsuarioException("Usuario não encontrado!");
		}
		return tmp;
	}

	//retorna a exception se existir um funcionario já cadastrado com o cpf informado
	@Override
	public void cadastrarFuncionario(Funcionario fun) throws FuncionarioException {
		if (isEqualsCpfFun(fun)) {
			throw new FuncionarioException("Funcionario já existe!");
		}
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
	public boolean verificarLogin(Funcionario funcionario) {
		boolean logado = false;
		for (Funcionario f : this.listaFuncionario)
			if (f.equals(funcionario))
				logado = true;
		return logado;
	}

	public ArrayList<Usuario> buscaUsu(String nome) throws UsuarioException {
		ArrayList<Usuario> usuariosEncontrados = new ArrayList<Usuario>();
		for (Usuario c : listaUsuario)
			if (c.getNome().equals(nome))
				usuariosEncontrados.add(c);
		if (usuariosEncontrados.size() == 0)
			throw new UsuarioException("Nenhum usuário encontrado com este nome!");
		return usuariosEncontrados;
	}

	public Usuario buscaCpf(String cpf) throws UsuarioException {
		Usuario usuario = null;
		for (Usuario c : listaUsuario)
			if (c.getCpf().equals(cpf))
				usuario = c;
		if (usuario == null)
			throw new UsuarioException("Nenhum usuário encontrado com este cpf!");
		return usuario;
	}

	//verifica se existe um outro Usuario com o mesmo CPF que o informado
	public boolean isEqualsCpfUsu(Usuario usuario) {
		boolean cpfIgual = false;
		for (Usuario c : listaUsuario)
			if (usuario.getCpf().equals(c.getCpf()))
				cpfIgual = true;
		return cpfIgual;
	}
	
	//verifica se existe um outro Funcionario com o mesmo CPF que o informado
	public boolean isEqualsCpfFun(Funcionario funcionario) {
		boolean cpfIgual = false;
		for (Usuario c : listaUsuario)
			if (funcionario.getCpf().equals(c.getCpf()))
				cpfIgual = true;
		return cpfIgual;
	}
}
