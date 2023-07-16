package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class dao {

	private String driver = "org.postgresql.Driver";
	private String caminho = "jdbc:postgresql://localhost:5432/dbagenda";
	private String usuario = "postgres";
	private String senha = "180320";
	
	
	public Connection conectar() {
		Connection con = null;	
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(caminho, usuario, senha);// PREPARANDO A CONEXAO
			PreparedStatement smt;
			String query = "SELECT * FROM CONTATOS";
			smt = con.prepareStatement(query);
			ResultSet dados = smt.executeQuery();//RETORNA OS DADOS DO SELECT
			Map<String, String> listDados = new HashMap<String, String>();
			while (dados.next()) {
	            String Name = dados.getString("nome");
	            String idcon = dados.getString("idcon");
	            String fone = dados.getString("fone");
	            String email = dados.getString("email");
	            listDados.put("idcon", idcon);
	            listDados.put("Name", Name);
	            listDados.put("fone", fone);
	            listDados.put("email", email);
	            System.out.print("Listando dados " + listDados);
	        }
			return con;
		}
		catch (Exception e) {
			System.out.print("Erro AO SE CONECTAR COM O BANCO DE DADOS" + e.getMessage());
		}
		return null;
	}
	
	public void desconectar() {
		try {
			conectar().close();
		}catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
