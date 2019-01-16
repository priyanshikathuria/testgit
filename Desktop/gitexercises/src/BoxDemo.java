class Box{
	double width;
	double height;
	double depth;
	void setDim()
	{
	width=10;
	height=20;
	depth=15;
	}
	double volume()
	{
	return width*height*depth;
	}
}
class BoxDemo {
	public static void main(String arg[]){
	Box box1= new Box();
	Box box2= new Box();
	box1.setDim();
	box2.setDim();
	System.out.println("The volume of box box1: +box1.volume");
}
}