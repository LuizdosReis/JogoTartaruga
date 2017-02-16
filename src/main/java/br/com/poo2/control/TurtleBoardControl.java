package br.com.poo2.control;

import br.com.poo2.model.Board;
import br.com.poo2.model.Point;
import br.com.poo2.model.Turtle;

public class TurtleBoardControl {

	private Turtle turtle;
	private Board board;
	private final int TAMANHO = 20;

	public TurtleBoardControl() {
		turtle = new Turtle(new Point(0, 0));
		board = new Board(TAMANHO);
	}

	public void moveTurtle(int step) {
		for (int i = 1; i <= step; i++) {
			if (checkOutOfBoard()) {
				if (turtle.isPen()) {
					board.write(turtle.getPosition().getX(), turtle.getPosition().getY());
					turtle.move(1);
				} else {
					turtle.move(1);
				}
			}else{
				return;
			}
		}
	}

	public void turnLeftTurtle() {
		turtle.turnLeft();
	}

	public void turnRightTurtle() {
		turtle.turnRight();
	}
	
	public void write(boolean status){
		turtle.setPen(status);
	}

	private Boolean checkOutOfBoard() {
		if (turtle.getDirection().getY() >= 20 || turtle.getDirection().getY() < 0)
			return false;
		if (turtle.getDirection().getX() >= 20 || turtle.getDirection().getX() < 0)
			return false;
		return true;
	}

	public Turtle getTurtle() {
		return this.turtle;
	}
	
	public Board getBoard() {
		return board;
	}
}
