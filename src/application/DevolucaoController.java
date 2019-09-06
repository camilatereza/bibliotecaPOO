package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DevolucaoController implements Initializable {

	@FXML
	private Label lbDevolucao;

	@FXML
	private Button btVoltar;

	@FXML
	private TableView<?> tbDevolver;

	@FXML
	private TextField txNome;

	@FXML
	private TextField txCpf;

	@FXML
	private TextField txTitulo;

	@FXML
	private TextField txAutor;

	@FXML
	private Button btBuscar;

	@FXML
	private Button btTodos;

	@FXML
	private Button btDevolver;
	
	@FXML
	void voltarParaPrincipal(ActionEvent event) {
		Main.MudarTela("principal");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
