package phase1.abstractconcept;

abstract class MNC{
	MNC(){
		System.out.println("MNC Class Constructor");
	}
	void normal(){
		System.out.println("Inside MNC Normal method");
	}
	abstract void run();
	abstract void run1();
}
abstract class Infosys extends MNC{
	void run(){
		System.out.println("Calling run method inside infosys class");
	}
	abstract void run1();
}
class Hello extends Infosys{

	@Override
	void run1() {
		System.out.println("Calling run1 method inside Hello class");
		
	}
	
	void normal1(){
		System.out.println("Inside Hello Normal method");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		MNC h=new Hello();
		h.run();
		h.run1();
		h.normal();
		Hello m=new Hello();
		m.normal1();

	}

}
