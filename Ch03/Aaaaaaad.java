package Ch03;

import java.util.Scanner;

public class Aaaaaaad {

	public static void main(String[] args) {
		// 엽습장
		
		Scanner in = new Scanner(System.in);
		
		int speed = 0 ;
		int max = 240;
		int min = 0 ;
		int speed2 = 50;
		int plus = (int)(Math.random()*50) + 1 ;
	
		int hits = 0;
		boolean run = true ;
		
		while (run) {
			System.out.println("1. 가속");
			System.out.println("2. 감속");
			System.out.println("4. 종료");
			System.out.print(">>>");
			int select = in.nextInt();
			switch(select) {
			case 1 :
				speed += 30 ;
				speed2 += plus ; // 이걸 랜덤으로 바꾸고싶은데
				if (speed >= max) {
					speed = max ;
				}
				if (speed2 >= max) {
					speed2 = max ;
				}
				hits ++ ;
				
				System.out.println("현재속력은" + speed + "km/h 입니다.");
				System.out.println(hits + "번");
				
				if (speed < speed2) {
					System.out.println("아직 멀었어요");
				}else if (speed > speed2) {
					System.out.println(" 너무 빨리요");
				}else {
					System.out.println(" 성공 ");
					run = false ;
					
					if (hits == 5 ) {
						System.out.println("실패");
						run = false;
					}
					
				}
				break;
				
			case 2 :
				speed -= 10 ;
				speed2 -= plus ;
				if (speed >= max) {
					speed = max ;
				}
				if (speed2 >= max) {
					speed2 = max ;
				}
				hits ++ ;
				
				System.out.println("현재속력은" + speed + "km/h 입니다.");
				System.out.println(hits + "번");
				
				if (speed < speed2) {
					System.out.println("아직 멀었어요");
				}else if (speed > speed2) {
					System.out.println(" 너무 빨리요");
				}else {
					System.out.println(" 성공 ");
					run = false;
				}
				
				if (hits == 5 ) {
					System.out.println("실패");
					run = false;
				}
				break;
				
			case 3 :
				System.out.println("종료");
			    run = false ;
			    break;
			    
			    default :
			    	System.out.println(" 오류 ");
			
			} // switch(select)
		} //while (run)

		
		
		


	} // main

} // class
