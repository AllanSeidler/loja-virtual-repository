package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory cf = new ConnectionFactory();
		Connection con = cf.recuperarConexao();
		
		PreparedStatement stm = con.prepareStatement("SELECT ID, NOME, DESCRICACAO FROM PRODUTO");
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String descricao = rst.getString("DESCRICACAO");
			System.out.println(descricao);
			
		}
	con.close();	
	}
}
