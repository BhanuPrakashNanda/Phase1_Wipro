package phase1.composition;

import java.io.*;
import java.util.*;

class Employee {

	public String name;
	public int age;
	public int salary;

	Employee(String n, int a,int s)
	{
		this.name = n;
		this.age =a;
		this.salary=s;
	}
}

//Libary class contains list of books.
class Hr {

	// reference to refer to list of books.
	private final List<Employee> employee;

	Hr(List<Employee> employee) 
	{ 
		this.employee = employee; 
	}

	// Getting total number of books
	public List<Employee> getTotalBooksInLibrary()
	{
		return employee;
	}
}

public class CompositionExample {
	public static void main(String[] args)
	{
		Employee e1  = new Employee("radha",54,100000 );
		Employee e2  = new Employee("krishna",50,800000 );
		Employee e3  = new Employee("soumya",45,780000 );
		Employee e4  = new Employee("sathya",50,850000 );
		

		// Creating the list which contains the no. of books.
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
	

		Hr library = new Hr(employee);

		List<Employee> employees = library.getTotalBooksInLibrary();
		for (Employee e : employees) {
			System.out.println("Name : " + e.name + "  " + " Age : " + e.age+" "+"Salary "+ e.salary);
		}
	}
}

