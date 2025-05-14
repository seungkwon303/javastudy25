package Ch03;

import java.util.Scanner;

public class Exam2505122 {

	public static void main(String[] args) {
		
		int num = (int) (Math.random()*6 +1); 
		int num2 = (int) (Math.random()*6 +1); 
		int num3 = (int) (Math.random()*6 +1); 
		
		System.out.println("1 : " + num); 
		System.out.println("2 : " + num2); 
		System.out.println("3 : " + num3); 
        if (num == num2 && num2 == num3) {
        	System.out.println("1등");
        }else if (num == num2 || num2 == num3 || num == num3) {
        	System.out.println("2등");
        }else {
        	System.out.println("꽝");
        }
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("1 ~ 45 사이의 수를 입력해주세요.");
        System.out.print("1 : ");
        int a = input.nextInt();
        System.out.print("2 : ");
        int a2 = input.nextInt();
        System.out.print("3 : ");
        int a3 = input.nextInt();
        System.out.print("4 : ");
        int a4 = input.nextInt();
        System.out.print("5 : ");
        int a5 = input.nextInt();
        System.out.print("6 : ");
        int a6 = input.nextInt();
        
        int b = (int)(Math.random()*45) +1 ;
        int b2 = (int)(Math.random()*45) +1 ;
        int b3 = (int)(Math.random()*45) +1 ;
        int b4 = (int)(Math.random()*45) +1 ;
        int b5 = (int)(Math.random()*45) +1 ;
        int b6 = (int)(Math.random()*45) +1 ;
        
        int x = 0 ;
        		
        if (a == b || a == b2 || a == b3 || a== b4 || a == b5 || a == b6) {
        	++x ;
        }
        if (a2 == b || a2 == b2 || a2 == b3 || a2 == b4 || a2 == b5 || a2 == b6) {
        	++x ;
        }
        if (a3 == b || a3 == b2 || a3 == b3 || a3 == b4 || a3 == b5 || a3 == b6) {
        	++x ;
        }
        if (a4 == b || a4 == b2 || a4 == b3 || a4 == b4 || a4== b5 || a4 == b6) {
        	++x ;
        }
        if (a5 == b || a5 == b2 || a5 == b3 || a5 == b4 || a5 == b5 || a5 == b6) {
        	++x ;
        }
        if (a6 == b || a6 == b2 || a6 == b3 || a6 == b4 || a6 == b5 || a6 == b6) {
        	++x ;
        }
        
        System.out.println("당첨번호 : " + b + " " + b2 + " " + b3 + " " + b4 + " " + b5 + " " + b6);
        if (x == 0) {
        	System.out.println(" 꽝 ");
        }
        if (x == 1) {
        	System.out.println(" 1 ");
        }
        if (x == 2) {
        	System.out.println(" 2 ");
        }
        if (x == 3) {
        	System.out.println(" 3 ");
        }
        if (x == 4) {
        	System.out.println(" 4");
        }
        if (x == 5) {
        	System.out.println(" 5 ");
        }
        if (x == 6) {
        	System.out.println(" 6 ");
        }
        
        
        
	}

}
