<%@page import="br.com.poo2.control.TurtleBoardControl"%>
<%@page import="br.com.poo2.model.Board"%>
<%@page import="br.com.poo2.model.Turtle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="mapa.css"">
<title>Mostrar</title>
</head>
<body>
	<%
		TurtleBoardControl turtleBoardControl = (TurtleBoardControl) session.getAttribute("game");

		Board board = turtleBoardControl.getBoard();
		
		Turtle turtle = turtleBoardControl.getTurtle();

		for (int i = 0; i < turtleBoardControl.getTAMANHO(); i++) {
			for (int j = 0; j < turtleBoardControl.getTAMANHO(); j++) {
				if(turtle.getPosition().getX() == i && turtle.getPosition().getY() == j)
					out.println("<div class='turtle'></div>");
				else if(turtle.getDirection().getX() == i && turtle.getDirection().getY() == j)
					out.println("<div class='olhando'></div>");
				else if(board.getPoint(i, j)==1)
					out.println("<div class='passou'></div>");
				else
					out.println("<div class='limpo'></div>");
			}
			out.println("</br>");
		}
	%>
</body>
</html>