package Ch02;

public class Exammmm {

	public static void main(String[] args) {
		
		
		int value = 17 ;
		if ( (value % 2 == 0) || (value % 3 == 0) ) { // +
			System.out.println("2 or 3 의 배수입니다."); 
		}
		if ( (value % 2 == 0) && (value % 3 == 0) ) { // *
			System.out.println(" 2 와 3 의 배수입니다.");
		}	
		if ( !(value % 2 == 0) && !(value % 3 == 0) ) {
			System.out.println(" XXXXXXXXXXX");
			
		}	
		
		

	}

}
