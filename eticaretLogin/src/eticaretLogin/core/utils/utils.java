package eticaretLogin.core.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class utils {
	
	public static boolean emailValidate(String email) {
		String regex="^[a-Za-Z0-9_!#$%&'*+/=?'{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern =Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		System.out.println(email+" : "+matcher.matches());
		return matcher.matches();
		
	}

}
