package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import ufpb.poo.biblioteca.SistemaLibrary;
import ufpb.poo.biblioteca.Funcionario;;






public class LoginController implements Initializable {
	
	@FXML
	private TextField usuariocampotexto;
	@FXML
	private PasswordField senhacampotexto;
	@FXML
	private Button entrar;
	
	
	
	
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

	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}
	
	
