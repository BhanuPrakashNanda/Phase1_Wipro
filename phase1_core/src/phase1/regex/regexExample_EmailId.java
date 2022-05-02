package phase1.regex;

import java.util.regex.Pattern;

public class regexExample_EmailId {
	public static void main(String[] args){
		String email1="bhanubgb@gmail.com";
		String email2="manasabgb@gmail.com";
		System.out.println(validateEmail(email1));
		System.out.println(validateEmail(email2));
	}
	public static String validateEmail(String id){
		if(id==null||id.isEmpty()){
			return "Not Valid";
		}
		else{
			Pattern p;
			String regex="[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			Pattern p1=Pattern.compile(regex);
			if(p1.matcher(id).matches()){
				return "valid";
			}
			else{
				return "Not Valid";
			}
			
		}

		
	}
}
