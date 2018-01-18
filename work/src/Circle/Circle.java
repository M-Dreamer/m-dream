package Circle;

public class Circle {
	double radius;
	
	public Circle(double r)
	{
		this.radius=r;
	}
	public Circle()
	{
		
	}
	public void setRadius(double r)
	{
		this.radius=r;
	}
	
	public void getArea(Circle cir)
	{
		double area,pi;
		pi=3.1415926;
		area=pi*cir.radius*cir.radius;
		System.out.println("面积为"+area);
	}
	
	public void getPerimeter(Circle cir)
	{
		double perimeter,pi;
		pi=3.1415926;
		perimeter=pi*cir.radius*2;
		System.out.println("周长为"+perimeter);
	}
}
