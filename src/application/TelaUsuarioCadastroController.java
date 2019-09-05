package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaUsuarioCadastroController implements Initializable{
	@FXML
	private TextField txCpf,txNome,txLogradouro,txNumero,txBairro,txEstado,txCidade,txCep;
	@FXML
	private Button btVoltar,btCadastrar;
	
	
	
	@FXML protected void voltarParaPrincipal () {
		Main.MudarTela("principal");
	}
	
	
	
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {}
	
}
