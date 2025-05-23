package Ch03;

import java.util.Scanner;

public class Aaaaaa {

	public static void main(String[] args) {
		boolean run = false ;
		boolean run2 = false ;
		Scanner in = new Scanner(System.in);
		System.out.println("==============");
		System.out.print(">>>");
		String mon = in.next();
		run = monster(mon,run);
		System.out.println(mon );
		
		/*
		 * System.out.print("동물 : "); 
		 * String ani = in.next(); 
		 * run2 = animal(ani,run2);
		 */
		
		

	}

	static boolean monster(String mon, boolean run) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print(">>>");
		String cc = inp.next();
		if (cc.equals(mon)) {
			System.out.println("!");
			run = true;
		}else {
			System.out.println("ㅠㅠ");
			run = false ;
		}
		
		
		return run;
	}

}
