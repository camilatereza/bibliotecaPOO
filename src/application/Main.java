package application;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Stage stage;
	
	private static Scene login,principal,telaLivroOutros,telaLivroCadastro,telaUsuarioOutros,telaUsuarioCadastro,emprestimo,devolucao;
	
	@Override
	public void start(Stage stage) throws Exception {
		//Primeira tela a ser mostrada quando inicia
		Main.stage = stage;
		Parent telaLogin = FXMLLoader.load(getClass().getResource("Telalogin.fxml")); 
		stage.setTitle("BLUEBOOK Company.");
		Scene login  = new Scene(telaLogin);
		stage.setScene(login);
		stage.show();
		//
		
		Parent telaPrincipal = FXMLLoader.load(getClass().getResource("TelaPrincipal.fxml"));
		Main.principal = new Scene(telaPrincipal);	
		
		Parent telaLivroOutros = FXMLLoader.load(getClass().getResource("TelaLivroOutros.fxml"));
		Main.telaLivroOutros = new Scene(telaLivroOutros);
		
		Parent telaLivroCadastro = FXMLLoader.load(getClass().getResource("TelaLivroCadastro.fxml"));
		Main.telaLivroCadastro = new Scene(telaLivroCadastro);
		
		Parent telaUsuarioOutros = FXMLLoader.load(getClass().getResource("TelaUsuarioOutros.fxml"));
		Main.telaUsuarioOutros = new Scene (telaUsuarioOutros);
		
		Parent telaUsuarioCadastro = FXMLLoader.load(getClass().getResource("TelaUsuarioCadastro.fxml"));
		Main.telaUsuarioCadastro = new Scene (telaUsuarioCadastro);
	}
	
	
	
	public static void MudarTela (String tela){
		switch(tela) {
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
			case "telaUsusarioOutros":
				stage.setScene(telaUsuarioOutros);
				break;
			case "telaUsuarioCadastro":
				stage.setScene(telaUsuarioCadastro);
				break;
			case "emprestimo":
				stage.setScene(emprestimo);
				break;
			case "devolucao":
				stage.setScene(devolucao);
				break;
		}
	}
	

	
	
	
	public static void main(String [] args) {launch(args);}
}
