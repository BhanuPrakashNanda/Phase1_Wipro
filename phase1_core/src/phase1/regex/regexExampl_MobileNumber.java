package phase1.regex;

import java.util.regex.*;  
public class regexExampl_MobileNumber  
{  
   
public static boolean isValidMobileNo(String str)  
{  

Pattern ptrn = Pattern.compile("[\\w+](0|91 )?[0-9]{10}");  

Matcher match = ptrn.matcher(str);  

return (match.find() && match.group().equals(str));  
}  

public static void main(String args[])  
{  
 
String str = "+91 9900088899"; 


if (isValidMobileNo(str))  
System.out.println("It is a valid mobile number.");   
else  
System.out.println("Entered mobile number is invalid.");      
}  
} 