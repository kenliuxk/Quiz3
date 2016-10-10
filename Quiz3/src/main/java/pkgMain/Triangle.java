package pkgMain;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double p = (side1 + side2 + side3)/2;
		return (Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)));
		
	}
	
	public double getPerimeter() {
		return (side1 + side2 + side3);
	}
	
	public String toString() {
		return ("Here is your triangle made with" + side1 + side2 + side3 + ".");
	}

}
