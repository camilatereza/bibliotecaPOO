package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class TelaUsuarioOutrosController<GroupTreeObject> implements Initializable {

	@FXML
	private TextField txCpf;

	@FXML
	private TextField txNome;

	@FXML
	private TextField txNumero;

	@FXML
	private TextField txBairro;

	@FXML
	private TextField txCidade;

	@FXML
	private TextField txEstado;

	@FXML
	private TextField txLogradouro;

	@FXML
	private TextField txCpfConsulta;

	@FXML
	private Button btPesquisaCpf;

	@FXML
	private TextField txNomeConsulta;

	@FXML
	private TableColumn<?, ?> tabelaCpf;

	@FXML
	protected void voltarParaPrincipal() {
		Main.MudarTela("principal");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
