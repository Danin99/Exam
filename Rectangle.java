public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double length, double width) {

		this.width = width;
        this.length = length;
	}

	public double getArea() {

		return this.width * this.length;
	}

	public double getPerimeter() {

		return 2*(this.width+this.length);

	}
}