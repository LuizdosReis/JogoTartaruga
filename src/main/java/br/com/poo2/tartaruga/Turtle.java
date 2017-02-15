package br.com.poo2.tartaruga;

public class Turtle {
	private Point position;
	private Point direction;
	private boolean pen;

	public Turtle(Point initialPosition) {
		this.position = new Point(8, 11);
		this.direction = this.position.sum(new Point(0, 1));
	}

	public Point getPosition() {
		return position;
	}

	public void setX(int x) {
		position.setX(x);
	}

	public void setY(int y) {
		position.setY(y);
	}

	public Point getDirection() {
		return this.direction;
	}

	public void turnRight() {
		if (olhandoParaDireita())
			olhaParaBaixo();
		else if (olhandoParaBaixo())
			olhaParaEsquerda();
		else if (olhandoParaEsquerda())
			olhaParaCima();
		else if (olhandoParaCima())
			olhaParaDireita();
	}

	private void olhaParaDireita() {
		direction = position.sum(new Point(0, 1));
	}

	private void olhaParaCima() {
		direction = position.sum(new Point(-1, 0));
	}

	private void olhaParaEsquerda() {
		direction = position.sum(new Point(0, -1));
	}

	private void olhaParaBaixo() {
		direction = position.sum(new Point(1, 0));
	}

	public void turnLeft() {
		if (olhandoParaDireita())
			olhaParaCima();
		else if (olhandoParaBaixo())
			olhaParaDireita();
		else if (olhandoParaEsquerda())
			olhaParaBaixo();
		else
			olhaParaEsquerda();
	}

	public void move(int step) {
		if (olhandoParaDireita()) {
			position = position.sum(new Point(0, step));
			olhaParaDireita();
		} else if (olhandoParaBaixo()) {
			position = position.sum(new Point(step, 0));
			olhaParaBaixo();
		} else if (olhandoParaEsquerda()) {
			position = position.sum(new Point(0, -step));
			olhaParaEsquerda();
		} else {
			position = position.sum(new Point(-step, 0));
			olhaParaCima();
		}
	}

	private boolean olhandoParaCima() {
		return position.getX() > direction.getX() && position.getY() == direction.getY();
	}

	private boolean olhandoParaEsquerda() {
		return position.getX() == direction.getX() && position.getY() > direction.getY();
	}

	private boolean olhandoParaBaixo() {
		return position.getX() < direction.getX() && position.getY() == direction.getY();
	}

	private boolean olhandoParaDireita() {
		return position.getX() == direction.getX() && position.getY() < direction.getY();
	}

	public boolean isPen() {
		return pen;
	}

	public void setPen(boolean pen) {
		this.pen = pen;
	}
	
	

}
