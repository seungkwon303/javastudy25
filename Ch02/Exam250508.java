package Ch02;

public class Exam250508 {

	public static void main(String[] args) {
		
		String n = "가나다라" ;
	    String n1 = "가나다라" ;
	    String n2 = new String ("가나다라") ;
	    boolean result = n.equals(n2);
	    System.out.println(result);
	    System.out.println( n == n1);
	    System.out.println( n == n2 );
	    
	    //score가 90이상이면 A등급, 80이상이면 B등급 나머지는 C등급으로 판단하시오.
        
	    int s = 80 ;
	    char result2 = (s >= 90) ? 'A' : ((s >= 80) ? 'B' : 'C') ;
	    //                조건      참    거짓(          참    거짓  )
	    System.out.println( s + "점이면" + result2 + "등급입니다.");
	    
	    //main()메소드에 사과1개를 0.1단위인 10조각으로 보고,
	    //그중 7조각(0.7)을 뺀 3조각(0.3)을 result 변수에 저장하고 출력
	    
	    int app = 1 ;
	    double piece = 0.1 ;
	    int piece2 = 7 ;
	    
	    System.out.println(app - piece*piece2);
	    
        int totalpiece = app * 10 ;
        int result3 = totalpiece - piece2 ;
        System.out.println(result3 / 10.0);
        System.out.println(result3 * 0.1);
        
        String sk1 = "abd" + 3 + 3.0 ;
        String sk2 = 3 + 3.0 + "acd" ;
        System.out.println(sk1);
        System.out.println(sk2);
        System.out.println("=======================");
        
        int exam = 0 ;
        exam += 5 ;
        System.out.println("값: " + exam);
        exam -= 1;
        System.out.println("값: " + exam);
        exam *= 224;
        System.out.println("값: " + exam);
        exam /= 5;
        System.out.println("값: " + exam);
        int re = exam % 2 ;
        char re2 = (re == 0) ? '짝' : '홀' ;
        System.out.println(re2);
        System.out.println("=======================");
        
        //main()메소드에 사과1개를 0.1단위인 10조각으로 보고,
	    //그중 7조각(0.7)을 뺀 3조각(0.3)을 result 변수에 저장하고 출력
	    
        int apple = 1 ; // 사과 한 개
        double piece1 = 0.1 ; // 한 조가 단위
        int mpiece = 7 ; // 뺼 조각
        System.out.println(apple - piece1 * mpiece);
        
        double tp = 0.1 * 10 ;
        int ana = apple * 10;
        double re12 = ana - tp * 7 ;
        System.out.println(re12 / 10);
        
        
        
        
        
        
        
	    


	}

}
