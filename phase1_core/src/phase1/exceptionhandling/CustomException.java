package phase1.exceptionhandling;

public class CustomException{  
	  
	   static void validate(int salary)throws InvalidSalaryException{  
	     if(salary<2100)  {
	      throw new InvalidSalaryException("you need to work hard");  
	   }
	     else if(salary>2100&&salary<5100){
	    	 throw new InvalidSalaryException("your salary is somehow good");  
		   } 
	     else if(salary>5100&&salary<9000){
	    	 throw new InvalidSalaryException("salary is very good");  
	   }  
	   }
	   public static void main(String args[]){  
	      try{ 
	    	  System.out.println("salary is "+7200);
	    	  validate(7200);
	    	
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  

//This class is created for your own defined exception message
class InvalidSalaryException extends Exception{  // 1
	
	//private static final long serialVersionUID = 1L;

	InvalidSalaryException(String s){  //2
	  super(s);  
	 }  
}  
