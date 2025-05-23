package Ch05;

import java.util.Scanner;

public class Reg {
	// 필드 6개
	String name;
	int age;
	String adress;
	char ssn;
	String id;
	String pw;

	// 생성자 오버로딩 4개
	public Reg() {

	}

	public Reg(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public Reg(String adress, char ssn) {
		this.adress = adress;
		this.ssn = ssn;
	}

	public Reg(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	
	//메서드
	
	public Reg signUp(Scanner in, Reg reg) {
		System.out.print("이름 : ");
		name = in.next();
		System.out.print("나이 : ");
		age = in.nextInt();
		System.out.print("주소 : ");
		adress = in.next();
		System.out.print("주민번호 : ");
		ssn = in.next().charAt(ssn);
		System.out.print("ID : ");
		id = in.next();
		System.out.print("PW : ");
		pw = in.next();
		return reg;
		// 리턴값이 없다면?
	}
}
