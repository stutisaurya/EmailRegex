package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
		String email = "abc@bridgelabz";
		String regex = "^[a-zA-Z0-9]+@[a-zA-Z]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		boolean result = matcher.matches();
		if (result)
			System.out.println("Vaild Email");
		else
			System.out.println("InVaild Email");
	}

}
