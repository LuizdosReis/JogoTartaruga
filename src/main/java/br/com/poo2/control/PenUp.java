package br.com.poo2.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PenUp implements Tarefa{

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		TurtleBoardControl turtleBoardControl = (TurtleBoardControl) session.getAttribute("game");
		
		turtleBoardControl.write(false);
		
		return "/index.jsp";
	}
	
	

}
