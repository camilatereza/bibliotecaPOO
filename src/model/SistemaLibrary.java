package model;

import java.util.ArrayList;
import java.util.List;

import dao.ClienteDAO;
import dao.LivroDAO;
import model.exception.LivroException;
import model.exception.UsuarioException;

public class SistemaLibrary implements Library {

	private List<Livro> listaLivro;
	private List<Usuario> listaUsuario;

	private LivroDAO livroDao = new LivroDAO();
	private ClienteDAO clienteDao = new ClienteDAO();

	public void carregarDados() {
		listaLivro = livroDao.consultarLivro();
		listaUsuario = clienteDao.consultarCliente();
	}

	public SistemaLibrary() {
		super();
		listaLivro = new ArrayList<Livro>();
		listaUsuario = new ArrayList<Usuario>();
	
//		this.carregarDados();
	}

	public boolean verificaCodigo(Livro livro) {
		this.carregarDados();
		boolean encontrou = false;
		for (Livro l : listaLivro)
			if (l.getCodigo().equals(livro.getCodigo()))
				encontrou = true;
		return encontrou;
	}

	public void cadastrarLivro(Livro book) {
		System.out.print("Chegou no metodo do StistemaLibrary" + book);
		livroDao.cadastrarLivro(book);
	}

	// a exception � lan�ada caso algum atibuto do livro n�o tenha sido informado
	public void alterarLivro(Livro book) throws LivroException {
		if (book == null) {
			throw new LivroException("Livro inv�lido");
		}
		livroDao.alterarLivro(book);
	}

	// exception lan�ada caso o livro n�o exista na biblioteca
	public Livro buscaLivro(Livro book) throws LivroException {
		this.carregarDados();
		Livro livro = null;
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(book.getCodigo())) {
				livro = l;
			}
		}
		if (livro == null)
			throw new LivroException("Livro n�o encontrado");
		return livro;
	}

	public boolean removerLivro(Livro book) throws LivroException {
		this.carregarDados();
		boolean tmp = false;
		for (Livro l : listaLivro) {
			if (l.getCodigo().equals(book.getCodigo())) {
				tmp = true;
				livroDao.excluirLivro(book);
			}
		}
		if (tmp == false) {
			throw new LivroException("Livro n�o encontrado!");
		}
		return tmp;
	}

	// gera a exception se o usuario n�o existir
	public Usuario consultarUsuario(Usuario cliente) throws UsuarioException {
		this.carregarDados();
		Usuario usuario = null;
		for (Usuario u : listaUsuario)
			if (u.getCpf().equals(cliente.getCpf()))
				usuario = u;
		if (usuario == null)
			throw new UsuarioException("Usu�rio n�o encontrado");
		return usuario;
	}

	// retorna a exception se existir um funcionario j� cadastrado com o cpf
	// informado
	public void cadastrarUsuario(Usuario cliente) throws UsuarioException {
		if (isEqualsCpfUsu(cliente)) {
			throw new UsuarioException("Usu�rio j� existe!");
		}
		clienteDao.cadastrarCliente(cliente);
	}

	public void alterarUsuario(Usuario cliente) throws UsuarioException {
		if (cliente == null) {
			throw new UsuarioException("Usuario inv�lido");
		}
		clienteDao.alterarCliente(cliente);
	}

	public boolean removerUsuario(Usuario cliente) throws UsuarioException {
		boolean tmp = false;
		for (Usuario c : listaUsuario) {
			if (c.getCpf().equals(cliente.getCpf())) {
				tmp = true;
				clienteDao.excluirCliente(cliente);
			}
		}
		if (tmp == false) {
			throw new UsuarioException("Usuario n�o encontrado!");
		}
		return tmp;
	}

	@Override
	public ArrayList<String> listarArcevo() {
		this.carregarDados();
		ArrayList<String> livros = new ArrayList<String>();
		for (Livro l : this.listaLivro) {
			livros.add(l.getTitulo());
			livros.add(":");
			livros.add(l.getAutor());
		}
		return livros;
	}

	public ArrayList<Usuario> buscaUsu(String nome) throws UsuarioException {
		this.carregarDados();
		ArrayList<Usuario> usuariosEncontrados = new ArrayList<Usuario>();
		for (Usuario c : listaUsuario)
			if (c.getNome().equals(nome))
				usuariosEncontrados.add(c);
		if (usuariosEncontrados.size() == 0)
			throw new UsuarioException("Nenhum usu�rio encontrado com este nome!");
		return usuariosEncontrados;
	}

	public Usuario buscaCpf(String cpf) throws UsuarioException {
		this.carregarDados();
		Usuario usuario = null;
		for (Usuario c : listaUsuario)
			if (c.getCpf().equals(cpf))
				usuario = c;
		if (usuario == null)
			throw new UsuarioException("Nenhum usu�rio encontrado com este cpf!");
		return usuario;
	}

	// verifica se existe um outro Usuario com o mesmo CPF que o informado
	public boolean isEqualsCpfUsu(Usuario usuario) {
		this.carregarDados();
		boolean cpfIgual = false;
		for (Usuario c : listaUsuario)
			if (usuario.getCpf().equals(c.getCpf()))
				cpfIgual = true;
		return cpfIgual;
	}

	// verifica se existe um outro Funcionario com o mesmo CPF que o informado
	public boolean isEqualsCpfFun(Funcionario funcionario) {
		this.carregarDados();
		boolean cpfIgual = false;
		for (Usuario c : listaUsuario)
			if (funcionario.getCpf().equals(c.getCpf()))
				cpfIgual = true;
		return cpfIgual;
	}
}
