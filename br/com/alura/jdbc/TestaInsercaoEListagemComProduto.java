package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.DAO.ProdutoDAO;
import br.com.alura.jdbc.modelo.Produto;

public class TestaInsercaoEListagemComProduto {

	public static void main(String[] args) throws SQLException {
		
		Produto comoda = new Produto("C�moda", "C�moda Vertical");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()){
			ProdutoDAO pDao = new ProdutoDAO(connection);
			pDao.salvar(comoda);
			List<Produto> listaDeProdutos = pDao.Listar();
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}
		System.out.println(comoda);
	}
}