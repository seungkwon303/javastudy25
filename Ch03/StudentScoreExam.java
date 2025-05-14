package Ch03;

import java.util.Scanner;

public class StudentScoreExam {

	public static void main(String[] args) {
		// 성적표 프로그램

		Scanner inInt = new Scanner(System.in); // 정수형
		Scanner inChar = new Scanner(System.in); // 문자
		Scanner input = new Scanner(System.in); // 문장

		boolean run = true;

		while (run) {
			System.out.println("=====성적관리프로그램=====");
			System.out.println("1. 교직원 메뉴");
			System.out.println("2. 학생 메뉴");
			System.out.println("3. 성적 메뉴");
			System.out.println("9. 프로그램 종료");
			System.out.print(">>>");
			int select = inInt.nextInt(); // 메뉴 번호눌러서 들어감

			switch (select) {

			case 1:

				boolean run2 = true;

				while (run2) {
					System.out.println("====교직원 메뉴====");
					System.out.println("A. 교적원 등록");
					System.out.println("B. 교적원 보기");
					System.out.println("C. 교적원 수정");
					System.out.println("D. 교적원 삭제");
					System.out.println("F. 교직원 메뉴 종료");
					System.out.print(">>>");

					char subselect = inChar.next().charAt(0); // 키보드로 입력받은 객체의 첫번째 글만 사용

					switch (subselect) {

					case 'a':
					case 'A':
						System.out.println("===교직원 등록===");
						System.out.print(" 성명 : ");
						String name = input.nextLine();

						System.out.print(" 나이 : ");
						int age = inInt.nextInt();

						System.out.print(" 근무 학(교/원)명 : ");
						String school = input.nextLine();

						System.out.print(" ID : ");
						String id = input.nextLine();

						System.out.print(" PW : ");
						String pw = input.nextLine();

						boolean a = true;
						while (a) {
							System.out.print(" PW확인 : ");
							String pw2 = input.nextLine();
							if (pw2.equals(pw)) {
								System.out.println("==일치합니다.==");
								System.out.println("==등록되었습니다.==");
								a = false;
								break;
							} else {
								System.out.println("==다시입력해주세요.==");
							} // 2차확인 맞는지 if문

						} // 비번 검증 while문
						break; // case 'A'

					case 'b':
					case 'B':
						System.out.println("===교직원 보기===");

						/*
						 * System.out.println("ID : "); String id2 = input.nextLine():
						 * System.out.println("PW : "); String pw2 = input.nextLine():
						 */

						// 위에서 저장한 정보를 끌어와야함
						// 등록된 정보와 입력한 아이디가 일치할 경우 로그인
						// 로그인 후에 등록 된 정보를 보여줘야함

						break; // case 'B'

					case 'c':
					case 'C':
						System.out.println("===교직원 수정===");
						
						// 위에서 저장된 정보를 기반으로 수정

						break; // case 'C'

					case 'd':
					case 'D':
						System.out.println("===교직원 삭제===");
						
						// 위에서 저장된 정보를 삭제

						break; // case 'D'

					case 'f':
					case 'F':
						System.out.println("===메뉴 종료===");
						run2 = false;
						break; // case 'F'

					default:
						System.out.println(" [다시 입려해주세요] ");

					} // 교직원 메뉴에서 선택 switch

				} // case1 안에 while문

				break; // case 1 교직원

			case 2:

				boolean run3 = true;

				while (run3) {
					System.out.println("====학생 메뉴====");
					System.out.println("A. 학생 등록");
					System.out.println("B. 학생 보기");
					System.out.println("C. 학생 수정");
					System.out.println("D. 학생 삭제");
					System.out.println("F. 학생 메뉴 종료");
					System.out.print(">>>");

					char subselect = inChar.next().charAt(0); // 키보드로 입력받은 객체의 첫번째 글만 사용

					switch (subselect) {

					case 'a':
					case 'A':
						System.out.println("===학생 등록===");
						System.out.print(" 성명 : ");
						String name = input.nextLine();

						System.out.print(" 나이 : ");
						int age = inInt.nextInt();

						System.out.print(" 재학중인 학(교/원)명 : ");
						String school = input.nextLine();

						System.out.print(" ID : ");
						String id = input.nextLine();

						System.out.print(" PW : ");
						String pw = input.nextLine();

						boolean a = true;
						while (a) {
							System.out.print(" PW확인 : ");
							String pw2 = input.nextLine();
							if (pw2.equals(pw)) {
								System.out.println("==일치합니다.==");
								System.out.println("==등록되었습니다.==");
								a = false;
								break;
							} else {
								System.out.println("==다시입력해주세요.==");
							} // 2차확인 맞는지 if문

						} // 비번 검증 while문
						break; // case 'A'

					case 'b':
					case 'B':
						System.out.println("===학생 보기===");
						break; // case 'B'

					case 'c':
					case 'C':
						System.out.println("===학생 수정===");
						break; // case 'C'

					case 'd':
					case 'D':
						System.out.println("===학생 삭제===");
						break; // case 'D'

					case 'f':
					case 'F':
						System.out.println("===메뉴 종료===");
						run3 = false;
						break; // case 'F'

					default:
						System.out.println(" [다시 입려해주세요] ");

					} // 학생 메뉴에서 선택 switch

				} // case2 안에 while문

				break; // case 2 학생

			case 3:
				boolean run4 = true;
				while (run4) {
					System.out.println("====성적 메뉴====");
					System.out.println("A. 성적 등록");
					System.out.println("B. 성적 보기");
					System.out.println("C. 성적 수정");
					System.out.println("D. 성적 삭제");
					System.out.println("F. 메뉴 종료");
					System.out.print(">>>");
					char subselect = inChar.next().charAt(0);

					switch (subselect) {
					case 'a':
					case 'A':
						System.out.println("==성적 등록==");
						System.out.println("==성적을 입력하세요.==");

						boolean score = true;
						boolean score2 = true;
						boolean score3 = true;

						while (score) {

							System.out.print("국어 : ");
							int kor = inInt.nextInt();

							if (kor < 0 || kor > 100) {
								System.out.println(" 점수를 다시 입력해주세요. ");

							} else if (kor >= 0 && kor <= 100) {
								System.out.println(" 입력하신 점수는 : " + kor + " 점입니다.");
								score = false;
								break;
							} // if문
						} // 점수 검증 while문

						System.out.println(" ");

						while (score2) {

							System.out.print("수학 : ");
							int mat = inInt.nextInt();

							if (mat < 0 || mat > 100) {
								System.out.println(" 점수를 다시 입력해주세요. ");

							} else if (mat >= 0 && mat <= 100) {
								System.out.println(" 입력하신 점수는 : " + mat + " 점입니다.");
								score2 = false;
								break;
							} // if문
						} // 점수 검증 while문

						while (score3) {

							System.out.print("영어 : ");
							int eng = inInt.nextInt();

							if (eng < 0 || eng > 100) {
								System.out.println(" 점수를 다시 입력해주세요. ");

							} else if (eng >= 0 && eng <= 100) {
								System.out.println(" 입력하신 점수는 : " + eng + " 점입니다.");
								score3 = false;
								break;
							} // if문
						} // 점수 검증 while문

						break; // case 3 성적

					case 'b':
					case 'B':
						System.out.println("==성적 보기==");
						break;

					case 'c':
					case 'C':
						System.out.println("==성적 수정==");
						break;

					case 'd':
					case 'D':
						System.out.println("==성적 삭제==");
						break;

					case 'f':
					case 'F':
						System.out.println("==메뉴 종료==");
						run4 = false;
						break;

					} // case3 switch문
				} // case3 while문
				break; // case 3 성적

			case 9:
				System.out.println("====프로그램 종료====");
				run = false;
				break; // 프로그램 종료

			default:
				System.out.println("[다시 눌러주세요]");

			} // 메뉴별 switch문

		} // 시작 while문 종료
	} // main 종료

}// class 종료
