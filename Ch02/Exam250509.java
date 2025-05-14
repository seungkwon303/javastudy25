package Ch02;

import java.util.Scanner;

public class Exam250509 {

	public static void main(String[] args) {
		// ���� �����
		
		
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("이름을 입력하세요.");
	String name = input.nextLine();
	System.out.print("나이를 입력하세요.");
	String age = input.nextLine();
	System.out.print("주소를 입력하세요.");
	String adr = input.nextLine();
	
	System.out.println(name + "님 안녕하세요.");
	System.out.println("이름: " + name);
	System.out.println("나이: " + age + "세");
	System.out.println("주소: " + adr);
		

	}

}
