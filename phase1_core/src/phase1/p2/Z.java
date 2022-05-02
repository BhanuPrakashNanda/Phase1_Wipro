package phase1.p2;

import phase1.p1.M;
import phase1.p1.P;

public class Z extends M{
	public static void main(String args[]){
		X x=new X();
		x.methodPublic();
		P p=new P();
		p.methodPublicN();
		Z z=new Z();
		z.methodPublic();
		z.methodProtected();
		z.temp();
		
}
}
