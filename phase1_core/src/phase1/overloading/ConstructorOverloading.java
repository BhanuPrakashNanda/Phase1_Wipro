package phase1.overloading;

public class ConstructorOverloading {
	String name;
	int age;
	char section;
	char gender;
	int subject1=0, subject2, subject3;
	
	public ConstructorOverloading(String n,int a,char s,char g,int s2,int s3)  // default constructor
	{
		name=n;
		age=a;
		section =s;
		gender=g;
	
		subject2=s2;
		subject3=s3;

	}
	public ConstructorOverloading(String n,int a,char s,char g,int s1,int s2,int s3)  // default constructor
	{
		name=n;
		age=a;
		section =s;
		gender=g;
		subject1=s1;
		subject2=s2;
		subject3=s3;
	
	}
	
	//method to display the value of id and name  
	void display()  //default modifier
	{
		int marks=subject1+subject2+subject3;
		int percent=(marks*100)/300;
		System.out.println(name+" "+age+" "+section+" "+gender+" "+subject1+" "+subject2+" "+subject3+" "+marks+" "+percent);
	}  
	public static void main(String[] args) {
		ConstructorOverloading s1=new ConstructorOverloading("rahul",17,'A','M',90,91,92);
		System.out.println("s1 object");
		s1.display();
		ConstructorOverloading s2=new ConstructorOverloading("rithvik",17,'A','M',91,92);
		System.out.println("s2 object");
		s2.display();
		ConstructorOverloading s3=new ConstructorOverloading("rithesh",17,'B','M',95,92);
		System.out.println("s3 object");
		s3.display();
		ConstructorOverloading s4=new ConstructorOverloading("swapna",17,'B','F',100,95,92);
		System.out.println("s4 object");
		s4.display();
		
	}

}
