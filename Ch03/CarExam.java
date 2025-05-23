package Ch03;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean run = true ; 
		
		int speed = 0 ; // 차량 속도
		final int max = 300; // 최대속도
		final int min = 0 ; // 최소속도
		
		while (run) {
			
			System.out.println("1. 가속");
			System.out.println("2. 감속");
			System.out.println("3. 종료");
			int select = input.nextInt();
			
			switch (select) {
			case 1 :
				speed += 30;
				if (speed >= max) {
					speed = max; 
				}
				System.out.println("현재 속력은" + speed + "km/h 입니다.");
				break ;
				
			case 2 :
				speed -= 10;
				if(speed <= min) {
					speed = min;
				}
				System.out.println("현재 속력은" + speed + "km/h 입니다.");
				break;
				
			case 3 :
				System.out.println("시동을 끕니다.");
				run = false ;
				break;
				
				default :
					System.out.println("오류");
			}
			
		}
		
			} //main

} // class
