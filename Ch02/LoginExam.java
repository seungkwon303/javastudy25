package Ch02;

import java.util.Scanner;

public class LoginExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 :");
		String id = input.nextLine();
		System.out.println("입력하신 ID는 " + id + "입니다."); // 입력한 아이디 확인
		
		System.out.print("암호를 입력하세요.");
		String pw = input.nextLine(); // 패스워드 확인
		System.out.print("암호를 한번더 입력해주세요 :");
		String pww = input.nextLine(); // 2차 확인
		
		if(pww.equals(pw)) {
			System.out.println("확인되었습니다.");
			System.out.println("========로그인========");
		}else {
			System.out.println("일치하지않습니다.");
		}// if문 종료
		
		String loginid = id ; // 위에서 입력한 아이디
		String loginpw = pw = pww ; // 위에서 입력한 비밀번호
		
		
		System.out.println("로그인하실 아이디를 입력하세요 :");
		String id2 = input.nextLine();
		
		System.out.println("로그인하실 암호를 입력하세요 :");
		String pw2 = input.nextLine();
		System.out.println("====잠시만 기다려주세요====");
		
		if ( (loginid.equals(id2)) & loginpw.equals(pw2) ) {
			System.out.print("로그인되었습니다!");
		}else {
			System.out.print("일치하지않습니다.");
		}//if문 종료

	} // main 메소드 종료

} // class 종료
