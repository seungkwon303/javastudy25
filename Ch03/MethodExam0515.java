package Ch03;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class MethodExam0515 {

	public static void main(String[] args) {
		// 성적표 프로그램

		Scanner inputStr = new Scanner(System.in); // 문자용
		Scanner inputInt = new Scanner(System.in); // 정수용
		boolean run = true; // while문
		boolean session = false; // 로그인 상태 저장
		boolean session2 = false;
		boolean sessionSt = false;
		boolean sessionSt2 = false;

		String id = "ss";
		String pw = "as";
		String idSt = "ss";
		String pwSt = "as";

		System.out.println("===성적표 프로그램==");

		while (run) {
			System.out.println("1. 교직원용");
			System.out.println("2. 학생용");
			System.out.println("9. 프로그램 종료");
			System.out.print(">>>");
			int select = inputInt.nextInt();

			switch (select) { 

			case 1: // 교직원용
				System.out.println("==교직원메뉴에 입장==");
				boolean run2 = true;
				while (run2) {
					System.out.println("A. 로그인");
					System.out.println("B. 회원가입");
					System.out.println("F. 종료");
					System.out.print(">>>");
					char subselect = inputStr.next().charAt(0);
					switch (subselect) {
					case 'a':
					case 'A':
						System.out.println("===로그인===");
						boolean logOk = true;
						while (logOk) {
							session = loginOk(id, pw, session);
							if (session == true) {
								System.out.println("==로그인 성공!==");
								logOk = false;
							} else {
								System.out.println("==로그인 실패!==");
								logOk = true;
							} // 로그인 성공 여부 if문

						} // 로그인 실패시 반복문 while (logOk)

						// 로그인 후에 교직원 메뉴
						// 교직원 보기, 수정, 삭제, 학생 + 성적 등록

						System.out.println("===환영합니다==="); // 로그인 후에 교직원 메뉴 진입
						boolean run3 = true;
						while (run3) { // 교직원 메뉴 반복
							System.out.println("1. 정보 보기");
							System.out.println("2. 정보 수정");
							System.out.println("3. 정보 삭제");
							System.out.println("4. 학생 및 성적 등록 ");
							System.out.println("9. 종료");
							System.out.print(">>>");
							int subselect2 = inputInt.nextInt(); // 진입하고자하는 메뉴 선택
							switch (subselect2) {

							case 1:
								System.out.println("==교직원 정보==");
								// 개인정보 나열
								System.out.println(" 성명 : ");
								System.out.println(" 나이 : ");
								System.out.println(" 근무 학(교/원) : ");
								System.out.println(" ID : ");
								System.out.println(" PW :");
								break;

							case 2:
								System.out.println("==정보 수정==");
								// 개인정보 나열
								break;

							case 3:
								System.out.println("==정보 삭제==");
								// 개인정보 나열
								break;

							case 4:
								System.out.println("==학생 및 성적 등록==");
								// 개인정보 나열
								break;

							case 9:
								System.out.println("==종료==");
								// 개인정보 나열
								run3 = false;
								break;

							default:
								System.out.println("다시 눌러주세요.");

							} // switch (subselect2)문 종료
						}
						break;
					// --------------------교직원용 로그인

					case 'b':
					case 'B':
						System.out.println("==회원가입==");
						session2 = newLogin(session2);

						if (session2 == true) {
							System.out.println("==회원가입 완료!==");
						} else {
							System.out.println("===오류!!!!===");
						} // 회원가입 여부 if문
						break;
					// ---------------------교직원용 회원가입

					case 'f':
					case 'F':
						System.out.println("==프로그램 종료==");
						run2 = false;
						break;

					default:
						System.out.println("==다시 입력해주세요.==");

					} // 로그인 or 회원가입 매뉴 switch문

				} // while(run2)문 종료

				break; // case 1 (교직원 메뉴)
			// -----------------------------------------------------

			case 2:
				System.out.println("==학생메뉴에 입장==");
				boolean run3 = true;
				while (run3) {
					System.out.println("A. 로그인");
					System.out.println("B. 회원가입");
					System.out.println("F. 종료");
					System.out.print(">>>");
					char subselect1 = inputStr.next().charAt(0);
					switch (subselect1) {
					case 'a':
					case 'A':
						System.out.println("===로그인===");
						boolean logOk = true;
						while (logOk) {
							sessionSt = loginOkSt(id, pw, sessionSt);
							if (sessionSt == true) {
								System.out.println("==로그인 성공!==");
								logOk = false;
							} else {
								System.out.println("==로그인 실패!==");
								logOk = true;
							} // 로그인 성공 여부 if문

						} // 로그인 실패시 반복문 while (logOk)

						// 로그인 후 학생용 메뉴-- 학생 보기, 수정, 삭제 , 성적 확인
						System.out.println("===환영합니다==="); // 로그인 후에 학생 메뉴 진입
						boolean run4 = true;
						while (run4) { // 학생 메뉴 반복
							System.out.println("1. 정보 보기");
							System.out.println("2. 정보 수정");
							System.out.println("3. 정보 삭제");
							System.out.println("4. 성적 확인 ");
							System.out.println("9. 종료");
							System.out.print(">>>");
							int subselect2St = inputInt.nextInt(); // 진입하고자하는 메뉴 선택
							switch (subselect2St) {

							case 1:
								System.out.println("==학생 정보==");
								// 개인정보 나열
								break;

							case 2:
								System.out.println("==정보 수정==");
								// 개인정보 나열
								break;

							case 3:
								System.out.println("==정보 삭제==");
								// 개인정보 나열
								break;

							case 4:
								System.out.println("==성적 확인==");
								// 개인정보 나열
								break;

							case 9:
								System.out.println("==종료==");
								// 개인정보 나열
								run4 = false;
								break;

							default:
								System.out.println("다시 눌러주세요.");

							} // switch (subselect2St)문 종료
						}

						break;
					// ---------------------학생용 로그인

					case 'b':
					case 'B':
						System.out.println("==회원가입==");
						sessionSt2 = newLoginSt(sessionSt2);

						if (sessionSt2 == true) {
							System.out.println("==회원가입 완료!==");
						} else {
							System.out.println("===오류!!!!===");
						} // 회원가입 여부 if문
						break;
					// --------------------학생용 회원가입

					case 'f':
					case 'F':
						System.out.println("==프로그램 종료==");
						run3 = false;
						break;

					default:
						System.out.println("==다시 입력해주세요.==");

					} // 로그인 or 회원가입 매뉴 switch문

				} // while(run3)문 종료

				break; // case 2 (학생메뉴)
			// ----------------------------------------------------

			case 9:
				System.out.println("==프로그램 종료==");
				run = false;
				break; // case 9 (프로그램 종료)

			default:
				System.out.println("==다시입력해주세요.==");

			}// switch(select)문 종료

		} // while(run)문 종료

	} // main 메서드 종료

	static boolean newLoginSt(boolean sessionSt2) {
		// 회원가입
		Scanner newLoginSt = new Scanner(System.in);
		System.out.print("생성할 ID : ");
		String newIdSt = newLoginSt.next();
		System.out.print("생성할 PW : ");
		String newPwSt = newLoginSt.next();
		boolean scpwSt = true;
		while (scpwSt) {
			System.out.print("PW 확인 : ");
			String newPw2St = newLoginSt.next();
			if (newPwSt.equals(newPw2St)) {
				System.out.println("==pw가 일치합니다.==");
				scpwSt = false;
				sessionSt2 = true;
				break;
			} else {
				System.out.println("==다시 입력해주세요.==");
				scpwSt = true;
			} // 암호 검증

		} // while(scpwSt)문 종료
		return sessionSt2; // 리턴값
	} // 회원가입
		// --------------------학생용 회원가입

	static boolean loginOkSt(String idSt, String pwSt, boolean sessionSt) {
		// 로그인 여부를 결정하는 메서드
		Scanner inputLoginSt = new Scanner(System.in); // 카보드 입력받을 객체 생성

		System.out.print("ID : ");
		String loginIdSt = inputLoginSt.next();
		System.out.print("PW : ");
		String loginPwSt = inputLoginSt.next();

		if (idSt.equals(loginIdSt) && pwSt.equals(loginPwSt)) { // 저장된 로그인 아이디와 입력한 아이디가 같을 때
			System.out.println("==로그인 성공==");
			sessionSt = true;
		} else {
			System.out.println("==다시 입력해주세요.==");
			sessionSt = false;
		} // 로그인 성공 여부 if문

		return sessionSt; // 리턴값
	} // 로그인 여부 메서드 종료
		// -----------------------------학생용 로그인

	static boolean newLogin(boolean session2) {
		// 회원가입
		Scanner newLogin2 = new Scanner(System.in);
		System.out.print("생성할 ID : ");
		String newId = newLogin2.next();
		System.out.print("생성할 PW : ");
		String newPw = newLogin2.next();
		boolean scpw = true;
		while (scpw) {
			System.out.print("PW 확인 : ");
			String newPw2 = newLogin2.next();
			if (newPw.equals(newPw2)) {
				System.out.println("==pw가 일치합니다.==");
				scpw = false;
				session2 = true;
				break;
			} else {
				System.out.println("==다시 입력해주세요.==");
				scpw = true;
			} // 암호 검증

		} // while(scpw)문 종료
		return session2; // 리턴값
	} // 회원가입
		// -------------------교직원용 회원가입

	static boolean loginOk(String id, String pw, boolean session) {
		// 로그인 여부를 결정하는 메서드
		Scanner inputLogin = new Scanner(System.in); // 카보드 입력받을 객체 생성

		System.out.print("ID : ");
		String loginId = inputLogin.next();
		System.out.print("PW : ");
		String loginPw = inputLogin.next();

		if (id.equals(loginId) && pw.equals(loginPw)) { // 저장된 로그인 아이디와 입력한 아이디가 같을 때
			System.out.println("==로그인 성공==");
			session = true;
		} else {
			System.out.println("==다시 입력해주세요.==");
			session = false;
		} // 로그인 성공 여부 if문

		return session; // 리턴값
	} // 로그인 여부 메서드 종료
		// -----------------------------교직원용 로그인

} // class 종료
