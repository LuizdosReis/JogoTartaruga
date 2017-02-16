package br.com.poo2.control;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import br.com.poo2.model.Turtle;

public class TurtleBoardControlTest {
	
	private TurtleBoardControl turtleBoardControl;
	private Turtle turtle;

	@Before
	public void setUp(){
		turtleBoardControl = new TurtleBoardControl();
		turtle = turtleBoardControl.getTurtle();
	}
	
	
	@Test
	public void verificaSeTartarugaEstaVirando(){
		turtleBoardControl.turnLeftTurtle();
		
		assertThat(turtle.getDirection().getX(), equalTo(-1));
		assertThat(turtle.getDirection().getY(), equalTo(0));
		
		turtleBoardControl.turnRightTurtle();
		
		assertThat(turtle.getDirection().getX(), equalTo(0));
		assertThat(turtle.getDirection().getY(), equalTo(1));
		
	}
	
	@Test
	public void verificaSeTartarugaNaoPassaDasBorda(){
		turtleBoardControl.turnLeftTurtle();
		
		turtleBoardControl.moveTurtle(1); 
		
		assertThat(turtle.getPosition().getY(), equalTo(0));
		assertThat(turtle.getPosition().getX(), equalTo(0));
		
		turtleBoardControl.turnRightTurtle();
		
		turtleBoardControl.moveTurtle(20);
		
		assertThat(turtle.getPosition().getY(), equalTo(19));
		assertThat(turtle.getPosition().getX(), equalTo(0));
		
		turtleBoardControl.turnRightTurtle();
		
		turtleBoardControl.moveTurtle(20);
		
		assertThat(turtle.getPosition().getY(), equalTo(19));
		assertThat(turtle.getPosition().getX(), equalTo(19));	
		
	}
	
	@Test
	public void verificaSeTartarugaNaoSeMovimentaComNumerosNegativos(){
		turtleBoardControl.moveTurtle(-1);
		
		assertThat(turtle.getPosition().getY(), equalTo(0));
		assertThat(turtle.getPosition().getX(), equalTo(0));
		
	}
	
	@Test
	public void verificaSeTartarugaNaoEscreve(){
		turtleBoardControl.moveTurtle(5);
		
		assertThat(turtleBoardControl.getBoard().getPoint(0, 0), equalTo(0));
		assertThat(turtleBoardControl.getBoard().getPoint(0, 1), equalTo(0));
		assertThat(turtleBoardControl.getBoard().getPoint(0, 2), equalTo(0));
		assertThat(turtleBoardControl.getBoard().getPoint(0, 3), equalTo(0));
		assertThat(turtleBoardControl.getBoard().getPoint(0, 4), equalTo(0));
		assertThat(turtleBoardControl.getBoard().getPoint(0, 5), equalTo(0));
		
		assertThat(turtle.getPosition().getY(), equalTo(5));
		assertThat(turtle.getPosition().getX(), equalTo(0));
	}
	
	@Test
	public void verificaSeTartarugaEscreve(){
		turtleBoardControl.write(true);
		
		turtleBoardControl.moveTurtle(5);
		
		assertThat(turtleBoardControl.getBoard().getPoint(0, 0), equalTo(1));
		assertThat(turtleBoardControl.getBoard().getPoint(0, 1), equalTo(1));
		assertThat(turtleBoardControl.getBoard().getPoint(0, 2), equalTo(1));
		assertThat(turtleBoardControl.getBoard().getPoint(0, 3), equalTo(1));
		assertThat(turtleBoardControl.getBoard().getPoint(0, 4), equalTo(1));
		assertThat(turtleBoardControl.getBoard().getPoint(0, 5), equalTo(0));
		
		assertThat(turtle.getPosition().getY(), equalTo(5));
		assertThat(turtle.getPosition().getX(), equalTo(0));
	}
}
