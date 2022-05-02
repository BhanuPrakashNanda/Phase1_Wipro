package phase1.oopsassignment;
abstract class Vehicle{
	int speed=10;
	long distance=10;
	Vehicle(){
		System.out.println("Vehicle Default Constructor");
	}
	Vehicle(int s,long d){
		this.speed=s;
		this.distance=d;
		System.out.println("Vehicle Parameterized Constructor");
	}
	abstract void run();
	abstract void stop();
	public void fuel(int a){
		System.out.println(a);
	}
	public void fuel(float a1,String a2){
		System.out.println(a1+ " "+a2);
		
	}
	public void fuel(char a3,int a4){
	System.out.println(a3+ " "+a4);	
	}
		
		
}
class TWOW extends Vehicle{
	int speed=10;
	long distance=100;
	int nos_of_tyre = 2;
	TWOW(){
		System.out.println("2W Default Constructor");
	}
	@Override
	void run() {
		System.out.println(" Inside 2W Run method");
		
	}

	@Override
	void stop() {
		System.out.println(" Inside 2W stop method");
		
	}
	void display(){
		
		System.out.println(" 2w Variables");
		System.out.println("Speed "+speed);
		System.out.println("Distance "+distance);
		System.out.println("nos_of_tyre "+nos_of_tyre);
		System.out.println(" Vehicle Class variables");
		System.out.println("Speed "+super.speed);
		System.out.println("Distance "+super.distance);
		
	}
}
class THREEW extends Vehicle{
	int speed=100;
	long distance=1200;
	int nos_of_tyre = 3;
	THREEW(){
		System.out.println("3W Default Constructor");
	}
	@Override
	void run() {
		System.out.println(" Inside 3W Run method");
		
	}

	@Override
	void stop() {
		System.out.println(" Inside 3W stop method");
		
	}
	void display(){
		
		System.out.println(" 3w Variables");
		System.out.println("Speed "+speed);
		System.out.println("Distance "+distance);
		System.out.println("nos_of_tyre "+nos_of_tyre);
		System.out.println(" Vehicle Class variables");
		System.out.println("Speed "+super.speed);
		System.out.println("Distance "+super.distance);
		
	}
}
class FOURW extends Vehicle{
	int speed=102;
	long distance=1400;
	int nos_of_tyre = 2;
	FOURW(){
		System.out.println("4W Default Constructor");
	}
	@Override
	void run() {
		System.out.println(" Inside 4W Run method");
		
	}

	@Override
	void stop() {
		System.out.println(" Inside 4W stop method");
		
	}
	void display(){
		
		System.out.println(" 4w Variables");
		System.out.println("Speed "+speed);
		System.out.println("Distance "+distance);
		System.out.println("nos_of_tyre "+nos_of_tyre);
		System.out.println(" Vehicle Class variables");
		System.out.println("Speed "+super.speed);
		System.out.println("Distance "+super.distance);
		
	}
}
class EIGHTW extends Vehicle{
	int speed=182;
	long distance=1700;
	int nos_of_tyre = 8;
	EIGHTW(){
		System.out.println("8W Default Constructor");
	}
	@Override
	void run() {
		System.out.println(" Inside 8W Run method");
		
	}

	@Override
	void stop() {
		System.out.println(" Inside 8W stop method");
		
	}
	void display(){
		
		System.out.println(" 8w Variables");
		System.out.println("Speed "+speed);
		System.out.println("Distance "+distance);
		System.out.println("nos_of_tyre "+nos_of_tyre);
		System.out.println(" Vehicle Class variables");
		System.out.println("Speed "+super.speed);
		System.out.println("Distance "+super.distance);
		
	}
}
public class OopsAssignment {

	public static void main(String[] args) {
	Vehicle v1=new TWOW();
	Vehicle v2=new THREEW();
	Vehicle v3=new FOURW();
	Vehicle v4=new EIGHTW();
	TWOW t1=new TWOW();
	v1.run();
	v1.stop();
	t1.display();
	v1.fuel(10);
	v1.fuel('s', 100);
	v1.fuel(10.0f, "sar");
	THREEW t2=new THREEW();
	v2.run();
	v2.stop();
	t2.display();

	FOURW t3=new FOURW();
	v3.run();
	v3.stop();
	t3.display();
	EIGHTW t4=new EIGHTW();
	v4.run();
	v4.stop();
	t4.display();

	}

}
