/*6.	Define the interface / class hierarchy as detailed in the following class diagram:

Definition of Done:
e)	The class definitions are defined as per the class diagram.
f)	Each class definition is stored in its own .java file.
g)	Base class constructors are invoked using super keyword
h)	Function overriding is applied wherever applicable.
*/

class Circle implements GeometricObject{

	double r, p, a;
	Circle()
	{
		r = 1;
	}
	Circle(double radius);
	{
		this.r=radius;
	}
	public double getPerimeter()
	{
		p=2*3.14*r;
		return p;
		//System.out.println("perimeter of circle:" +p)
	}

	double void getArea(){
		a=3.14*r*r;
		return a;
		System.out.println("area of circle:" +a);
	}
}