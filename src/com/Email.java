package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
		String email = "abc.xyz@bridgelabz.com.in";
		String regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2})*$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		boolean result = matcher.matches();
		if (result)
			System.out.println("Vaild Email");
		else
			System.out.println("InVaild Email");
	}

}
