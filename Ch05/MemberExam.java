package Ch05;

import java.util.Scanner;

public class MemberExam {

	public static void main(String[] args) {
		// enum 객체를 회원등급용 코드로 생성하고
		// 회원가입 cord를 한번 만들어보기
		String[] names = null;
		String[] ids = null;
		String[] pws = null;
		MemberGrade[] grades = null;

		Scanner in = new Scanner(System.in);
		System.out.println(" 몇명의 회원을 등록하시겠습니까?");
		int count = in.nextInt();

		names = new String[count];
		ids = new String[count];
		pws = new String[count];
		grades = new MemberGrade[count];

		System.out.println("회원가입을 시작합니다.");
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름 : ");
			names[i] = in.next();
			System.out.print("ID : ");
			ids[i] = in.next();
			System.out.print("PW : ");
			pws[i] = in.next();

			System.out.println("등급 선택");
			System.out.println("1. GUEST");
			System.out.println("2. MEMBER");
			System.out.println("3. VIP");
			System.out.println("4. VVIP");
			System.out.println("5. VVVIP");
			String grade = in.next();
			switch (grade) {
			case "1":
				grades[i] = MemberGrade.GUEST;
				System.out.println("손님 등급입니다.");
				break;
			case "2":
				grades[i] = MemberGrade.MEMDER;
				System.out.println("회원 등급입니다.");
				break;
			case "3":
				grades[i] = MemberGrade.VIP;
				System.out.println("VIP 등급입니다.");
				break;
			case "4":
				grades[i] = MemberGrade.VVIP;
				System.out.println("VVIP 등급입니다.");
				break;
			case "5":
				grades[i] = MemberGrade.VVVIP;
				System.out.println("VVVVIP 등급입니다.");
				break;
			default:
				System.out.println("=====");
			}	// switch
			System.out.println(names[i] + "님" + grades[i] + "등급으로 가입 완료되었습니다");
		}//for
	
		for(int i = 0 ; i < names.length ; i++) {
			System.out.println("이름 : " + names[i]);
			System.out.println("ID : " + ids[i]);
			System.out.println("PW : " + pws[i]);
			System.out.println("등급 : " + grades[i]);
		}
		

	}

}
