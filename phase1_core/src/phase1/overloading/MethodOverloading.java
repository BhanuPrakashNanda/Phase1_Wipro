package phase1.overloading;

public class MethodOverloading {
	int calculate(int a, int b){
		return a+b;
	}
	float calculate(int r){
		float area=(22*(r*r))/7;
		return area;
	}
	int calculate(long w,long l){
		int area= (int) (l*w);
		return area;
	}
	
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		System.out.println("Adddition "+m.calculate(5,6));
		System.out.println("Area of circle "+m.calculate(2));
		System.out.println("Area of rectangle "+m.calculate(1l,2l));
	}

}
