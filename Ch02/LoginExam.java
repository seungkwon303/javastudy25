package Ch02;

import java.util.Scanner;

public class LoginExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디를입력하세요 :");
		String id = input.nextLine();
		System.out.println("입력하신 아이디는 : " + id + "입니다."); // �Է��� ���̵� Ȯ��
		
		System.out.print("암호를 입력하세요..");
		String pw = input.nextLine(); // �н����� Ȯ��
		System.out.print("한번더 입력하세요. :");
		String pww = input.nextLine(); // 2�� Ȯ��
		
		if(pww.equals(pw)) {
			System.out.println("일치합니다.");
			System.out.println("================");
		}else {
			System.out.println("다시 입력해주세요.");
		}// if�� ����
		
		String loginid = id ; // ������ �Է��� ���̵�
		String loginpw = pw = pww ; // ������ �Է��� ��й�ȣ
		
		
		System.out.println("아이디를 입력하세요 :");
		String id2 = input.nextLine();
		
		System.out.println("암호를 입력하세요 :");
		String pw2 = input.nextLine();
		System.out.println("==로딩중==");
		
		if ( (loginid.equals(id2)) & loginpw.equals(pw2) ) {
			System.out.print("로그인되었습니다!");
		}else {
			System.out.print("다시 입력하세요.");
		}//if�� ����

	} // main �޼ҵ� ����

} // class ����
