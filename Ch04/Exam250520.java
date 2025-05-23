package Ch04;

import java.util.Scanner;

public class Exam250520 {

	public static void main(String[] args) {
		// 자판기

		Scanner inInt = new Scanner(System.in);
		Scanner inStr = new Scanner(System.in);

		// 4314
		String admitId = "tmdrnjs"; // 관리자용 아이디
		String admitPw = "1234";

		boolean run = true;
		boolean admitrun = true;
		boolean run2 = true;
		String[] id = new String[5];
		String[] pw = new String[5];
		String[] meuns = new String[3];
		int[] prices = new int[3];
		int[] nums = new int[3];
		int money = 0;
		int total = 0;

		while (run) {
			System.out.println("======자판기======");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("9. 종료");
			System.out.print(">>>");
			int select = inInt.nextInt();
			switch (select) {
			case 1:
				loginOk(id, pw);
				System.out.println("======환영합니다.======");
				older(meuns, prices, nums, money, total);
				break;

			case 2:
				newLogin(id, pw);
				break;

			case 9:
				System.out.println("======종료======");
				run = false;
				break;

			case 4314:
				admitLogin(admitId, admitPw);
				System.out.println("======환영합니다.======");
				System.out.println("======관리자모드======");
				admitrun = true;
				while (admitrun) {
					System.out.println("1. 매뉴 등록");
					System.out.println("2. 매뉴 보기");
					System.out.println("3. 매뉴 수정");
					System.out.println("4. 매뉴 삭제");
					System.out.println("5. 총 매출 보기");
					System.out.println("9. 관리자모드 종료");
					System.out.print(">>>");
					int adselect = inInt.nextInt();
					switch (adselect) {
					case 1:
						meunCreat(meuns, prices, nums);
						break;

					case 2:
						meunRead(meuns, prices, nums);
						break;

					case 3:
						meunUpdate(meuns, prices, nums);
						break;

					case 4:
						meunDelete(meuns, prices, nums);
						break;

					case 5:
						moneyAdd(total);

					case 9:
						admitrun = false;
						break;

					default:
						System.out.println("다시입력해주세요.");
					}
				}
				break;

			default:
				System.out.println("다시 입력해주세요.");
				break;
			}// switch(select) 로그인 or 회원가입
		} // while(run) 시작화면 반복문

	}// main 종료

	private static void moneyAdd(int total) {
		
		System.out.println(" 총 매출 : " + total + "원");

	}

