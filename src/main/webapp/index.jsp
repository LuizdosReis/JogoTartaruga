<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="bootstrap/css/bootstrap.min.css">

</head>
<body>

	<section class="container text-center">
		<c:if test="${not empty game }">
		<p>Tartaruga posição ${game.turtle.position.x}  ${game.turtle.position.y} </p>
	</c:if>
		<form action="executa" method="post">
			<input type="hidden" name="tarefa" value="Start"> <input
				class="btn btn-default btn-lg" type="submit" value="Start" />
		</form>
		<form action="executa" method="post">
			<input type="hidden" name="tarefa" value="Walk"> Steps <input
				type="text" name="steps" /><br /> <input
				class="btn btn-default btn-lg" type="submit" value="Walk" />
		</form>
		<form action="executa" method="post">
			<input type="hidden" name="tarefa" value="TurnLeft"> <input
				class="btn btn-default btn-lg" type="submit" value="Turn Left" />
		</form>
		<form action="executa" method="post">
			<input type="hidden" name="tarefa" value="TurnRight"> <input
				class="btn btn-default btn-lg" type="submit" value="Turn Right" />
		</form>

		<form action="executa" method="post">
			<input type="hidden" name="tarefa" value="PenDown"> <input
				class="btn btn-default btn-lg" type="submit" value="Pen Down" />
		</form>

		<form action="executa" method="post">
			<input type="hidden" name="tarefa" value="PenUp"> <input
				class="btn btn-default btn-lg" type="submit" value="Pen Up" />
		</form>

		<form action="executa" method="post">
			<input type="hidden" name="tarefa" value="Show"> <input
				class="btn btn-default btn-lg" type="submit" value="Show" />
		</form>
	</section>

</body>
</html>
