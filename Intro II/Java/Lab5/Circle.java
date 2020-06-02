import java.lang.Math;

public class Circle {
	private double radius;
	
	public Circle(double r) { 
		radius = r; radius = 1.0; 
	}

	public Circle(Circle c) { 
		radius = c.radius; 
	}
	
	public void copy(Circle c) { 
		radius = c.radius; 
	}
	
	public double getRadius() { 
		return radius; 
	}
	
	public void setRadius(double r) {
		radius = r; 
	}
	
	public double getArea() { 
		return Math.PI * radius * radius; 
	}
	
	public double getCircumferance() { 
		return 2 * Math.PI * radius; 
	}

}