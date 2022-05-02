package phase1.collections;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListExample {
    public static void main(String a[]){
    	
    
        LinkedList<String> ll = new LinkedList<String>();
        
        ll.add("May");
        ll.add("June");
        ll.add("July");
        ll.add("August");
        ll.add("April");
        ll.add("November");    // wrapping of primitive is done automatically to convert to Integer object
                
    
        ll.addLast("December");
        ll.addFirst("January");
        System.out.println(ll);
        ll.add(1,"March");
        ll.add(1, "Febuary");
        ll.add(8, "September");
        ll.add(9, "Obtober");
    
        System.out.println("List "+ll);
        Iterator itr1=ll.iterator();
        System.out.println("Even Months");
        while(itr1.hasNext()) {
        	itr1.next();
        	  
        System.out.print(" "+itr1.next());
        }
        Iterator itr2=ll.iterator();
   System.out.println();
        System.out.println("Odd Months");
        while(itr2.hasNext()) {
        	
        System.out.print(" "+itr2.next());
        itr2.next();
        }
        Iterator itr=ll.iterator();
        System.out.println();
        System.out.println("Iterating over list");
        while(itr.hasNext()) {
        System.out.println( itr.next());
        }
       
        System.out.println("First and Last month "+ll.getFirst()+" "+ll.getLast());
        ll.removeLast();
        System.out.println("Removed My Birthday month December from list");
        System.out.println("List "+ll);
       
        System.out.println("Does LinkedList contains winter month 'January'? "+ll.contains("January"));
        System.out.println("First and Last month using peek "+ll.peekFirst()+" "+ll.peekLast());
        System.out.println("Removed First and Last month using poll "+ll.pollFirst()+" "+ll.pollLast());
        System.out.println(ll);
    }
}
