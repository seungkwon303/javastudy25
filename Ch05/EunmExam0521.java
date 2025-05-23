package Ch05;

import java.util.Calendar;

public class EunmExam0521 {

	public static void main(String[] args) {
		
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1 ;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); // 4
		
		System.out.print(year + "년");
		System.out.print(" " + month + "월");
		System.out.println(" " + day + "일");
		switch(week) {
		case 1 :
			today = Week.SUNDAY; break;
		case 2 :
			today = Week.MONDAY; break;
		case 3 :
			today = Week.TUESDAY; break;
		case 4 :
			today = Week.WEDNESDAT; break;
		case 5 :
			today = Week.TURSDAY; break;
		case 6 :
			today = Week.FRIDAY; break;
		case 7 :
			today = Week.SATURDAY; break;
		}
		System.out.println("요일 : " + today);
		if(today==Week.SUNDAY) {
			System.out.println("오늘은 일요일입니다.");
		}else if(today==Week.MONDAY) {
			System.out.println("오늘은 월요일입니다.");
		}else if(today==Week.TUESDAY) {
			System.out.println("오늘은 화요일입니다.");
		}else if(today==Week.WEDNESDAT) {
			System.out.println("오늘은 수요일입니다.");
		}else if(today==Week.TUESDAY) {
			System.out.println("오늘은 목요일입니다.");
		}else if(today==Week.FRIDAY) {
			System.out.println("오늘은 금요일입니다.");
		}else if(today==Week.SATURDAY) {
			System.out.println("오늘은 토요일입니다.");
		}
		
		Week today1 = Week.SUNDAY;
		String name = today.name();
		System.out.println("객체의 이름은 :" + today1);
		
		int ordinal = today.ordinal() ;
		System.out.println("열거 순서는 :" + ordinal);
		
	    Week day1 = Week.MONDAY;
	    Week day2 = Week.WEDNESDAT;
	    int result1 = day1.compareTo(day2);
	    int result2 = day2.compareTo(day1);
	    System.out.println(result1);
	    System.out.println(result2);
	    
	    Week weekday = Week.valueOf("SATURDAY");
	    if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
	    	System.out.println("주말");
	    }else {
	    	System.out.println("평일");
	    }
	    
	    Week[] days = Week.values();
	    for(Week a : days) {
	    	System.out.print(a + " ");
	    }
		
	}

}
