package phase1.exceptionhandling;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void Calculate(int l,int b){
		
		areaFunc(l,b);
	}
	public static void areaFunc(int l, int b)  {
		int a=0;
		try {
			a= display(l,b);
			System.out.println("Area "+a);
			} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	public static int display(int l, int b) throws IOException {
		if(l>b){
			throw new IOException("Length is greater than breadth so thrown exception");
		}
		else{
			return l*b;
		}
		
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Length given by user "+l);
		System.out.println("Breadth given by user "+b);
		Calculate(l, b);
	}

}
