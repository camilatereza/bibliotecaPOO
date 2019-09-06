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
	private TextField txNome;

	@FXML
	private Button btEmprestar;

	@FXML
	private Button btVoltar;

	@FXML
	private TextField txCpf;

	@FXML
	private TextField txTitulo;

	@FXML
	private TextField txAutor;

	@FXML
	private TextField txCodigo;

	@FXML
	private TextField txBuscaNome;

	@FXML
	private TextField txBuscaCpf;

	@FXML
	private Button btBuscar;

	@FXML
	private TextField txBuscaTitulo;

	@FXML
	private TextField txBuscaAutor;

	@FXML
	void voltarParaPrincipal(ActionEvent event) {
		Main.MudarTela("principal");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
}
