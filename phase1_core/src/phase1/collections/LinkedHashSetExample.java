package phase1.collections;


import java.util.*;

class LinkedHashSetExample{
	public static void main(String[] args){
		
		LinkedHashSet hs=new LinkedHashSet();
	
		
		hs.add(1);
		hs.add(2);
		hs.add(5.5f);
		hs.add(6.5f);
		hs.add('c');
		hs.add('i');
		hs.add(true);
				
		System.out.println("First LinkedHashset is "+hs);
		
		LinkedHashSet<Integer> l=new LinkedHashSet();
		 System.out.println("Enter the inputs  to  added in LinkedHashSet");
	        
	        Scanner input = new Scanner(System.in); // comnnad line to take user input
	        int s1 = input.nextInt();
	        int s2 = input.nextInt();
	        int s3 = input.nextInt();
	        int s4 = input.nextInt();
	        int s5 = input.nextInt();
	        int s6 = input.nextInt();
	        int s7 = input.nextInt();
	        int s8 = input.nextInt();
	      
	        l.add(s1);
	        l.add(s2);
	        l.add(s3);
	        l.add(s4);
	        l.add(s5);
	        l.add(s6);
	        l.add(s7);
	        l.add(s8);
	      
	        System.out.println("Second LinkedHashSet is "+l);
	    
	    
		
	}
}
