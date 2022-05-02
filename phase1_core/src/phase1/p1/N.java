package phase1.p1;

class N {
	 protected long n1=19999;
	 public int n2=67;
	 double n3=2323;
	 public void methodPublic(){     // public method
		 methodPrivate();
		 System.out.println(" N class methodPublic");
		}
		
		protected void methodProtected(){   // protected method
			System.out.println(" N class methodProtected");
		}
		
		void methodDefault(){    //default method
			System.out.println(" N class methodDefault");
		}
		
		
		private void methodPrivate(){     // private method
			System.out.println("N class methodPrivate");
			System.out.println("N class protected variable  "+ n1);
			System.out.println("N class public variable "+ n2);
			System.out.println("N class double variable "+ n3);
		}
}
