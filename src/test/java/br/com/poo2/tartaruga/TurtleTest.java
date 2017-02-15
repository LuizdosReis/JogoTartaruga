package br.com.poo2.tartaruga;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

public class TurtleTest {

	private Turtle turtle;

	@Before
	public void setUp() {
		turtle = new Turtle(new Point(8, 11));
	}

	@Test
	public void avaliaPositionInicial() {
		assertThat(turtle.getPosition().getX(), equalTo(8));
		assertThat(turtle.getPosition().getY(), equalTo(11));
	}

	@Test
	public void avaliaTurnRight() {
		assertThat(turtle.getDirection().getX(), equalTo(8));
		assertThat(turtle.getDirection().getY(), equalTo(12));

		turtle.turnRight();

		assertThat(turtle.getDirection().getX(), equalTo(9));
		assertThat(turtle.getDirection().getY(), equalTo(11));

		turtle.turnRight();

		assertThat(turtle.getDirection().getX(), equalTo(8));
		assertThat(turtle.getDirection().getY(), equalTo(10));
		
		turtle.turnRight();

		assertThat(turtle.getDirection().getX(), equalTo(7));
		assertThat(turtle.getDirection().getY(), equalTo(11));
		
		turtle.turnRight();

		assertThat(turtle.getDirection().getX(), equalTo(8));
		assertThat(turtle.getDirection().getY(), equalTo(12));
	}
	
	
	@Test
	public void avaliaTurnLeft() {
		assertThat(turtle.getDirection().getX(), equalTo(8));
		assertThat(turtle.getDirection().getY(), equalTo(12));

		turtle.turnLeft();
		
		assertThat(turtle.getDirection().getX(), equalTo(7));
		assertThat(turtle.getDirection().getY(), equalTo(11));

		turtle.turnLeft();

		assertThat(turtle.getDirection().getX(), equalTo(8));
		assertThat(turtle.getDirection().getY(), equalTo(10));
		
		turtle.turnLeft();

		assertThat(turtle.getDirection().getX(), equalTo(9));
		assertThat(turtle.getDirection().getY(), equalTo(11));
		
		turtle.turnLeft();

		assertThat(turtle.getDirection().getX(), equalTo(8));
		assertThat(turtle.getDirection().getY(), equalTo(12));
	}
	
	@Test
	public void testMovimentacaoParaDireita(){
		// inicialmente comeca olhando para direita
		turtle.move(5);
		
		assertThat(turtle.getPosition().getX(), equalTo(8));
		assertThat(turtle.getPosition().getY(), equalTo(16));
		
		assertThat(turtle.getDirection().getX(), equalTo(8));
		assertThat(turtle.getDirection().getY(), equalTo(17));
		
	}
	
	@Test
	public void testMovimentacaoParaEsquerda(){
		// vira tarturuga para esquerda
		turtle.turnLeft();
		
		turtle.move(5);
		
		assertThat(turtle.getPosition().getX(), equalTo(3));
		assertThat(turtle.getPosition().getY(), equalTo(11));
		
		assertThat(turtle.getDirection().getX(), equalTo(2));
		assertThat(turtle.getDirection().getY(), equalTo(11));
		
	}
	
	@Test
	public void testMovimentacaoParaCima(){
		// vira tarturuga para cima
		turtle.turnLeft();
		
		turtle.move(5);
		
		assertThat(turtle.getPosition().getX(), equalTo(3));
		assertThat(turtle.getPosition().getY(), equalTo(11));
		
		assertThat(turtle.getDirection().getX(), equalTo(2));
		assertThat(turtle.getDirection().getY(), equalTo(11));
		
	}
	
	@Test
	public void testMovimentacaoParaBaixo(){
		// vira tarturuga para baixo
		turtle.turnRight();
		
		turtle.move(5);
		
		assertThat(turtle.getPosition().getX(), equalTo(13));
		assertThat(turtle.getPosition().getY(), equalTo(11));
		
		assertThat(turtle.getDirection().getX(), equalTo(14));
		assertThat(turtle.getDirection().getY(), equalTo(11));
		
	}

}
