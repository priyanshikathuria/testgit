import java.util.*;
public class VehicleTest{
	public static void main(String args[]){
	int n;
	
	System.out.println("enter the no of tyres");
	Scanner obj=new Scanner(System.in);
	n=obj.nextInt();

	switch(n){
	case 2:
		Bike sc1=new Bike();
		sc1.display();
		break;

	case 4:
		Car sc2=new Car();
		sc2.display();
		break;

	default:
	Vehicle sc3=new Vehicle();
	sc3.display();
	break;
}
	}

	}

