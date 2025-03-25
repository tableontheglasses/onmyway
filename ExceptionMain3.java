package kr.ac.kopr.day15; //예외 발생 시

import java.util.Random;

public class ExceptionMain3 {
	
	public static void main(String [] args) {
		
		System.out.println("------------start-----------");

		Random r = new Random();
		
		try {
		int random = r.nextInt(5); //0~4
		System.out.println("random : " + random);
		
		System.out.println(10/random);
		
			} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행...");
		}
		
	/*	} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { 
			e.printStackTrace();
		}*/
		
		System.out.println("------------end-------------");
		
		
	}
}	
