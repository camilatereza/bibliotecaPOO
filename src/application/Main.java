package application;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	private static Stage stage;

	private static Scene login, principal, telaLivroOutros, telaLivroCadastro, telaClienteOutros, telaClienteCadastro,
			emprestimo, devolucao;

	@Override
	public void start(Stage stage) throws Exception {
		// Start(Stage stage)-> e o que inicia a aplicação
		// Primeira tela a ser mostrada quando inicia
		Main.stage = stage;// aqui eu setei o stage estatico para receber o stage que eu passei como
							// parameto,
		// fica mais facil de trabalhar desse jeito
		// Parent -> é um tipo de Pane ou stage que ja vem com children, esses
		// nomes(Parent,children) e proprio do XML
		Parent telaLogin = FXMLLoader.load(getClass().getResource("Telalogin.fxml"));
		stage.setTitle("BLUEBOOK Company.");
		// Scene-> fica dentro de um stage
		Scene login = new Scene(telaLogin);
		// setScene(Scene scene) -> coloca como visivel uma determinada cena de um stage
		stage.setScene(login);
		// show-> abre o stage na tela
		stage.show();

		// Aqui criamos varias telas que vão ser utilizadas no decorrer do app
		Parent telaPrincipal = FXMLLoader.load(getClass().getResource("TelaPrincipal.fxml"));
		Main.principal = new Scene(telaPrincipal);

		Parent telaLivroOutros = FXMLLoader.load(getClass().getResource("TelaLivroOutros.fxml"));
		Main.telaLivroOutros = new Scene(telaLivroOutros);

		Parent telaLivroCadastro = FXMLLoader.load(getClass().getResource("TelaLivroCadastro.fxml"));
		Main.telaLivroCadastro = new Scene(telaLivroCadastro);

		Parent telaClienteOutros = FXMLLoader.load(getClass().getResource("TelaUsuarioOutros.fxml"));
		Main.telaClienteOutros = new Scene(telaClienteOutros);

		Parent telaClienteCadastro = FXMLLoader.load(getClass().getResource("TelaUsuarioCadastro.fxml"));
		Main.telaClienteCadastro = new Scene(telaClienteCadastro);

		Parent telaEmprestimo = FXMLLoader.load(getClass().getResource("Emprestimo.fxml"));
		Main.emprestimo = new Scene(telaEmprestimo);

		Parent telaDevolucao = FXMLLoader.load(getClass().getResource("Devolucao.fxml"));
		Main.devolucao = new Scene(telaDevolucao);

	}

	public static void MudarTela(String tela) {
		switch (tela) {
		// Switch simples, para setar a cena do stage estatico, adaptado nos Controllers
		// de cada FXML
		case "login":
			stage.setScene(login);
			break;
		case "principal":
			stage.setScene(principal);
			break;
		case "telaLivroOutros":
			stage.setScene(telaLivroOutros);
			break;
		case "telaLivroCadastro":
			stage.setScene(telaLivroCadastro);
			break;
		case "telaClienteOutros":
			stage.setScene(telaClienteOutros);
			break;
		case "telaClienteCadastro":
			stage.setScene(telaClienteCadastro);
			break;
		case "emprestimo":
			stage.setScene(emprestimo);
			break;
		case "devolucao":
			stage.setScene(devolucao);
			break;
		}
	}
	
	// isso eu não sei para que serve,mas veio junto então so aceitei
	public static void main(String[] args) {
		launch(args);
	}
}
