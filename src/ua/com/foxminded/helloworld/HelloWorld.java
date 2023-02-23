package ua.com.foxminded.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		
		int i = 6;
		int j = 7;
		float answer = (float)j / (float)i;
		double d = 2.5;
		
		boolean isMoreThanOne;
		
		float aaa = (float)j / 2;
		int bbb = j / 2;
		
		if(aaa - bbb <= 0) {
			isMoreThanOne = true;
		} else {
			isMoreThanOne = false;
		}
		
		System.out.println(isMoreThanOne);
		
		float aaa1 = (float)i / 2;
		int bbb1 = i / 2;
		
		if(aaa1 - bbb1 <= 0) {
			isMoreThanOne = true;
		} else {
			isMoreThanOne = false;
		}
		
		String stringAnswer;
		String message = "Hello World!";
	
		stringAnswer = message + answer;
		 
		System.out.println(isMoreThanOne);
		
		
	

	}
}
