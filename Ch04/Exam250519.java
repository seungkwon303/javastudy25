package Ch04;

import java.util.Scanner;

public class Exam250519 {

	public static void main(String[] args) {
		// 자판기 프로그램

		// C R U D
		Scanner inputStr = new Scanner(System.in); // 문자용
		Scanner inputInt = new Scanner(System.in); // 정수용
		int a = 0;
		String[] meuns = new String[2]; // 메뉴
		int[] nums = new int[2];
		int[] prices = new int[2]; // 메뉴 가격
		int money = 0;

		boolean run = true;

		while (run) {
			System.out.println("===자판기===");
			System.out.println("1. 관리자모드");
			System.out.println("2. 사용자모드");
			System.out.println("9. 종료");
			System.out.print(">>>");
			int select = inputInt.nextInt();
			switch (select) {
			case 1:
				boolean run2 = true;
				while (run2) {
					System.out.println("==관리자모드=="); // 관리자 로그인
					System.out.println("1. 메뉴생성");
					System.out.println("2. 메뉴보기");
					System.out.println("3. 메뉴수정");
					System.out.println("4. 메뉴삭제");
					System.out.println("9. 종료");
					System.out.print(">>>");
					int subselect = inputInt.nextInt();
					switch (subselect) {
					case 1:
						System.out.println("==메뉴생성=="); // creat
						newMeun(meuns, prices, nums);
						System.out.println("완료");
						break;

					case 2:
						System.out.println("==메뉴보기=="); // read
						meunRead(meuns, prices, nums);
						break;

					case 3:
						System.out.println("==메뉴수정=="); // update
						meunUpdatr(meuns, prices, nums);
						break;

					case 4:
						System.out.println("==메뉴삭제=="); // delete
						meunDelete(meuns, prices, nums);
						break;

					case 9:
						System.out.println("==종료==");
						run2 = false;
						break;

					default:
						System.out.println("다시입력해주세요.");
					}// while (run2) (관리자모드 반복문)

				} // switch(subselect)문 종료

				break;

			case 2:
				boolean run3 = true;
				while (run3) {
					System.out.println("==사용자모드=="); // c r u d 회원,비회원
					System.out.println("1. 주문하기");
					System.out.println("9. 종료");
					System.out.print(">>>");
					int subselect = inputInt.nextInt();
					switch (subselect) {
					case 1:
						System.out.println("==주문==");
						order(meuns, prices, money, nums);
						break;

					case 9:
						System.out.println("==종료==");
						run3 = false;
						break;

					default:
						System.out.println("====");
					}// switch(subselect)
				} // while (run3)
				break;

			case 9:
				System.out.println("==종료==");
				run = false;
				break;

			default:
				System.out.println("다시입력해주세요.");

			}// switch(select) 종료

		} // while(run) 종료 (주메뉴)

	} // main 종료

	private static void order(String[] meuns, int[] prices, int money, int[] nums) {
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		for (int i = 0, j = 1; i < meuns.length && j <= meuns.length; i++, j++) {
			if (nums[i] == 0) {
				System.out.println(j + " : " + meuns[i]);
				System.out.println("====품절====");
				System.out.println(" ");
			} else if (nums[i] > 0) {
				System.out.println(j + " : " + meuns[i]);
				System.out.println("가격 : " + prices[i]);
				System.out.println("수량 : " + nums[i]);
				System.out.println(" ");
			}
		} // for 문
		
		
		System.out.println("구매하실 물품의 번호를 입력하세요");
		System.out.print(">>>");
		int select = inputInt.nextInt();
			
		
		boolean run = true;
		while (run) {
			switch (select) {
			case 1:
				System.out.println(meuns[select - 1] + "을 선택하셨습니다.");
				System.out.println("결제금액을 투입해주세요.");
				System.out.println("1. 1000원");
				System.out.println("2. 5000원");
				System.out.println("3. 10000원");
				System.out.print(">>>");
				int num = inputInt.nextInt();
				switch (num) {
				case 1:
					System.out.println("투입 하신 금액은 1000원입니다.");
					money += 1000;
					if (money == prices[select - 1]) {
						System.out.println(" 결제가 완료 되었습니다.");
						nums[select - 1] -= 1;
						run = false;

					} else if (money < prices[select - 1]) {
						System.out.println(prices[select - 1] - money + "원 만큼 금액이 부족합니다.");
					} else {
						System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
						System.out.println(" 결제가 완료 되었습니다.");
						nums[select - 1] -= 1;
						run = false;

					}
					break;
				case 2:
					System.out.println("투입 하신 금액은 5000원입니다.");
					money += 5000;
					if (money == prices[select - 1]) {
						System.out.println(" 결제가 완료 되었습니다.");
						nums[select - 1] -= 1;
						run = false;
					} else if (money < prices[select - 1]) {
						System.out.println(prices[select - 1] - money + "원 만큼 금액이 부족합니다.");
					} else {
						System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
						System.out.println(" 결제가 완료 되었습니다.");
						nums[select - 1] -= 1;
						run = false;
					}

					break;
				case 3:
					System.out.println("투입 하신 금액은 10000원입니다.");
					money += 10000;
					if (money == prices[select - 1]) {
						System.out.println(" 결제가 완료 되었습니다.");
						nums[select - 1] -= 1;
						run = false;
					} else if (money < prices[select - 1]) {
						System.out.println(prices[select - 1] - money + "원 만큼 금액이 부족합니다.");
					} else {
						System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
						System.out.println(" 결제가 완료 되었습니다.");
						nums[select - 1] -= 1;
						run = false;
					}
					break;

				} // switch(num)

			}// switch(select)
		} // while (run)
		
		
		

	}// 구매

