package kr.ac.kopr.day15;

import java.util.Random;

public class callFunc {
	
	static void b() throws NullPointerException{
	String[] strArr = new String[5];
	strArr[0] = "hello";
	strArr[2] = "good";
	
	for(int i = 0; i < strArr.length; i++) {
		System.out.println("length " + strArr[i].length());
	}
}
	

static void a() {
	try {
		Random r = new Random();
		int random = r.nextInt(5);
		System.out.println("random :" + random);
		System.out.println(10 / random);
	} catch(Exception e) {
	e.printStackTrace();
}
}
	public static void main (String [] args) {
		
		a();
		
		b();
		
	}
}








