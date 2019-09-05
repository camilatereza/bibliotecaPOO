package application;

<<<<<<< HEAD
import java.awt.Event;
=======
import java.io.IOException;
>>>>>>> ce74dd7d727f868109a7a141a102c0be5e7b9279
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;
import javax.xml.stream.EventFilter;
import javax.xml.stream.events.XMLEvent;

import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
<<<<<<< HEAD
import javafx.scene.image.ImageView;
=======
import ufpb.poo.biblioteca.SistemaLibrary;
import ufpb.poo.biblioteca.Funcionario;;





>>>>>>> ce74dd7d727f868109a7a141a102c0be5e7b9279

public class LoginController implements Initializable {
	
	@FXML
	private TextField txLogin = new TextField();
	
	@FXML
	private PasswordField txSenha;
	@FXML
	private Button entrar;
	
	@FXML
	private TelaPrincipalController objTela;
	
<<<<<<< HEAD
	@FXML 
	protected void onActionLogin(ActionEvent e) {
		
		System.out.println("oi");
		String algo = txLogin.getText();
		System.out.println(algo);
	}
=======
	
	
	@FXML
	protected void OnActionLogin (ActionEvent e) {
		/*
		Long senha = Long.parseLong(senhacampotexto.getText());
		Funcionario fun = new Funcionario (usuariocampotexto.getText(),senha);
		SistemaLibrary sis = new SistemaLibrary();
		while(!sis.verificarLogin(fun)) {
			Alert dialogoErro = new Alert (Alert.AlertType.WARNING);
			dialogoErro.setTitle("USUARIO NÃO ENCONTRADO");
			dialogoErro.setContentText("Usuario ou senha incorretos, Por favor tente novamente.");
			dialogoErro.showAndWait();
			continue;
		}*/
		
			Main.MudarTela("principal");
		
	}

>>>>>>> ce74dd7d727f868109a7a141a102c0be5e7b9279
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
		
}
	
	
