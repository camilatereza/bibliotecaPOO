package application;

import java.awt.Event;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;
import javax.xml.stream.EventFilter;
import javax.xml.stream.events.XMLEvent;

import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class LoginController implements Initializable {
	
	@FXML
	private TextField txLogin = new TextField();
	
	@FXML
	private PasswordField txSenha;
	@FXML
	private Button entrar;
	
	@FXML
	private TelaPrincipalController objTela;
	
	@FXML 
	protected void onActionLogin(ActionEvent e) {
		
		System.out.println("oi");
		String algo = txLogin.getText();
		System.out.println(algo);
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
		
}
	
	
