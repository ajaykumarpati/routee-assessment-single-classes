package com.ajay.routee;

public class DigitSum {

	public static void main(String[] args) 
	{
		System.out.println(digitSum(99892));
	}

	public static int digitSum(int num)
	{
		if(num < 10)
		{
			return num;
		}
		else
		{
			return digitSum(String.valueOf(num)
					.chars()
					.map(Character::getNumericValue)
					.sum());
		}

	}

}
