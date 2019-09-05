package testes;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import ufpb.poo.biblioteca.Datas;
import ufpb.poo.biblioteca.Funcionario;
import ufpb.poo.biblioteca.Livro;
import ufpb.poo.biblioteca.SistemaLibrary;
import ufpb.poo.biblioteca.Usuario;
import ufpb.poo.biblioteca.exception.FuncionarioException;
import ufpb.poo.biblioteca.exception.UsuarioException;

public class testeBiblioteca {

	public static void main(String[] args) {
		SistemaLibrary sistema = new SistemaLibrary();
		boolean sair = false;

		while (!sair) {

			String opcao = JOptionPane.showInputDialog(
					"Escolha uma das opções: \n" + "1 - Cadastrar Usuário \n" + "2 - Cadastrar Livro \n"
							+ "3 - Cadastrar Funcionário \n" + "4 - Efetuar empréstimo \n" + "5 - Devolver livro");

			switch (opcao) {
			
			// Livro(String codigo, int ano, int genero, int idioma, String titulo, String
			// autor, boolean disponivel,
			// int quantidade)
			
			case "2":
				Livro objLivro = new Livro();
				
				Calendar dia_do_emprestimo = Calendar.getInstance();
				Calendar today = Calendar.getInstance();
				
				objLivro.setDiasEmprestimo(today);
				System.out.println(objLivro.getDias().getDataEmprestimo().getTime());
				
				objLivro.getDias().gerarData_de_entrega();
				System.out.println(objLivro.getDias().getData_prevista_entrega().getTime());
				System.out.println(objLivro.getDias().getDataEmprestimo().getTime());
				
				
				
				

//				sistema.cadastrarLivro(objLivro);
//				System.out.println("Tudo certo!!");
//				System.out.println(sistema.listaLivro);
				break;
			case "1":
				Usuario objUsuario = new Usuario("Marcos", "123456", 1234);
				try {
					sistema.cadastrarUsuario(objUsuario);
				} catch (UsuarioException ex) {
					System.out.println(ex.getMessage());
				}
				System.out.println("Tudo certo!!");
				System.out.println(sistema.listaUsuario);
				break;
			case "3":
				Funcionario objFuncionario = new Funcionario("Marcos", "123456", 1234);
				try {
					sistema.cadastrarFuncionario(objFuncionario);
				} catch (FuncionarioException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Tudo certo!!");
				System.out.println(sistema.listaUsuario);
				break;
//			case "4":
//				Livro objLivro1 = new Livro("123", 2014, 5, 2, "O genio", "Geiseel", 2);
//				Usuario objUsuario1 = new Usuario("Marcos", "123456", 1234);
//				try {
//					sistema.efetuarEmprestimo(objLivro1, objUsuario1);
//				} catch (LivroException e) {
//					System.out.println(e.getMessage());
//				}
//				System.out.println("Tudo certo!!");
//				System.out.println(objLivro1.isDisponivel());
//				System.out.println(objUsuario1.getLivroLocado());
//				break;
//			case "5":
//				Livro objLivro2 = new Livro("123", 2014, 5, 2, "O genio", "Geiseel", 2);
//				Usuario objUsuario2 = new Usuario("Marcos", "123456", 1234);
//				sistema.efetuarDevolucao(objLivro2, objUsuario2);
//				System.out.println("Tudo certo!!");
//				System.out.println(objLivro2.isDisponivel());
//				System.out.println(objUsuario2.getLivroLocado());
//				break;
			case "6":
				sair = true;
				break;

			case "7":
				Date data = new Date();
				DateFormat formataData = DateFormat.getDateInstance(); // MOSTRA SÓ A DATA
				System.out.println(formataData.format(data));
				System.out.println(data);
				break;

			default:
				System.out.println("Opção inválida!");
			}

		}

	}

}
