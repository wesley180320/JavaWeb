package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao;


@WebServlet(urlPatterns = {"/controller","/main"})
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	dao dao1 = new dao();
	
    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		dao1.conectar();
//		System.out.print(dao1.conectar());
//		try {
//			PreparedStatement smt;
//			smt = dao1.conectar().prepareStatement("SELECT * from contatos");
//			ResultSet dados = smt.executeQuery();
//			System.out.print("dados" + dados);
//		} catch (SQLException e) {
//			System.out.print("Erro no select" + e.getMessage());
//			dao1.desconectar();
//		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
