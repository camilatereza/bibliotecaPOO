package application;

import java.net.URL;
import java.text.DateFormat;
import java.util.ResourceBundle;

import javafx.scene.control.MenuItem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.Pane;

import java.util.Date;

public class TelaPrincipalController implements Initializable {

	// Aqui tem a declaração dos atributos que estão no XML e que serão modificados
	// ou fazem alguma ação
	// sempre com a declaração @FXML? Sempre,Sempre e assim que o arquivo conhece.
	@FXML
	private Pane fundo;

	@FXML
	private Label lblData;

	@FXML
	private MenuButton mbLivro, mbCliente;

	@FXML
	private MenuItem miCadastrarCliente;

	@FXML
	private MenuItem miAlterarCliente;

	@FXML
	private MenuItem miExcluirCliente;

	@FXML
	private MenuItem miConsultarCliente;

	@FXML
	private MenuItem miCadastro;

	@FXML
	private MenuItem miAlterarLivro;

	@FXML
	private MenuItem miExcluirLivro;

	@FXML
	private MenuItem miConsultarLivro;

	@FXML
	private Button btdevolucao, btemprestimo, btSair;

	// Metodos de troca de Tela, vulgo scene
	// Main. -> Para chamar o metodo de mudar de tela que está lá(lá = classe
	// chamada Main)

	@FXML
	protected void IrParaDevolucao(ActionEvent e) {
		Main.MudarTela("devolucao");
	}

	@FXML
	protected void IrParaEmprestimo(ActionEvent e) {
		Main.MudarTela("emprestimo");
	}

	@FXML
	protected void IrParaLivro(ActionEvent e) {
		Main.MudarTela("telaLivroOutros");
	}

	@FXML
	protected void IrParaCliente(ActionEvent e) {
		Main.MudarTela("telaClienteOutros");
	}

	@FXML
	protected void IrParaCadastroLivro(ActionEvent e) {
		Main.MudarTela("telaLivroCadastro");
	}

	@FXML
	protected void IrParaCadastroCliente(ActionEvent e) {
		Main.MudarTela("telaClienteCadastro");
	}
	
	@FXML
	protected void FecharSistema(ActionEvent e) {
		System.exit(0);
	}
	

	// Ja vem com a implementação do inicializable,quando a tela e chamada ele ja e
	// ativado
	// lblData -> Um label, em portugues etiqueta, que será a data
	// setText(String msg) -> Bota o texto msg no label

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblData.setText(java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date()));
	}

}
