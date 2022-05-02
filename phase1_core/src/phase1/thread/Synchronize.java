package phase1.thread;


class Factorial{  
	  
	 void fact(int n){  	
	  System.out.println("inside factorial method");
	  
	  synchronized(this){//synchronized block  : this means to current context
		  int fact = 1;  
	        int i = 1;  
	        while( i <= n ){  
	            fact = fact * i;   
	            i++; //increment i by 1   
	        }     
	        System.out.println("\nFactorial of " + n + " is: " + fact); 
	      try{  
	       Thread.sleep(400);  
	      }catch(Exception e){System.out.println(e);}  
	     }  
	   }  	   
	 } 
class Addition{
	void add(int a,int b){
		System.out.println("inside addition method");
		System.out.println();
		int c=a+b;
		synchronized(this){//synchronized block  : this means to current context
		
		        System.out.println("\naddition of  a and b  "+" is: " + c); 
		      try{  
		       Thread.sleep(400);  
		      }catch(Exception e){System.out.println(e);}  
		     }  
		   } 
		  
	}

	 
	  
	class MyThread1 extends Thread{  
	Factorial f;  
	MyThread1(Factorial f){  
		this.f=f;  
	}  
	public void run(){  
		System.out.println("Into the Thread1 run() method");
		f.fact(4);  
	}  
	  
	} 
	class MyThread2 extends Thread{  
		Factorial f;  
		MyThread2(Factorial f){  
			this.f=f;  
		}  
		public void run(){  
			System.out.println("Into the Thread2 run() method");
			f.fact(6);  
		}  
		  
		}
	class Thread3 extends Thread{  
		Addition f;  
		Thread3(Addition f){  
			this.f=f;  
		}  
		public void run(){  
			System.out.println("Into the Thread3 run() method");
			f.add(4,5);  
		}  
		  
		}
	class Thread4 extends Thread{  
		Addition f;  
		Thread4(Addition f){  
			this.f=f;  
		}  
		public void run(){  
			System.out.println("Into the Thread4 run() method");
			f.add(20,10);  
		}  
		  
		}

	  
	public class Synchronize{  
	
	public static void main(String args[]){  
	
	Factorial obj1 = new Factorial();//only one object  
	Addition obj2=new Addition();
	MyThread1 t1=new MyThread1(obj1);  
	MyThread2 t2=new MyThread2(obj1);  
	Thread3 t3=new Thread3(obj2);
	Thread4 t4=new Thread4(obj2);
	
	t2.start();  
	t4.start(); 
	t1.start();  
	t3.start(); 
	}  
	}  
