package Ch02;

public class Exam {

	public static void main(String[] args) {
		
		int kor, eng, mat, total ;
		double avg ;
		
		kor = 85 ;
		eng = 72 ;
		mat = 66 ;
	    total = kor + eng + mat ;
		avg = total / 3 ;
		
		System.out.println( " ���� " + total);
		System.out.println( " ��� " + avg );
		
	    int a = 20 ;
	    int a1 = 0 ;
	    if(a>5) {
	    	a1 = a * 1234 ;
	    }
	    
	    double a2 = (a + a1) / 100  ;
	    System.out.println(" a�� �� " + a);
	    System.out.println("a1�� ��" + a1);
	    System.out.println("a2�� ��" + a2);
	
		
	}
}
