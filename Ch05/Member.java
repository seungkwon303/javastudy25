package Ch05;

import java.util.Scanner;

public class Member {

	// 필드 : 객체가 가지고 있어야 할 값(변수)
	public int mno ; //회원번호
	public String id; // 아이디
	public String pw; // 암호
	
	
	// 생성자 : Exam 클래스에서 main()메서드에서 new로 호출할 때 동작
	public Member() {
		// 기본 생성자 : 클래스 명과 같은 메서드
		// Member member = new Member();
	}
	
	
	// 메서드 : Member클래스에서 행해지는 동장 CRUD
	public Member memberAdd(Scanner in) { // 스케너  넘어옴
		Member member = new Member();
		System.out.println("회원가입용 메서드입니다.");
		System.out.println("회원 번호를 입력하세요.");
		System.out.print(">>>");
		member.mno= in.nextInt();
		
		System.out.print("회원가입 ID : ");
		member.id = in.next();
		
		System.out.print("회원가입 PW : ");
		member.pw = in.next();
		
		return member;
	}// memberAdd 매서드 종료
	
	public void memberList(Member[] members) {
		System.out.println("회원 리스트 보기용 메서드");
		for(int i = 0 ; i < members.length ; i++) {
			System.out.print("회원 번호: "+ members[i].mno); // members[i]안의 mno만 출력
			System.out.print(" / ID : "+ members[i].id);
			System.out.println(" / PW: "+ members[i].pw);
			System.out.println("=====================");
		}
		
	}//  memberList 메서드 종료
	
	public void memberLogin(Scanner in,Member[] members) {
		System.out.println("로그인용 메서드 입니다");
		System.out.print("ID : ");
		String id = in.next();
		System.out.print("PW : ");
		String pw = in.next();
		for(int i = 0 ; i < members.length ; i++) { // 반복문
			if(id.equals(members[i].id) && pw.equals(members[i].pw)) {// 입력한 아이다와 저장된 아이다가 같은지 
				System.out.println("로그인 성공"); // 맞으면 로그인 성공
				break;
			}else {
				continue; 
			}// 이러면 두번 틀려도 넘어감, 
		}
		
	}//  memberLogin 메서드 종료
	
	public Member memberUpdate(Scanner in, Member[] members) {
		Member member = new Member();
		System.out.print("수정할 회원번호 : ");
		int a = in.nextInt();
		for(int i = 0 ; i < members.length ; i++) {
			if(a == members[i].mno) {
				System.out.println("회원정보");
				System.out.println("ID : " + members[i].id);
				System.out.println("PW : " + members[i].pw);
				System.out.print("수정할 ID : ");
				members[i].id = in.next();
				System.out.print("수정할 PW : ");
				members[i].pw = in.next();
			}else {
				continue;
			}
		}
		
		return member;
	}//  memberUpdate 메서드 종료
	
	public Member memberDelete(Scanner in, Member[] members) {
		Member member = new Member();
		System.out.print("삭제할 회원번호 : ");
		int a = in.nextInt();
		for(int i = 0 ; i < members.length ; i++) {
			if(a == members[i].mno) {
				System.out.println("회원정보");
				System.out.println("ID : " + members[i].id);
				System.out.println("PW : " + members[i].pw);
				System.out.print("삭제 하시겠습니까?(yes) : ");
				String answer = in.next();
				if(answer.equalsIgnoreCase("yes")) {
					members[i] = null ;
				}
			}else {
				continue;
			}
		}
		
		return member;
		
	}//  memberDelete 메서드 종료
}
