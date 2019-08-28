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
		Scene login = new Scene(root);
		Stage.setTitle("BLUEBOOK inc.");
		Stage.setScene(login);
		Stage.setResizable(false);
		Stage.show();
	}
	
	public static void main(String [] args) {launch(args);}
}
