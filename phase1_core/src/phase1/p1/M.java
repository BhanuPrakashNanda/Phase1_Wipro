package phase1.p1;

public class M {
 private int m1=10;
  long m2=10000000;
  protected float m3=11.2f;
  public void methodPublic(){     // public method
		System.out.println(" M class methodPublic");
		methodPrivate();
	}
	
	protected void methodProtected(){   // protected method
		System.out.println(" M class methodProtected");
	
	}
	
	void methodDefault(){    //default method
		System.out.println(" M class methodDefault");
		
	}
	public void temp(){
		methodDefault();
	}
	private void methodPrivate(){     // private method
		System.out.println("M class methodPrivate");
		System.out.println("M class private variable "+ m1);
		System.out.println("M class long variable "+ m2);
		System.out.println("M class protected variable "+ m3);
	}
}
