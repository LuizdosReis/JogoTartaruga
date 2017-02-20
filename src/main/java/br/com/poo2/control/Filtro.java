package br.com.poo2.control;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.poo2.model.Turtle;

@WebFilter(urlPatterns = "/*")
public class Filtro implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		TurtleBoardControl turtleBoardControl = (TurtleBoardControl) req.getSession().getAttribute("game");

		if (turtleBoardControl != null) {
			Turtle turtle = turtleBoardControl.getTurtle();
			System.out.println("Turtle na posicao " + turtle.getPosition().getX() + " - " + turtle.getPosition().getY()
					+ " - " + req.getParameter("tarefa"));
		} else {
			System.out.println("Jogo nao iniciado tarefa: " + req.getParameter("tarefa"));
		}
		chain.doFilter(request, response);

	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
