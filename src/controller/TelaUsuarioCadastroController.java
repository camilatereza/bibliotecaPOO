package controller;

import java.util.ResourceBundle;
import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Endereco;
import model.SistemaLibrary;
import model.Usuario;
import model.exception.UsuarioException;

public class TelaUsuarioCadastroController implements Initializable {

	SistemaLibrary sistema = new SistemaLibrary();

	@FXML
	private TextField txNome, txLogradouro, txNumero, txCep, txCidade, txCpf, txBairro, txEstado;
	
	@FXML
	private Button btVoltar, btCadastrar;

	@FXML
	public void cadastrarCliente(ActionEvent event) {
		String nome = txNome.getText();
		String logradouro = txLogradouro.getText();
		String numero = txNumero.getText();
		String cep = txCep.getText();
		String cidade = txCidade.getText();
		String cpf = txCpf.getText();
		String bairro = txBairro.getText();
		String estado = txEstado.getText();

		Endereco end = new Endereco(logradouro, numero, bairro, estado, cidade, cep);
		Usuario cliente = new Usuario(nome, cpf, end);
		try {
			sistema.cadastrarUsuario(cliente);
		} catch (UsuarioException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	@FXML
	void voltarParaPrincipal(ActionEvent event) {
		Main.MudarTela("principal");
	}
	
	@Override
	public void initialize(java.net.URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
