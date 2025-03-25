package kr.ac.kopr.day15; //예외 발생 시

import java.util.Random;

public class ExceptionMain2 {
	
	public static void main(String [] args) {
		
		System.out.println("------------start-----------");

		Random r = new Random();
		
		try {
		int random = r.nextInt(5); //0~4
		System.out.println("random : " + random);
		
		System.out.println(10/random);
		
		char[] arr = new char[3];
		System.out.println("3번째 문자 :" + arr [3]);
		
		} catch(ArithmeticException ae) { //ae =변수선언 ->ArithmeticException ae 예외 발생 시 
		//	System.out.println("message : " + ae.getMessage());
			ae.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException aioe) {	
			System.out.println("ArithmeticException ...");
			aioe.printStackTrace();
		}	
		System.out.println("------------end-------------");
		
		
	}
}	
