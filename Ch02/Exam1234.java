package Ch02;

import java.util.Scanner;

public class Exam1234 {

	public static void main(String[] args) {

	     Scanner input = new Scanner(System.in);
	     
	     System.out.println("==성적을 입력하세요.==");
	     System.out.print("국어 : ");
	     int kor = input.nextInt();
	     System.out.print("수학 : ");
	     int mat = input.nextInt();
	     System.out.print("영어 : ");
	     int eng = input.nextInt();
	     
	     double total = kor + mat + eng ;
	     double avg = total / 3 ;
	     char kor1 = (kor >= 90) ? 'A' : ((kor >= 70) ? 'B' : 'C') ;
	     char mat1 = (mat >= 90) ? 'A' : ((mat >= 70) ? 'B' : 'C') ;
	     char eng1 = (eng >= 90) ? 'A' : ((eng >= 70) ? 'B' : 'C') ;
	     
	     System.out.println("국어 :" + kor1 + "점");
	     System.out.println("수학 :" + mat1 + "점");
	     System.out.println("영어 :" + eng1 + "점");
	     System.out.println("총점 : " + total);
	     System.out.println("퓽균 : " + avg);
	     

	}

}
