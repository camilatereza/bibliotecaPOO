package connections.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import connections.Conexao;
import ufpb.poo.biblioteca.Endereco;
import ufpb.poo.biblioteca.Usuario;

public class ClienteDAO {

	public void cadastrarCliente(Usuario cliente) {
		Connection con = Conexao.getConnection();
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(
					"INSERT INTO cliente (nome,cpf,cep,logradouro,numero,bairro,cidade,estado) VALUES (?,?,?,?,?,?,?,?)");
			
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCpf());
			pstm.setString(3, cliente.getEnd().getCep());
			pstm.setString(4, cliente.getEnd().getLogradouro());
			pstm.setString(5, cliente.getEnd().getNumero());
			pstm.setString(6, cliente.getEnd().getBairro());
			pstm.setString(7, cliente.getEnd().getCidade());
			pstm.setString(8, cliente.getEnd().getEstado());

			pstm.executeUpdate();

			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

		} catch (SQLException e) {
			System.out.println("Erro no cadastro: " + e.getMessage());
		} finally {
			Conexao.closeConnection(con, pstm);
		}
	}

	public List<Usuario> consultarCliente() {
		
		Connection con = Conexao.getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<Usuario> clientes = new ArrayList<Usuario>();
		
		try {
			pstm = con.prepareStatement("SELECT * FROM cliente");
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Usuario cliente = new Usuario();
				Endereco end = new Endereco();
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				end.setCep(rs.getString("cep"));
				end.setLogradouro(rs.getString("logradouro"));
				end.setNumero(rs.getString("numero"));
				end.setBairro(rs.getString("bairro"));
				end.setCidade(rs.getString("cidade"));
				end.setEstado(rs.getString("estado"));
				cliente.setEnd(end);
				
				clientes.add(cliente);

			}
			
		}catch(SQLException e){
			System.out.println("Erro na consulta: " + e.getMessage());
		}finally {
			Conexao.closeConnection(con, pstm, rs);
		}
		
		return clientes;
	}

	public void alterarCliente(Usuario cliente) {
		
		Connection con = Conexao.getConnection();
		PreparedStatement pstm = null;
		
		try {
			
			pstm = con.prepareStatement(
					"UPDATE cliente SET nome = ?,cep = ?,logradouro = ?,numero = ?,bairro = ?,cidade = ?, estado = ? WHERE cpf = ?");
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getEnd().getCep());
			pstm.setString(3, cliente.getEnd().getLogradouro());
			pstm.setString(4, cliente.getEnd().getNumero());
			pstm.setString(5, cliente.getEnd().getBairro());
			pstm.setString(6, cliente.getEnd().getCidade());
			pstm.setString(7, cliente.getEnd().getEstado());
			pstm.setString(8, cliente.getCpf());
			
			pstm.executeUpdate();

			JOptionPane.showMessageDialog(null, "Livro alterado com sucesso!");
			
		}catch(SQLException e){
			System.out.println("Erro na atualização: " + e.getMessage());
		}finally {
			Conexao.closeConnection(con, pstm);
		}
	}

	public void excluirCliente(Usuario cliente) {
		
		Connection con = Conexao.getConnection();
		PreparedStatement pstm = null;
		
		try {
			
			pstm = con.prepareStatement("DELETE FROM cliente WHERE cpf = ?");
			pstm.setString(1, cliente.getCpf());
			
			pstm.executeUpdate();

			JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
			
		}catch(SQLException e) {
			System.out.println("Erro na exclusão: " + e.getMessage());
		}finally {
			Conexao.closeConnection(con, pstm);
		}
		
	}
}