	private static void older(String[] meuns, int[] prices, int[] nums, int money, int total) {
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		boolean run = true;
		boolean run2 = true;
		int a = 1;
		System.out.println("주문 가능한 물품 목록입니다.");
		for (int i = 0; i < meuns.length; i++) {
			System.out.println(a + " : " + meuns[i]);
			System.out.println("가격 : " + prices[i]);
			System.out.println("수량 : " + nums[i]);
			System.out.println(" ");
			a++;
		} // for
		while (run) {
			System.out.println("주문할 물품의 번호를 입력해주세요. ");
			System.out.println("9 : 종료");
			System.out.print(">>>");
			int select = inputInt.nextInt();
			switch (select) {
			case 1:
				System.out.println("상품명 : " + meuns[select - 1]);
				System.out.println("가격 : " + prices[select - 1]);
				System.out.println("수량 : " + nums[select - 1]);

				while (run2) {
					System.out.println("금액을 투입해주세요.");
					System.out.println("1. 1000원");
					System.out.println("2. 5000원");
					System.out.println("3. 10000원");
					System.out.println("9. 결제취소");
					System.out.print(">>>");
					int subselct = inputInt.nextInt();
					switch (subselct) {
					case 1:
						money += 1000;
						if (prices[select - 1] == money) {
							System.out.println("결제가 완료 되었습니다.");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						} else if (prices[select - 1] > money) {
							System.out.println("결제 금액이 " + (prices[select - 1] - money) + "원 부족합니다.");
						} else {
							System.out.println("결제가 완료 되었습니다.");
							System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						}
						break;

					case 2:
						money += 5000;
						if (prices[select - 1] == money) {
							System.out.println("결제가 완료 되었습니다.");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						} else if (prices[select - 1] > money) {
							System.out.println("결제 금액이 " + (prices[select - 1] - money) + "원 부족합니다.");
						} else {
							System.out.println("결제가 완료 되었습니다.");
							System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						}
						break;

					case 3:
						money += 10000;
						if (prices[select - 1] == money) {
							System.out.println("결제가 완료 되었습니다.");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						} else if (prices[select - 1] > money) {
							System.out.println("결제 금액이 " + (prices[select - 1] - money) + "원 부족합니다.");
						} else {
							System.out.println("결제가 완료 되었습니다.");
							System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						}
						break;

					case 9:
						System.out.println("!!!결제 취소!!!");
						run2 = false;
						break;

					default:
						System.out.println("다시입력해주세요.");
					}// switch(subselct)

				} // while (run2)
				break;

			case 2:

				System.out.println("상품명 : " + meuns[select - 1]);
				System.out.println("가격 : " + prices[select - 1]);
				System.out.println("수량 : " + nums[select - 1]);
				while (run2) {
					System.out.println("금액을 투입해주세요.");
					System.out.println("1. 1000원");
					System.out.println("2. 5000원");
					System.out.println("3. 10000원");
					System.out.println("9. 결제취소");
					System.out.print(">>>");
					int subselct = inputInt.nextInt();
					switch (subselct) {
					case 1:
						money += 1000;
						if (prices[select - 1] == money) {
							System.out.println("결제가 완료 되었습니다.");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						} else if (prices[select - 1] > money) {
							System.out.println("결제 금액이 " + (prices[select - 1] - money) + "원 부족합니다.");
						} else {
							System.out.println("결제가 완료 되었습니다.");
							System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						}
						break;

					case 2:
						money += 5000;
						if (prices[select - 1] == money) {
							System.out.println("결제가 완료 되었습니다.");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						} else if (prices[select - 1] > money) {
							System.out.println("결제 금액이 " + (prices[select - 1] - money) + "원 부족합니다.");
						} else {
							System.out.println("결제가 완료 되었습니다.");
							System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						}
						break;

					case 3:
						money += 10000;
						if (prices[select - 1] == money) {
							System.out.println("결제가 완료 되었습니다.");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						} else if (prices[select - 1] > money) {
							System.out.println("결제 금액이 " + (prices[select - 1] - money) + "원 부족합니다.");
						} else {
							System.out.println("결제가 완료 되었습니다.");
							System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						}
						break;

					case 9:
						System.out.println("!!!결제 취소!!!");
						run2 = false;
						break;

					default:
						System.out.println("다시입력해주세요.");
					}// switch(subselct)

				} // while (run2)
				break;

			case 3:
				System.out.println("상품명 : " + meuns[select - 1]);
				System.out.println("가격 : " + prices[select - 1]);
				System.out.println("수량 : " + nums[select - 1]);

				while (run2) {
					System.out.println("금액을 투입해주세요.");
					System.out.println("1. 1000원");
					System.out.println("2. 5000원");
					System.out.println("3. 10000원");
					System.out.println("9. 결제취소");
					System.out.print(">>>");
					int subselct = inputInt.nextInt();
					switch (subselct) {
					case 1:
						money += 1000;
						if (prices[select - 1] == money) {
							System.out.println("결제가 완료 되었습니다.");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						} else if (prices[select - 1] > money) {
							System.out.println("결제 금액이 " + (prices[select - 1] - money) + "원 부족합니다.");
						} else {
							System.out.println("결제가 완료 되었습니다.");
							System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						}
						break;

					case 2:
						money += 5000;
						if (prices[select - 1] == money) {
							System.out.println("결제가 완료 되었습니다.");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						} else if (prices[select - 1] > money) {
							System.out.println("결제 금액이 " + (prices[select - 1] - money) + "원 부족합니다.");
						} else {
							System.out.println("결제가 완료 되었습니다.");
							System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						}
						break;

					case 3:
						money += 10000;
						if (prices[select - 1] == money) {
							System.out.println("결제가 완료 되었습니다.");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						} else if (prices[select - 1] > money) {
							System.out.println("결제 금액이 " + (prices[select - 1] - money) + "원 부족합니다.");
						} else {
							System.out.println("결제가 완료 되었습니다.");
							System.out.println("거스름돈 : " + (money - prices[select - 1]) + "원");
							nums[select - 1] -= 1;
							run2 = false;
							run = false;
						}
						break;

					case 9:
						System.out.println("!!!결제 취소!!!");
						run2 = false;
						break;

					default:
						System.out.println("다시입력해주세요.");
					}// switch(subselct)

				} // while (run2)

				break;

			case 9:
				System.out.println("======결제취소=======");
				run = false;
				break;

			default:
				System.out.println("다시 입력해수세요.");
				break;

			}// switch(select)

		} // while(run)

	}

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

