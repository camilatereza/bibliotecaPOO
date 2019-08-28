package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;

public class TelaLivroOutrosController implements Initializable{
	
	@FXML
	private TextField txCodigo, txTitulo, txAutor, txAnoPublicacao, txGenero, txDisponibilidade, txIdioma, txConsultaAutor, txConsultaTitulo;
	@FXML
	private Button btVoltar, btExcluir, btAlterar,btConsultaAutor,btConsultaTitulo;
	@FXML
	private TreeTableColumn<TelaLivroOutrosController,String> tabelaCodigo,tabelaAutor,tabelaTitulo;
	
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
