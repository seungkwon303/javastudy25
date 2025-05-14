package Ch03;

import java.util.Scanner;

public class Exam250512 {

	public static void main(String[] args) {
		// ����ǥ
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		System.out.print(">>>");
		String name = input.nextLine();
		System.out.println("성적을 입력하세요");
		System.out.print("국어 : ");
		int kor = input.nextInt(); // ���� ���� �Է�
		if (kor < 0 || kor > 100) {
			System.out.println("다시 입력하세요.");
		} // ���� ����
		
		System.out.print("수학 : ");
		int mat = input.nextInt(); // ���� ���� �Է�
		if (mat < 0 || mat > 100) {
			System.out.println("다시 입력하세요.");
		}// ���� ����
		
		System.out.print("영어 : ");
		int eng = input.nextInt(); // ���� ���� �Է�
		if (eng < 0 || eng > 100) {
			System.out.println("다시 입력하세요.");
		} // ���� ����
		
		
		int total = kor + mat + eng ; // ���� �Ի�
		double avg = (double)total / 3 ; // ��� ���
		System.out.println("==계산중==.");
		System.out.print("확인하시겠습니까?(yes) : ");
		String answer = input.next();
		if (answer.equalsIgnoreCase("yes")) { //if�� ����
			System.out.println("============");
			System.out.println("평균 : " + avg ); 
		// ------------------------------------------------
			if (kor >= 90) { // ���� ��� if�� ����
				System.out.println("국어 : A등급.");
			}else if (kor >= 80) {
				System.out.println("국어 : B등급.");
			}else if (kor >= 70) {
				System.out.println("국어 : C등급.");
			}else if (kor >= 60) {
				System.out.println("국어 : D등급.");
			}else {
				System.out.println("국어 : F등급.");
			}
		// --------------------------���� ��� ǥ��
			
			if (mat >= 90) {
				System.out.println("수학 : A등급.");
			}else if (mat >= 80) {
				System.out.println("수학 : B등급.");
			}else if (mat >= 70) {
				System.out.println("수학 : C등급.");
			}else if (mat >= 60) {
				System.out.println("수학 : D등급.");
			}else {
				System.out.println("수삭 : F등급.");
			}
			//----------���е��
			if (eng >= 90) {
				System.out.println("영어 : A등급.");
			}else if (eng >= 80) {
				System.out.println("영어 : B등급.");
			}else if (eng >= 70) {
				System.out.println("영어 : C등급.");
			}else if (eng >= 60) {
				System.out.println("영어 : D등급.");
			}else {
				System.out.println("영어 : F등급.");
			}
	        //--------------------------���� ���
					
		}else {
			System.out.println("오류.");	
		} // if�� ����

	} // main ����

}// class ����
