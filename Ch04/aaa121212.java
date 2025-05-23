package Ch04;

import java.util.Scanner;

public class aaa121212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a = 0 ;
		final int max = 5 ;
		String[] id = new String[max];
		
		Scanner inStr = new Scanner(System.in);
		Scanner inInt = new Scanner(System.in);
		System.out.println("");
		boolean run = true ;
		while (run) {
		System.out.print("(1~2)>>");
		int select = inInt.nextInt();
		switch(select) {
		case 1:
			System.out.print("(id)");
			for(int i = 0 ; i < id.length ; i++) {
				if(id[i] == null) {
					System.out.print(">>>");
					id[i] = inStr.next();
					break;
				}else {
					continue;
				}
			}
			break;
			
		case 2 :
			boolean run2 = true ;
			while(run2) {
			System.out.println("(login)>>>");
			String id2 = inStr.next();
			for(int i = 0 ; i < id.length ; i++) {
				if(id[i].equals(id2)) {
					System.out.println("s");
					run2 = false ;
					break;
				}else {
					System.out.println("ss");
				}
				
				
				
			}//for
			}//while(run2)
		}//switch(select)
	}//while (run)

}
}
