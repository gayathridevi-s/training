package bikes;

public  class Bike {
 //int speedlimit=70;
final int speedlimit=40;						//final keyword for variable
void speed() {
//	speedlimit=90;
}
public final void wheels() {
	System.out.println("2 wheels");
}

public static void main(String[] args) {
	Bike splendor=new Bike();
	Bike tesla=new Electric();
//	splendor.speed();
	System.out.println(splendor.speedlimit);
	splendor.wheels();
	tesla.wheels();
}
}


