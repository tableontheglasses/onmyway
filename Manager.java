package kr.ac.kopo.day19;

public class Manager {
	
	int 		no;
	String 		name;
	String 		grade;
	int 		salary;
	Employee[] 	empList; //관리사원 목록
	
	Manager(int no, String name, String grade, int salary, Employee[] empList) {
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
		this.empList = empList;
	}
	
	void info() {
		System.out.println("사원번호 : " + no);
		System.out.println("사 원 명 :" + name) ;
		System.out.println("직 급: " + grade);
		System.out.println("연봉 : "+ salary);
		System.out.println("------------------------------");
		
		System.out.println("<<<< 관리사원 리스트 >>>");
		for(Employee e : empList) {
			e.info();
		}
	}

}
