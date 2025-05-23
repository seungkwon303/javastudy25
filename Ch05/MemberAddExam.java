package Ch05;

import java.util.Scanner;

public class MemberAddExam {

	public static void main(String[] args) {
		// Member 클래스 호출 해보기

		Scanner in = new Scanner(System.in);
		Member[] members = null;

		System.out.println("가입할 회원수를 입력하세요");
		System.out.print(">>>");
		int count = in.nextInt();
		members = new Member[count]; // 키보드로 입력받은 수만큼 배열 생성

		System.out.println("회원가입 프로그램 시작");
		boolean run = true; // 회원가입 메뉴 반복문용
		while (run) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원전체보기");
			System.out.println("3. 로그인");
			System.out.println("4. 회원수정");
			System.out.println("5. 회원탈퇴");
			System.out.print(">>>");
			int select = in.nextInt();
			switch (select) {
			case 1:
				Member member1 = new Member(); // 객체 생성
				for (int i = 0; i < members.length; i++) {
					member1 = member1.memberAdd(in);
					members[i] = member1;
				} // for
				break;

			case 2:
				Member member2 = new Member();
				member2.memberList(members);
				break;

			case 3:
				Member member3 = new Member(); // 객체생성)
				member3.memberLogin(in, members);
				break;

			case 4:
				Member member4 = new Member(); // 객체생성)
				member4 = member4.memberUpdate(in, members);
				break;
				
			case 5 : 
				Member member5 = new Member();
				member5 = member5.memberDelete(in, members);

			}// switch(select)

		} // while(run)

	}

}
