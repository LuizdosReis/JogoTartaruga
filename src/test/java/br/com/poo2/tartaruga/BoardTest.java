package br.com.poo2.tartaruga;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	
	private Board board;

	@Before
	public void setUp(){
		board = new Board(20);
	}
	
	@Test
	public void setaUmPonto(){
		board.write(13, 12);
		
		assertThat(board.getPoint(13, 12), equalTo(1));
	}

}
