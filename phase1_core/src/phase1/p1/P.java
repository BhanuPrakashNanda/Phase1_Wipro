package phase1.p1;

public class P {
	 public void methodPublicM(){  
		 System.out.println("Calling M class methods in P class");
		 M m=new M();
		 m.methodPublic();
		 m.methodProtected();
		 m.methodDefault();
		 

	 }
	 public void methodPublicN(){
		 System.out.println("Calling N class methods in P class");
		 N n=new N();
		 n.methodPublic();
		 n.methodDefault();
		 n.methodProtected();
	 }
	public static void main(String args[]){
		
		 P p=new P();
		 p.methodPublicM();
		 p.methodPublicN();
	
}}