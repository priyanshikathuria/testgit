class box{
	double width;
	double height;
	double depth;
	void setDim()
	{
	width=10
	height=20
	depth=15
	}
	double volume()
	{
	return width*height*depth;
	}
class BoxDemo
{
	public.static.void main(string arg)
	Box box1= new box();
	Box box2= new box();
	box1.setDim();
	box2.setDim();
	system.out.println("The volume of box box1: +box1.volume")
}