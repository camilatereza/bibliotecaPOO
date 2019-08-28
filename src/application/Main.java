package application;
import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage Stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Telalogin.fxml"));
		Parent middle = FXMLLoader.load(getClass().getResource("TelaPrincipal.fxml")); 
		Scene login = new Scene(root);
		Scene principal = new Scene(middle);
		Stage.setScene(login);
		Stage.setScene(principal);
		Stage.setResizable(false);
		Stage.show();
	}
	
	public static void main(String [] args) {launch(args);}
}
