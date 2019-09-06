package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class Conexao {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/bluebook";
	private static final String USER = "root";
	private static final String SENHA = "1234";

	public static Connection getConnection() {
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USER, SENHA);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Erro ao tentar conectar " + e.getMessage());
		}
		return null;
	}

	public static void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Erro ao fechar conexão " + e.getMessage());
			}
		}

	}

	public static void closeConnection(Connection con, PreparedStatement pstm) {
		closeConnection(con);
		if (pstm != null) {
			try {
				pstm.close();
			} catch (SQLException e) {
				System.out.println("Erro ao fechar conexão " + e.getMessage());
			}
		}

	}

	public static void closeConnection(Connection con, PreparedStatement pstm, ResultSet rs) {
		closeConnection(con, pstm);
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("Erro ao fechar conexão " + e.getMessage());
			}
		}
	}

}
