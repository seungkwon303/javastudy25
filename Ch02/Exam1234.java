package Ch02;

import java.util.Scanner;

public class Exam1234 {

	public static void main(String[] args) {

	     Scanner input = new Scanner(System.in);
	     
	     System.out.println("==������ �Է����ּ���==");
	     System.out.print("���� : ");
	     int kor = input.nextInt();
	     System.out.print("���� : ");
	     int mat = input.nextInt();
	     System.out.print("���� : ");
	     int eng = input.nextInt();
	     
	     double total = kor + mat + eng ;
	     double avg = total / 3 ;
	     char kor1 = (kor >= 90) ? 'A' : ((kor >= 70) ? 'B' : 'C') ;
	     char mat1 = (mat >= 90) ? 'A' : ((mat >= 70) ? 'B' : 'C') ;
	     char eng1 = (eng >= 90) ? 'A' : ((eng >= 70) ? 'B' : 'C') ;
	     
	     System.out.println("���� :" + kor1 + "���");
	     System.out.println("���� :" + mat1 + "���");
	     System.out.println("���� :" + eng1 + "���");
	     System.out.println("���� : " + total);
	     System.out.println("��� : " + avg);
	     

	}

}