			case 3:
				System.out.println("==" + meuns[subselect - 1] + "==");
				System.out.println("==" + prices[subselect - 1] + "원==");
				System.out.println(meuns[subselect - 1] + "을 삭제 하시겠습니까?");
				System.out.print("삭제(yes를 입력하세요.) : ");
				String answer3 = inputStr.next();
				String delete4 = "yes";

				if (answer3.equalsIgnoreCase(delete4)) {
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
				System.out.println("다시 입력해주세요");
			}
		}

	}

	private static void meunUpdate(String[] meuns, int[] prices, int[] nums) {
		// 메뉴 수정문

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

			case 3:
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
				System.out.println("다시확인해주세요.");
			}
		}
	}

	private static void meunRead(String[] meuns, int[] prices, int[] nums) {
		// 메뉴 보기
		for (int i = 0; i < meuns.length; i++) {
			System.out.println("이름 : " + meuns[i]);
			System.out.println("가격 : " + prices[i] + "원");
			System.out.println("수량 : " + nums[i] + "개");
			System.out.println(" ");
		} // for문 종료
	}

	private static void meunCreat(String[] meuns, int[] prices, int[] nums) {
		// 메뉴 등록
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

	}

	private static void admitLogin(String admitId, String admitPw) {
		// 관리자모드
		Scanner inStr = new Scanner(System.in);
		Scanner inInt = new Scanner(System.in);

		System.out.println("===관리자 모드==");
		boolean run = true;
		while (run) {
			System.out.print("관리자용 ID : ");
			String admitId2 = inStr.next();
			System.out.print("관리자용 PW : ");
			String admitPw2 = inStr.next();
			if (admitId2.equals(admitId) && admitPw2.equals(admitPw)) {
				System.out.println("======진입중======");
				run = false;
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}

	}

	private static void newLogin(String[] id, String[] pw) {
		// 회원가입
		Scanner inStr = new Scanner(System.in);
		Scanner inInt = new Scanner(System.in);

		System.out.println("생성할 ID");
		for (int i = 0; i < id.length; i++) {
			if (id[i] == null) {
				System.out.print(">>>");
				id[i] = inStr.next();
				break;
			} else {
				continue;
			}
		}
		System.out.println("생성할 PW");
		for (int i = 0; i < pw.length; i++) {
			if (pw[i] == null) {
				System.out.print(">>>");
				pw[i] = inStr.next();
				break;
			} else {
				continue;
			}
		}
		System.out.println("======회원가입 완료======");

	}// 회원가입

	private static void loginOk(String[] id, String[] pw) {
		// 로그인
		Scanner inStr = new Scanner(System.in);
		Scanner inInt = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.print("ID : ");
			String loginId = inStr.next();
			System.out.print("PW : ");
			String loginpw = inStr.next();
			for (int i = 0; i < id.length; i++) {
				if (id[i].equals(loginId) && pw[i].equals(loginpw)) {
					System.out.println("======로그인 완료======");
					run = false;
					break;
				} else if (!id[i].equals(loginId) || !pw[i].equals(loginpw)) {
					System.out.println("다시 입력해주세요.");
				}
			} // for
		} // while (run)

	}// 로그인

}// class 종료
