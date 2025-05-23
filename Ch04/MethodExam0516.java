package Ch04;

import java.util.Scanner;

public class MethodExam0516 {

	public static void main(String[] args) {
		//

		Scanner inputStr = new Scanner(System.in); // 문자용
		Scanner inputInt = new Scanner(System.in); // 정수용
		boolean run = true; // 주메뉴 반복용
		String[] idTc = new String[30]; // 아이디배열
		String[] pwTc = new String[30]; // 비번 배열

		System.out.println("===성적표 프로그램=="); // 프로그램 시작

		while (run) { // 주메뉴 반복
			System.out.println("1. 교직원용");
			System.out.println("2. 학생용");
			System.out.println("9. 프로그램 종료");
			System.out.print(">>>");
			int select = inputInt.nextInt();

			switch (select) {
			case 1:
				System.out.println("==교직원==");
				boolean run2 = true;
				while (run2) {
					System.out.println("A. 로그인");
					System.out.println("B. 회원가입");
					System.out.println("F. 종료");
					char selectTc1 = inputStr.next().charAt(0);

					switch (selectTc1) {
					case 'a':
					case 'A':
						System.out.println("==로그인==");
						loginOk(idTc, pwTc);
						break;

					case 'b':
					case 'B':
						System.out.println("==회원가입==");
						newLogin(idTc, pwTc);
						break;

					case 'c':
					case 'C':
						System.out.println("==종료==");
						run2 = false;
						break;

					default:
						System.out.println("다시 입력해주세요.");

					}// switch(selectTc1)

				} // while (run2) 종료

				break; // case 1
			// -----------------------------교직원

			case 2:
				System.out.println("==학생용==");
				break; // case 2
			// -----------------------------학생

			case 9:
				System.out.println("==종료==");
				run = false;
				break; // case 9

			default:
				System.out.println("다시 입력해주세요.");

			}// switch(select)문 종료

		} // while (run)문 종료

	} // main 메서드 종료

	static void loginOk(String[] idTc, String[] pwTc) {
		// 로그인
		Scanner inStr = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.print("ID : ");
			String id = inStr.next();
			System.out.print("PW : ");
			String pw = inStr.next();
			
			for (int i = 0 ; i < 3 ; i ++) {
			if (id.equals(idTc[i]) && pw.equals(pwTc[i])) {
				System.out.println("==로그인 성공!==");
				run = false;
				break;

			} else {
				System.out.println("다시입력해주세요.");
			}
			}
		}

	} // 교직원 로그인

	static void newLogin(String[] idTc, String[] pwTc) {
		// 회원가입
		Scanner inStr = new Scanner(System.in);

		for (int i = 0 ; i < 3 ; i ++) {
		System.out.println("==아이디를 생성해주세요==");
		System.out.print("ID : ");
		idTc[i] = inStr.next();
		System.out.print("PW : ");
		pwTc[i] = inStr.next();
		}
		System.out.println("회원가입 완료");

	}// 교직원 회원가입

} // class 종료
