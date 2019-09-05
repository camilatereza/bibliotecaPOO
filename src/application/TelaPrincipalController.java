package application;

import java.net.URL;
import java.text.DateFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Calendar;
import java.util.Date;

public class TelaPrincipalController implements Initializable {
	
	
	//Aqui tem a declara��o dos atributos que est�o no XML e que ser�o modificados ou fazem alguma a��o
	//sempre com a declara��o @FXML? Sempre,Sempre e assim que o arquivo conhece. 
	@FXML
	private Button btcliente,btlivro,btfuncionario,btemprestimo,btdevolucao;
	@FXML
	private Label lblData;
	
	//Metodos de troca de Tela, vulgo scene
	//Main. -> Para chamar o metodo de mudar de tela que est� l�(l� = classe chamada Main)
	@FXML protected void IrParaUsuario (ActionEvent e) {
		Main.MudarTela("telaClienteOutros");
	}
	@FXML protected void IrParaLivro (ActionEvent e) {
		Main.MudarTela("telaLivroOutros");
	}
	@FXML protected void IrParaFuncionario (ActionEvent e) {
		Main.MudarTela("telaUsuarioOutros");
	}
	
	//Ja vem com a implementa��o do inicializable,quando a tela e chamada ele ja e ativado
	//lblData -> Um label, em portugues etiqueta, que ser� a data
	//setText(String msg) -> Bota o texto msg no label
	@Override
<<<<<<< HEAD
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
=======
	public void initialize(URL location, ResourceBundle resources) {lblData.setText(java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date ()));}
>>>>>>> ce74dd7d727f868109a7a141a102c0be5e7b9279

}
