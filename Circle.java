package cs13101CircleDemo;

public class Circle {
	
	private double radius;
	private double area;
	
	public Circle()
	{
		radius=1;
	}
	public Circle(double r)
	{
		radius=r;
	}
	public double calculateArea(double r)
	{
		
		area=Math.PI*Math.pow(r, 2);
		return area;
	}

}
