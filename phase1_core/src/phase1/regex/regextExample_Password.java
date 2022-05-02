package phase1.regex;

import java.util.regex.Pattern;

public class regextExample_Password {
	public static void main(String[] args){
		String email1="Banasaa123";
		String email2="bhanurt12u";
		System.out.println(validateEmail(email1));
		System.out.println(validateEmail(email2));
	}
	public static String validateEmail(String id){
		if(id==null||id.isEmpty()){
			return "Not Valid";
		}
		else{
			Pattern p;
			String pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
			Pattern p1=Pattern.compile(pattern);
			if(p1.matcher(id).matches()){
				return "valid";
			}
			else{
				return "Not Valid";
			}
			
		}

		
	}

	}


