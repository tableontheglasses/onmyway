package kr.ac.kopr.day15; //예외 발생 시

import java.util.Random;

public class ExceptionMain4 {
	
	public static void main(String [] args) {
		
		System.out.println("------------start-----------");

		Random r = new Random();
		
		int random = r.nextInt(5); //0~4
		System.out.println("random : " + random);
		
		System.out.println(10/random);
		
		System.out.println("------------end-------------");
		
		
	}
}	
