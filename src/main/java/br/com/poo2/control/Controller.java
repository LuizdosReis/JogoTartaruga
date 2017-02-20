package br.com.poo2.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet (urlPatterns ="/executa")
public class Controller extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String tarefa = req.getParameter("tarefa");
		if (tarefa == null)
			throw new IllegalArgumentException("Faltou passar a tarefa");
		try {
			String classe = "br.com.poo2.control." + tarefa;
			Class<?> type = Class.forName(classe);
			Tarefa instancia = (Tarefa) type.newInstance();
			String pagina = instancia.executa(req, res);

			RequestDispatcher requestDispatcher = req.getRequestDispatcher(pagina);
			requestDispatcher.forward(req, res);

		} catch (Exception e) {
			throw new ServletException(e);
		}

		
		
		
		
	}

}
