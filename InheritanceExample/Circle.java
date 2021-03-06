
public class Circle extends Shape{
	public Circle(Point aLocation) {
		super(aLocation);
	}

	private int radius = 5;
	
	public double diameter() {
		return 2 * radius;
	}
	
	public double circumference(){
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return getLocation().toString() + " " + radius;
	}
}
