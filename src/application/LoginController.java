package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;







public class LoginController implements Initializable {
	
	@FXML
	private TextField usuariocampotexto;
	@FXML
	private PasswordField senhacampotexto;
	@FXML
	private Button entrar;

	@FXML 
	protected void onActionLogin (ActionEvent e) {
		System.out.println("TOMAR NO CU CHIQUITITA");
	}
	
	


	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
	
	
