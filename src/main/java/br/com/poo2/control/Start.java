package br.com.poo2.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Start implements Tarefa {

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		TurtleBoardControl turtleBoardControl = new TurtleBoardControl();
		
		HttpSession session = request.getSession();

		session.setAttribute("game", turtleBoardControl);
		return "/index.jsp";
	}

}
