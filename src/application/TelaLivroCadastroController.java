package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaLivroCadastroController implements Initializable {
	
	@FXML
	private TextField txTitulo,txAutor,txAnoPublicacao,txGenero,txIdioma;
	@FXML
	private Button btCadastrar,btVoltar;
	
	
	
	@FXML protected void voltarParaPrincipal (ActionEvent e) {
		Main.MudarTela("principal");
	}
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {}
	
}
