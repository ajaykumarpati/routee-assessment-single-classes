package com.ajay.routee;

import java.util.Arrays;
import java.util.List;


public class DoRemake {

	public static void main(String[] args) {
		System.out.println(doRemake("Tom got a small piece of pie."));
	}

	public static String doRemake(String str)
	{
		StringBuilder result = new StringBuilder();
		List<String> words = Arrays.asList(str.split(" "));
		words.forEach(word -> {
			boolean lastWord = false;
			if(word.endsWith("."))
			{
				word = word.replace(".", "");
				lastWord = true;
			}

			if(startsWithVowel(word))
			{
				result.append(word).append("way");
			}
			else
			{
				result.append(word.substring(1)).append(word.charAt(0)).append("ay");
			}

			result.append(lastWord ? "." : " ");
		});
		return result.substring(0, 1).toUpperCase() + result.substring(1);
	}

	public static boolean startsWithVowel(String s)
	{
		switch(s.toLowerCase().charAt(0))
		{
		case 'a', 'e','i','o','u':
			return true;
		default: 
			return false;
		}
	}

}
