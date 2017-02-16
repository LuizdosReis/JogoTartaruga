package br.com.poo2.control;

public class TurtleGameControl {
	private TurtleBoardControl 	turtleBoardControl;
	private final int END  = 7;
	private final int PEN_UP = 6;
	private final int PEN_DOWN = 5;
	private final int LEFT = 4;
	private final int RIGHT = 3;
	private final int WALK = 2;
	private final int PRINT = 1;
	
	public void start(){
		turtleBoardControl = new TurtleBoardControl();
	}
	
	public int getEND() {
		return END;
	}
	
	public int getPEN_UP() {
		return PEN_UP;
	}
	public int getPEN_DOWN() {
		return PEN_DOWN;
	}
	public int getLEFT() {
		return LEFT;
	}
	public int getRIGHT() {
		return RIGHT;
	}
	public int getWALK() {
		return WALK;
	}
	public int getPRINT() {
		return PRINT;
	}
	
	
 
	

}
