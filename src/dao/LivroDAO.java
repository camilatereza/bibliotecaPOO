package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Livro;

public class LivroDAO {

	public void cadastrarLivro(Livro livro) {
		System.out.print("Livro ok" + livro);
		Connection con = Conexao.getConnection();
		PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement(
					"INSERT INTO livro (codigo,titulo,autor,ano,genero,idioma,disponibilidade) VALUES (?,?,?,?,?,?,?)");
			pstm.setString(1, livro.getCodigo());
			pstm.setString(2, livro.getTitulo());
			pstm.setString(3, livro.getAutor());
			pstm.setInt(4, livro.getAno());
			pstm.setInt(5, livro.getGenero());
			pstm.setInt(6, livro.getIdioma());
			pstm.setString(7, String.valueOf((livro.isDisponivel())));

			pstm.executeUpdate();

			JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");

		} catch (SQLException e) {
			System.out.println("Erro no cadastro: " + e.getMessage());
		} finally {
			Conexao.closeConnection(con, pstm);
		}
	}

	public List<Livro> consultarLivro() {
		Connection con = Conexao.getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Livro> livros = new ArrayList<Livro>();
		try {
			pstm = con.prepareStatement("SELECT * FROM livro");
			rs = pstm.executeQuery();
			while (rs.next()) {
				Livro livro = new Livro();
				livro.setCodigo(rs.getString("codigo"));
				livro.setAutor(rs.getString("autor"));
				livro.setAno(rs.getInt("ano"));
				livro.setGenero(rs.getInt("genero"));
				livro.setIdioma(rs.getInt("idioma"));
				livro.setDisponivel(Boolean.parseBoolean(rs.getString("disponibilidade")));
				livros.add(livro);
			}
		} catch (SQLException e) {
			System.out.println("Erro no cadastro: " + e.getMessage());
		} finally {
			Conexao.closeConnection(con, pstm, rs);
		}
		return livros;
	}

	public void alterarLivro(Livro livro) {
		Connection con = Conexao.getConnection();
		PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement(
					"UPDATE livro SET titulo = ?,autor = ?,ano = ?,genero = ?,idioma = ?,disponibilidade = ? WHERE codigo = ?");
			pstm.setString(1, livro.getTitulo());
			pstm.setString(2, livro.getAutor());
			pstm.setInt(3, livro.getAno());
			pstm.setInt(4, livro.getGenero());
			pstm.setInt(5, livro.getIdioma());
			pstm.setBoolean(6, livro.isDisponivel());
			pstm.setString(7, livro.getCodigo());

			pstm.executeUpdate();

			JOptionPane.showMessageDialog(null, "Livro alterado com sucesso!");

		} catch (SQLException e) {
			System.out.println("Erro na atualiza��o: " + e.getMessage());
		} finally {
			Conexao.closeConnection(con, pstm);
		}
	}

	public void excluirLivro(Livro livro) {
		Connection con = Conexao.getConnection();
		PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement(
					"DELETE FROM livro WHERE codigo = ?");
			pstm.setString(1, livro.getCodigo());

			pstm.executeUpdate();

			JOptionPane.showMessageDialog(null, "Livro exclu�do com sucesso!");

		} catch (SQLException e) {
			System.out.println("Erro na exclus�o: " + e.getMessage());
		} finally {
			Conexao.closeConnection(con, pstm);
		}
	}
	
}
