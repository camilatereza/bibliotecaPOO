package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import ufpb.poo.biblioteca.Genero;
import ufpb.poo.biblioteca.Idioma;
import ufpb.poo.biblioteca.Livro;
import ufpb.poo.biblioteca.SistemaLibrary;
import ufpb.poo.biblioteca.Usuario;

public class TelaLivroCadastroController implements Initializable {

	private SistemaLibrary sistema;
	@FXML
	private TextField txTitulo, txAutor, txAnoPublicacao, txGenero, txIdioma;
	@FXML
	private Button btCadastrar, btVoltar;

	@FXML
	protected void voltarParaPrincipal(ActionEvent e) {
		Main.MudarTela("principal");
	}

	@FXML
	public void cadastroLivro(ActionEvent e) {
		int genero = 0, idioma = 0;
		try {
			genero = this.obterGenero(txGenero.getText());
			idioma = this.obterGenero(txIdioma.getText());
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Gênero inválido!!");
		}

		sistema.cadastrarLivro(new Livro(2019, genero, idioma, txTitulo.getText(), txAutor.getText(), true, 1));

	}
	
	//Paramos aqui!!!!!
	@FXML
	public void opcaoGeneros(ActionEvent e) {
		
	}

	public int obterGenero(String gen) throws Exception {
		Genero[] generos = Genero.values();
		Genero generoObtido = Genero.valueOf(gen);
		int i = -1;
		for (Genero g : generos) {
			if (g.getValor() == generoObtido.getValor()) {
				i = g.getValor();
			}
		}
		if (i == -1)
			throw new Exception("Gênero inválido!");
		return i;
	}

	public int obterIdioma(String idioma) throws Exception {
		Idioma[] idomas = Idioma.values();
		Idioma generoObtido = Idioma.valueOf(idioma);
		int i = -1;
		for (Idioma g : idomas) {
			if (g.getValor() == generoObtido.getValor()) {
				i = g.getValor();
			}
		}
		if (i == -1)
			throw new Exception("Gênero inválido!");
		return i;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
