package Ch03;

import java.util.Scanner;

public class SwitchExam0513 {

	public static void main(String[] args) {
		// switch�� �ǽ�
		
		// �ֻ��� Ȱ��
		int num = (int)(Math.random()*6) + 1 ; // �ֻ��� 1~6 ���� ����
		
		switch(num) {
		case 1 :
			System.out.println("1");
			break ;
		case 2 :
			System.out.println("2");
			break ;
		case 3 :
			System.out.println("3");
			break ;
		case 4 :
			System.out.println("4");
			break ;
		case 5 :
			System.out.println("5");
			break ;
		case 6 :
			System.out.println("6");
			break ;
	    default :
	    	System.out.println("오류");
	    	break;
		
		} // switch�� ����
		
		// break�� ���� switch��
		
		int time = (int)(Math.random()*3) + 8 ;
		System.out.println("현재 시간은 " + time + "시 입니다.");
		
		switch(time) {
		case 8 :
			System.out.println("기상을 하고");
		case 9 :
			System.out.println("버스를 타고");
		case 10 :
			System.out.println("학원에 도착을 해서");
		default :
			System.out.println("공부를 합니다.");
		} // ����ġ�� ����
		
		System.out.println("주민등록번호를 입력하세요. ");
		System.out.print(">>>");
		Scanner aa = new Scanner(System.in);
		String aa1 = aa.nextLine();
		char gender = aa1.charAt(7);
		
		switch (gender) {
		case '1' : case '3' : case '5' : case '7' :
			System.out.println("남자.");
			break;
			
		case '2' : case '4' : case '6' : case '8' :
			System.out.println("여자.");
			break;
			
		default :
			System.out.println("오류.");
		}
		
		
		
		

	} // main

} // class
