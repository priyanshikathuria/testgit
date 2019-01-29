/* 4.	Create an abstract base class called Shape. Use this class to store two double type values that could be used to compute the area of figures. Create two specific inherited classes called Triangle and Rectangle from the base class Shape. Add to base class an abstract member function display_area(). Write a test application ShapeTest that demonstrates the capabilities of the classes defined above.

   Definition of Done:
a)	The class definitions are defined as per the class diagram.
b)	Each class definition is stored in its own .java file.
c)	Base class constructors are invoked using super keyword.
d)	Function overriding is applied wherever applicable. */

class ShapeTest{
	public static void main(String args[]){
	Rectangle r=new Rectangle(10,20);
	Triangle t=new Triangle(10,20);

	Shape=s1;
	s1=r;
	System.out.println("area of rectangle:" +s1.display_area());

	s1=t;
	System.out.println("area of triangle:" +s1.display_area());
	}
}