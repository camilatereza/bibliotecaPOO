package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;

public class TelaUsuarioOutrosController<GroupTreeObject> implements Initializable {
	@FXML
	private TextField txCpf,txNome,txLogradouro,txNumero,txBairro,txCidade,txEstado,txCep,txNomeConsulta,txCpfConsulta;
	@FXML
	private Button btVoltar,btExcluir,btAlterar,btPesquisaNome,btPesquisaCpf;
	
	
	
	
	@FXML protected void voltarParaPrincipal () {
		Main.MudarTela("principal");
	}
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {}

}
