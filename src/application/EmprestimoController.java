package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EmprestimoController implements Initializable {

	@FXML
	private TextField txNome,txCpf,txCodigo,txTitulo,txAutor;
	@FXML
	private Button btVoltar,btEmprestar;
	
	@FXML protected void voltarParaPrincipal (ActionEvent e) {
		Main.MudarTela("principal");
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {}

}
