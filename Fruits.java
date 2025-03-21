package SelfStudy;

public class Fruits {
	
	String color = "노란색";
	String sweet = "이빨썩음";
	String price = "비싸다";
	
	Fruits() {
		
	} // 기본생성자
	
	Fruits(String color) {
		this.color = color;
	} // 매개 변수가 1개 있는 생성자

//	Fruits(String sweet){
//		this.sweet = sweet;
//	}
//	
//	Fruits(String price){
//		this.sweet = sweet;
//	}
	
	Fruits(String price,String sweet) {
		this.price = price;
		this.sweet = sweet;
	}
	
	Fruits(String price,String sweet,String color){
		this.price = price;
		this.sweet = sweet;
		this.color = color;			
	}
}

// 코드 작성자가 클래스를 설계를 한 거야
// 클래스는 어떤 가지나요? => 설계도
// 

class FruitsMain {
	public static void main(String[] args) {
		// new Fruits(); 우리가 인스턴스 (클래스를 이용해 만든 객체) 를 만든 것 뿐이고 아직 어떠한 변수에 저장을 화지 않은 거야 
		Fruits abc = new Fruits("만원", "중" , "빨간색"); 
		
		System.out.println(abc.color);
		
		
		
	}
}



