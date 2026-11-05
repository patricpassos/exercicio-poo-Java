package entities;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(double x, double y) {
		this.x = (int) x;
		this.y = (int) y;
	}
	
	public void reflection(char axis) {
		char axisMajor = Character.toUpperCase(axis);
		switch(axisMajor) {
		case 'X' -> y *= -1;
		case 'Y' -> x *= -1;
		default -> throw new IllegalArgumentException("Select axis x or y");
		}
	}
	
	public void movePoint(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public double calculateDistancebetweenTwoPoints(Point otherPoint) {
		return Math.sqrt(Math.pow((otherPoint.x - this.x), 2) + Math.pow((otherPoint.y - this.y), 2));
	}
	
	public boolean isSamePoint(Point otherPoint) {
		return this.x == otherPoint.x && this.y == otherPoint.y;
	}
	
	@Override
	public String toString() {
		return
				String.format("Point (x, y): (%d, %d) ", x, y);
	}

}
