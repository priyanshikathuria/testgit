/* 4.	Create an abstract base class called Shape. Use this class to store two double type values that could be used to compute the area of figures. Create two specific inherited classes called Triangle and Rectangle from the base class Shape. Add to base class an abstract member function display_area(). Write a test application ShapeTest that demonstrates the capabilities of the classes defined above.

   Definition of Done:
a)	The class definitions are defined as per the class diagram.
b)	Each class definition is stored in its own .java file.
c)	Base class constructors are invoked using super keyword.
d)	Function overriding is applied wherever applicable. */

public class Triangle extends Shape{
	Triangle(double x, double y)
	{
	super(x,y);
	}
	double display_area(){
	System.out.println("area of rectangle is:")
	return (dim1*dim2)*1/2
	}

} 