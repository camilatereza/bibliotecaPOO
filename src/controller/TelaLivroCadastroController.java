package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Genero;
import model.Idioma;
import model.Livro;
import model.SistemaLibrary;
import view.Main;

public class TelaLivroCadastroController implements Initializable {

	private ArrayList<Genero> generos;
	private ObservableList<Genero> qualquerNome;
	private ArrayList<Idioma> idiomas;
	private ObservableList<Idioma> qualquerNome2;
	private SistemaLibrary sistema = new SistemaLibrary();
	
	@FXML
	private TextField txTitulo, txAutor, txAno, txQuant;
	@FXML
	private Button btCadastrar, btVoltar;
	@FXML
	private ComboBox<Genero> cbGenero;
	@FXML
	private ComboBox<Idioma> cbIdioma;

	
	@FXML
	protected void voltarParaPrincipal(ActionEvent e) {
		Main.MudarTela("principal");
	}

	@FXML
	public void cadastroLivro(ActionEvent e) {
		
		String titulo = txTitulo.getText();
		String autor = txAutor.getText();
		int ano = Integer.parseInt(txAno.getText());
//		int quantidade = Integer.parseInt(txQuant.getText());
		
		Genero genero = cbGenero.getValue();
		Idioma idioma = cbIdioma.getValue();

		Livro book = new Livro(ano, genero.getValor(), idioma.getValor(), titulo, autor, true);
		sistema.cadastrarLivro(book);
	}

	@FXML
	public void CarregarDados() {
		Genero[] arrayGenero = Genero.values();
		generos = new ArrayList<>();
		for(Genero g: arrayGenero) {
			generos.add(g);
		}
		
		qualquerNome = FXCollections.observableArrayList(generos);
		cbGenero.setItems(qualquerNome);
	}
	
	@FXML
	public void CarregarIdioma() {
		Idioma[] arrayIdioma = Idioma.values();
		idiomas = new ArrayList<>();
		for(Idioma i: arrayIdioma) {
			idiomas.add(i);
		}
		
		qualquerNome2 = FXCollections.observableArrayList(idiomas);
		cbIdioma.setItems(qualquerNome2);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
