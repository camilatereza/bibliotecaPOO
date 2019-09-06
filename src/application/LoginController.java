package application;


import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
	
	@FXML
	private TextField usuariocampotexto;
	
	@FXML
	private PasswordField senhacampotexto;
	@FXML
	private Button entrar;
	
	@FXML
	private TelaPrincipalController objTela;
	
	@FXML 
	protected void onActionLogin(ActionEvent e) {
		
		System.out.println("oi");
		String algo = usuariocampotexto.getText();
		System.out.println(algo);
	}
	
	
	@FXML
	protected void OnActionLogin (ActionEvent e) {
		
		String login = usuariocampotexto.getText();
		String senha = senhacampotexto.getText();
		
//		Long senha = Long.parseLong(txSenha.getText());
//		
//		Funcionario fun = new Funcionario(txLogin.getText(),senha);
//		SistemaLibrary sis = new SistemaLibrary();
//		while(!sis.verificarLogin(fun)) {
//			Alert dialogoErro = new Alert (Alert.AlertType.WARNING);
//			dialogoErro.setTitle("USUARIO NÃO ENCONTRADO");
//			dialogoErro.setContentText("Usuario ou senha incorretos, Por favor tente novamente.");
//			dialogoErro.showAndWait();
//			continue;
//		}
		if(this.verificarCampos(login, senha)) {
			JOptionPane.showMessageDialog(null, "Os campos são obrigatórios","Erro login", JOptionPane.ERROR_MESSAGE);
		}else {
			if(senha.equals("admin") && senha.equals("admin")){
				JOptionPane.showMessageDialog(null, "Seja bem vindo!","Bem vindo!", JOptionPane.INFORMATION_MESSAGE);
				Main.MudarTela("principal");
			}else {
				JOptionPane.showMessageDialog(null, "Login ou senha incorreto!","Erro login", JOptionPane.INFORMATION_MESSAGE);
				this.limparCampos();
			}
		}			
		
			
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public boolean verificarCampos(String login, String senha) {
		if(login.equals("") || senha.equals("")) {
			return true;
		}
		return false;
	}
	public void limparCampos() {
		senhacampotexto.setText("");
		usuariocampotexto.setText("");
	}
}
	
	
