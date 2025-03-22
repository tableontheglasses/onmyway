package weekendTest;

public class SelfTestIfElse {

	public static void main(String[] args) {
		
		int score = 40;
		
		if(score>=90) {
			System.out.println("점수 100~90입니다.");
			System.out.println("에메랄드 등급입니다.");
		}else if(score>=80) {
			System.out.println("점수 80~89입니다.");
			System.out.println("플레티넘 등급입니다.");
		}else if(score>=70) {
			System.out.println("점수는 70~79입니다.");
			System.out.println("골드 등급입니다.");
		}else {
			System.out.println("점수는 70점 미만입니다.");
			System.out.println("실버 등급입니다.");
			

	}

}
}