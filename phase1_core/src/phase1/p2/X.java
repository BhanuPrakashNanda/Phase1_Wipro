package phase1.p2;

public class X {
	 private int x1=10;
	 long x2=1276282;
	 protected float x3=3.2f;
	 public char x4='y';
	 public void methodPublic(){     // public method
			System.out.println(" M class methodPublic");
			methodPrivate();
		}
	 private void methodPrivate(){     // private method
			System.out.println("X class methodPrivate");
			System.out.println("X class private variable "+ x1);
			System.out.println("X class long variable "+ x2);
			System.out.println("X class protected variable "+ x3);
			System.out.println("X class public variable "+ x4);
		}
}
