package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaUsuarioCadastroController implements Initializable {

	@FXML
	private TextField txTitulo, txAutor, txAnoPublicacao, txGenero, txIdioma, txGenero1, txIdioma1, txIdioma2;

	@FXML
	private Button btCadastrar, btVoltar;

	@FXML
	protected void voltarParaPrincipal() {
		Main.MudarTela("principal");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
