package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaPrincipalController implements Initializable {
	
	
	
	@FXML
	private Button btcliente,btlivro,btfuncionario,btemprestimo,btdevolucao;
	@FXML
	private Label lblData;
	
	protected void IrParaUsuario () {
		Main.MudarTela("TelaClienteOutros");
	}
	
	protected void IrParaLivro () {
		Main.MudarTela("TelaClienteOutros");
	}
	
	protected void IrParaFuncionario () {
		Main.MudarTela("TelaUsuarioOutros");
	}
	
	protected void voltarParaPrincipal () {
		Main.MudarTela("TelaPrincipal");
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}
