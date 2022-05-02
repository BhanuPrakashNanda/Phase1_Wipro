package phase1.collections;


import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        
        
        treeSet.add("C");
        treeSet.add("Java");
        treeSet.add("C++");
        treeSet.add("COBOL");
        treeSet.add("HTML");
        treeSet.add("PYHTON");
        
        System.out.println("TreeSet is : " + treeSet);
        //System.out.println("Check if TreeSet is empty : " + treeSet.isEmpty());
        treeSet.remove("C");
        treeSet.remove("Java");
        System.out.println("Removed Java and C from Set");
        treeSet.add("C");
        treeSet.add("SQL");
        treeSet.add("c#");
        System.out.println(treeSet.contains("Java"));
        if(treeSet.contains("Java")){
        	System.out.println("Java is present");
        }
        else{
        	System.out.println("Java is not present");
        }
        
        treeSet.clear();
        System.out.println("Treeset after removal "+treeSet);
    }
}