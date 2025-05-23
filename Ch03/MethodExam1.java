package Ch03;

import java.util.Scanner;

public class MethodExam1 {

	public static void main(String[] args) {

		int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0; // 변수 선언 
		boolean run = true, run2 = true; // while문 boolean

		String y1 = "연산기호"; // 정답 표시용

		Scanner sclnt = new Scanner(System.in); // 객체 생성

		while (run) { // 반복문
			if (x1 == 0) { // x1이 0 일때
				System.out.println("**정수 계산기**/n숫자를 입력해주세요(int 범위 내에서만\n>>)");
				x1 = sclnt.nextInt(); // x1 을 받음
			} // if (x1 == 0)문 종료

			System.out.println("부호를 선택해주세요\n1.+(더하기)\t2.-(빼기)\n3.(곱하기)\t4.(나누기)\n>>");
			// 부호 선택
			x2 = sclnt.nextInt(); // x2를 int 값으로 받음

			System.out.println("숫자를 입력해수제요(int 범위 내에서만)\n>>");
			x3 = sclnt.nextInt();

			run2 = true;

			switch (x2) { // x2 = int값으로 부호를 선택 

			case 1: // 1. 더하기
				x4 = plus(x1, x3); // main메서드 아래에 있음 , 산수 결과
				y1 = "+"; // 부호 표시
				break;

			case 2:
				x4 = minus(x1, x3);
				y1 = "-";
				break;

			case 3:
				x4 = times(x1, x3);
				y1 = "x";
				break;

			case 4:
				x4 = divide(x1, x3);
				y1 = "÷";
				break;
			} // switch(x2)문 종료

			System.out.println("계산결과 : " + x1 + y1 + x3 + " = " + x4); // 계산결과 나옴

			while (run2) { // 반복문

				if (x4 != 0) {
					System.out.println("1. 종료하기\n2.다시하기\n3.이어서계산하기\n>>>");
				} else {
					System.out.println("1. 종료하기\n2.다시하기\n>>>");
				} // if문 종료

				x5 = sclnt.nextInt(); // 종료 or 다시 or 이어서 를 받음

				switch (x5) {

				case 2: // 2. 다시하기

					x1 = 0; // 숫자

					x2 = 0; // 부호

					x3 = 0; // 숫자

					run2 = false;

					break;

				case 3:

					x1 = x4; // 이어서 계산을 해야하니까 x1 = x4로 올라가야함

					x2 = 0; // 부호 초기화

					x3 = 0; // 

					run2 = false;

					break;

				case 1:

					run = false; run2 = false;

					break;
					
					default:
						System.out.println("숫자를 잘못 입력하셨습니다.\n다시입력해주세요.\n");

				} // switch(x5)문 종료

			} // while(run2)문 종료

		} // while(run)문 종료

	} // main 메서드 종료

	static int plus(int x1, int x3) {
		int x4 = 0;
		x4 = x1 + x3;
		return x4;
	}// plus 종료

	static int minus(int x1, int x3) {
		int x4 = 0;
		x4 = x1 - x3;
		return x4;
	}// minus 종료

	static int times(int x1, int x3) {
		int x4 = 0;
		x4 = x1 * x3;
		return x4;
	}// times 종료

	static int divide(int x1, int x3) {
		int x4 = 0;
		x4 = x1 / x3;
		return x4;
	}// divide 종료

} // clasee 종료
