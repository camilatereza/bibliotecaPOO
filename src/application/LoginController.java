package application;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.event.EventHandler;
import javafx.stage.Stage;





public class LoginController implements Initializable {
	
	@FXML
	private TextField usuariocampotexto;
	@FXML
	private PasswordField senhacampotexto;
	@FXML
	private Button entrar;
	@FXML
	private Label usuarioetiqueta,senhaetiqueta,titulonome;
	@FXML	
	private ImageView lithor;
	
	


	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
	
	
