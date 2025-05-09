package Ch02;

public class Exam0507 {

	public static void main(String[] args) {
		
		char a = 65 ;
		System.out.println( "유니코드값: " + a);
		
		int intvalue = 100 ;
		double doublevalue = (double)intvalue ;
		System.out.println( "변환" + doublevalue);
		
		double kor = 81.2 ;
		double eng = 77.5 ;
		int mat = 60 ;
		int total = (int)kor + (int)eng + mat ;
		System.out.println(" 총점 " + total);
		
		double avg = (double)total / 3 ;
		System.out.println( " 평균 " + avg);
		
		int intValue = 10 ;
		double doubleValue = 15.9 ;
		double result = intValue + (int)doubleValue ;
		
		System.out.println("결과값" + result);
		
		int intValue2 = 50504 ;
		char charValue = (char) intValue2 ;
		System.out.println(charValue);
		
		char charValue2 = '안' ;
		int intValue3 = charValue2 ;
		System.out.println(intValue3);
	
		
		
		
	}

}
