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
		
		System.out.println( " 총점 " + total);
		System.out.println( " 평균 " + avg );
		
	    int a = 20 ;
	    int a1 = 0 ;
	    if(a>5) {
	    	a1 = a * 1234 ;
	    }
	    
	    double a2 = (a + a1) / 100  ;
	    System.out.println(" a의 값 " + a);
	    System.out.println("a1의 값" + a1);
	    System.out.println("a2의 값" + a2);
	
		
	}
}
