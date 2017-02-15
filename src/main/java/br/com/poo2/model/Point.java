package br.com.poo2.model;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {

	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setPoint(int x, int y) {
		setX(x);
		setY(y);
	}

	public Point sum(Point vector) {
		return new Point(this.x + vector.getX(),this.y + vector.getY());
	}

	public Point mult(int scale) {
		// TODO Auto-generated constructor stub
		return null;
	}
	
	public void print(){
		System.out.println("X: "+this.x+" Y:"+this.y);
	}

}
