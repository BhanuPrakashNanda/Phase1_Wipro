package phase1.inheritance;

class Product{
	int id=78;
	String name="amul";
}
class A extends Product{
	int count=50;
	String category="butter";
	void display(){
		System.out.println("class A "+id+" "+name+" "+count+" "+category+" ");
	}
}
class B extends Product{
	int count=90;
	String category="Milk";
	void display(){
		System.out.println("class B "+id+" "+name+" "+count+" "+category+" ");
	}
}
class suba extends A{
	int price=30;

	void display(){
		int total_price=count*price;
		System.out.println("class suba "+total_price+" "+id+" "+name+" "+" "+category+" ");
	}
}
class subb extends B{
	int price=10;

	void display(){
		int total_price=count*price;
		System.out.println("class subb "+total_price+" "+id+" "+name+" "+" "+category+" ");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		A a=new A();
		a.display();
		B b=new B();
		b.display();
		suba sa=new suba();
		sa.display();
		subb sb=new subb();
		sb.display();
		
	}

}
