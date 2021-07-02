package com.ajay.routee;

public class FindSeven {
	
	public static final String SUCCESS= "Found";
	public static final String NOT_FOUND= "there is no 7 in the array";

	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,4,5,6,98788};
		System.out.println(findSeven(intArr));
	}
	
	public static String findSeven(int[] nums)
	{
		for(int num : nums)
		{
			for(char c : String.valueOf(num).toCharArray())
			{
				if(c == '7')
				{
					return SUCCESS;
				}
			}
			
		}
		
		return NOT_FOUND;
	}

}
