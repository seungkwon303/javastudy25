package Ch05;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Car myCar = new Car();
		boolean run = true;
		boolean race = true;
		// int maxspeed = 300;
		System.out.println("===차량 정보 생성===");

		System.out.print("제조 회사 : ");
		myCar.company = in.next();

		System.out.print("모델 : ");
		myCar.model = in.next();

		System.out.print("색상 : ");
		myCar.color = in.next();

		while (run) {
			System.out.println("1. 차량 정보보기");
			System.out.println("2. 시동걸기");
			System.out.println("9. 종료");
			System.out.print(">>>");
			String select = in.next();
			switch (select) {
			case "1":
				Car myCar1 = new Car();
				myCar1.carRead(myCar.company, myCar.model, myCar.color);
				break;

			case "2":
				myCar.start();
				race = true ;
				while (race) {
					System.out.println("1. 가속");
					System.out.println("2. 감속");
					System.out.println("3. 주유");
					System.out.println("9. 종료");
					System.out.print(">>>");
					String subSelect = in.next();
					switch (subSelect) {
					case "1":
						myCar.carUpdate();
						if (myCar.oil <= 0) {
							System.out.println("============기름이 없어요============");
							System.out.println("===========시동이 꺼집니다.===========");
							race = false;
						}
						break;

					case "2":
						myCar.carUpdate2();
						if (myCar.oil <= 0) {
							System.out.println("============기름이 없어요============");
							System.out.println("===========시동이 꺼집니다.===========");
							race = false;
						}
						break;

					case "3":
						myCar.carUpdate3();
						break;

					case "9":
						System.out.println("===종료===");
						race = false;
						break;

					default:
						System.out.println("다시 입력해주세요.");
						break;
					}// switch (subSelect)
				} // while (race)
				break;

			case "9":
				System.out.println("==종료==");
				run = false;
				break;

			default:
				System.out.println("다시 입력해주세요.");

			}// switch (select)

		} // while (run)
	}// 메인 메서드
}// clasee
