package Ch05;

import java.util.Scanner;

public class RegExam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Reg reg = new Reg();
		boolean run = true;

		System.out.println("회원가입");
		reg.signUp(in,reg);
		System.out.println("이름 : " + reg.name);
		System.out.println("나이 : " + reg.age);
		System.out.println("주소 : " + reg.adress);
		System.out.println("주민등록번호 : " + reg.ssn);
		System.out.println("ID : " + reg.id);
		System.out.println("PW : " + reg.pw);
		
		System.out.println("로그인");
		System.out.print("ID : ");
		String id = in.next();
		System.out.print("PW : ");
		String pw = in.next();
		if ((id.equals(reg.id)) && (pw.equals(reg.pw))) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		

	}// main

}// class
