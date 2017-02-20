package br.com.poo2.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Show implements Tarefa{

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		return "WEB-INF/paginas/Show.jsp";
	}
	
	

}
