package Ch02;

public class Exam2505082 {

	public static void main(String[] args) {
		// ��� 60�� �̻��̸� �հ� 
		
		int a1 = 45 ;
		int a2 = 84 ;
		int a3 = 49 ;
		int total = a1 + a2 + a3 ;
		double avg = (double)total / 3 ;
		String result = (avg >= 60) ? "합격" :  ((avg >= 50) ? "보류" : "불합격");
		System.out.println( "평균 " + (int)avg + "점으로 " + result + "입니다." );
		
		
		/*
		 * System.out.println("�����ٶ�"); System.out.println("���ٻ�");
		 * System.out.print("�����ٶ�"); System.out.println("���ٻ�");
		 */
		

	}

}
