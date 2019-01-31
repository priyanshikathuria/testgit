import java.util.Scanner;
class GeometricTest{
	public static void main(String args[]){
	Circle c = new Circle(1);
	ResizableCircle r=new ResizableCircle(10);

	GeometricObject g1;
	g1=c;
	System.out.println("perimeter of circle:" +g1.p());

	g1=r;
	System.out.println("area of area:" +g1.a());
}
}