	private static void meunDelete(String[] meuns, int[] prices, int[] nums) {
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		boolean run = true;
		System.out.println("삭제할 메뉴를 선택해주세요.");
		for (int i = 0, j = 1; i < meuns.length && j <= meuns.length; i++, j++) {
			System.out.println(j + " : " + meuns[i]);
		}
		while (run) {
			System.out.print(">>>");
			int subselect = inputInt.nextInt();
			switch (subselect) {
			case 1:
				System.out.println("==" + meuns[subselect - 1] + "==");
				System.out.println("==" + prices[subselect - 1] + "원==");
				System.out.println(meuns[subselect - 1] + "을 삭제 하시겠습니까?");
				System.out.print("삭제(yes를 입력하세요.) : ");
				String answer = inputStr.next();
				String delete2 = "yes";

				if (answer.equalsIgnoreCase(delete2)) {
					meuns[subselect - 1] = null;
					prices[subselect - 1] = 0;
					nums[subselect - 1] = 0;

					run = false;
				} else {
					System.out.println("다시 입력해주세요");
				}
				break;

			case 2:
				System.out.println("==" + meuns[subselect - 1] + "==");
				System.out.println("==" + prices[subselect - 1] + "원==");
				System.out.println(meuns[subselect - 1] + "을 삭제 하시겠습니까?");
				System.out.print("삭제(yes를 입력하세요.) : ");
				String answer2 = inputStr.next();
				String delete3 = "yes";

				if (answer2.equalsIgnoreCase(delete3)) {
					meuns[subselect - 1] = null;
					prices[subselect - 1] = 0;
					nums[subselect - 1] = 0;
					run = false;
				} else {
					System.out.println("다시 입력해주세요");
				}
				run = false;
				break;

			default:
				System.out.println("=====");
			}
		}
	}// 메뉴 삭제

	private static void meunUpdatr(String[] meuns, int[] prices, int[] nums) {
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		boolean run = true;
		System.out.println("수정할 메뉴를 선택해주세요.");
		for (int i = 0, j = 1; i < meuns.length && j <= meuns.length; i++, j++) {
			System.out.println(j + " : " + meuns[i]);
		}
		while (run) {
			System.out.print(">>>");
			int subselect = inputInt.nextInt();
			switch (subselect) {
			case 1:
				System.out.println("==" + meuns[subselect - 1] + "==");
				System.out.println("==" + prices[subselect - 1] + "원==");
				System.out.println("==" + nums[subselect - 1] + "원==");
				System.out.println("수정 이름");
				System.out.print(">>>");
				meuns[subselect - 1] = inputStr.next();
				System.out.println("수정 가격");
				System.out.print(">>>");
				prices[subselect - 1] = inputInt.nextInt();
				System.out.println("수정 재고");
				System.out.print(">>>");
				nums[subselect - 1] = inputInt.nextInt();
				run = false;
				break;

			case 2:
				System.out.println("==" + meuns[subselect - 1] + "==");
				System.out.println("==" + prices[subselect - 1] + "원==");
				System.out.println("수정 이름");
				System.out.print(">>>");
				meuns[subselect - 1] = inputStr.next();
				System.out.println("수정 가격");
				System.out.print(">>>");
				prices[subselect - 1] = inputInt.nextInt();
				System.out.println("수정 재고");
				System.out.print(">>>");
				nums[subselect - 1] = inputInt.nextInt();
				run = false;
				break;

			default:
				System.out.println("=====");
			}
		}
	}// 메뉴 수정문

	private static void meunRead(String[] meuns, int[] prices, int[] nums) {
		for (int i = 0; i < meuns.length; i++) {
			System.out.println("이름 : " + meuns[i]);
			System.out.println("가격 : " + prices[i] + "원");
			System.out.println("수량 : " + nums[i] + "개");
		} // for문 종료
	}// 메뉴 보기문

	private static void newMeun(String[] meuns, int[] prices, int[] nums) {
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		System.out.println("==메뉴==");
		for (int i = 0; i < meuns.length; i++) {
			System.out.println("메뉴 이름");
			System.out.print(">>>");
			meuns[i] = inputStr.next();
			System.out.println("메뉴 가격");
			System.out.print(">>>");
			prices[i] = inputInt.nextInt();
			System.out.println("재고");
			System.out.print(">>>");
			nums[i] = inputInt.nextInt();
			System.out.println("입력하신 메뉴는 " + meuns[i]);
			System.out.println(prices[i] + "원 입니다");
			System.out.println(nums[i] + "개가 등록 되었습니다.");
		} // for문 종료
	}// 메뉴 생성문

} // class 종료
