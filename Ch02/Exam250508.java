package Ch02;

public class Exam250508 {

	public static void main(String[] args) {
		
		String n = "�����ٶ�" ;
	    String n1 = "�����ٶ�" ;
	    String n2 = new String ("�����ٶ�") ;
	    boolean result = n.equals(n2);
	    System.out.println(result);
	    System.out.println( n == n1);
	    System.out.println( n == n2 );
	    
	    //score�� 90�̻��̸� A���, 80�̻��̸� B��� �������� C������� �Ǵ��Ͻÿ�.
        
	    int s = 80 ;
	    char result2 = (s >= 90) ? 'A' : ((s >= 80) ? 'B' : 'C') ;
	    //                ����      ��    ����(          ��    ����  )
	    System.out.println( s + "���̸�" + result2 + "����Դϴ�.");
	    
	    //main()�޼ҵ忡 ���1���� 0.1������ 10�������� ����,
	    //���� 7����(0.7)�� �� 3����(0.3)�� result ������ �����ϰ� ���
	    
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
        System.out.println("��: " + exam);
        exam -= 1;
        System.out.println("��: " + exam);
        exam *= 224;
        System.out.println("��: " + exam);
        exam /= 5;
        System.out.println("��: " + exam);
        int re = exam % 2 ;
        char re2 = (re == 0) ? '¦' : 'Ȧ' ;
        System.out.println(re2);
        System.out.println("=======================");
        
        //main()�޼ҵ忡 ���1���� 0.1������ 10�������� ����,
	    //���� 7����(0.7)�� �� 3����(0.3)�� result ������ �����ϰ� ���
	    
        int apple = 1 ; // ��� �� ��
        double piece1 = 0.1 ; // �� ���� ����
        int mpiece = 7 ; // �E ����
        System.out.println(apple - piece1 * mpiece);
        
        double tp = 0.1 * 10 ;
        int ana = apple * 10;
        double re12 = ana - tp * 7 ;
        System.out.println(re12 / 10);
        
        
        
        
        
        
        
	    


	}

}
