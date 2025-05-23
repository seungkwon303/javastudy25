package Ch05;

public class Car {

	//필드
	public String company ;
	public String model ;
	public String color ;
	final public int maxspeed = 300 ;
	
	
	public int speed ;
	public int rpm ;
	public int oil;
	
	
	//생성자
	public Car() {
		speed = 0;
		rpm = 50;
		oil = 100;
		
	}// 기본생성자
	
	public Car(String company, String model, String color) {
		this.company = company ;
		this.model = model;
		this.color = color ;	
	}
	
	//메서드
	public void start() {
		System.out.println("==시동이 걸렸습니다.==");
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재RPM : " + rpm);
		System.out.println("현재기름량 : " + oil);
	}
	
	public void carRead(String company, String model, String color) {
		System.out.println("=====차량 정보=====");
		System.out.println("제조 회사 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println(" ");
	}
	
	public void carUpdate() {
		System.out.println("우우우우우웅~~~~~~~");
		speed += 30;
		rpm += 10;
		oil -= 5;
		if(speed >= this.maxspeed) {
			speed = maxspeed;
			oil -= 5;
			System.out.println("현재속도 : " + speed);
			System.out.println("최고 속력을 초과할 수 없습니다!!!!!!!!!!");
			System.out.println("현재RPM : " + rpm);
			System.out.println("현재 주유량 : " + oil);
			System.out.println(" ");
		}else {
		System.out.println("현재속도 : " + speed);
		System.out.println("현재RPM : " + rpm);
		System.out.println("현재 주유량 : " + oil);
		System.out.println(" ");
		}
	}// carUpdate
	
	public void carUpdate2 () {
		System.out.println("브레이크를 밟습니다.");
		if(speed == 0) {
			System.out.println("차량이 정지상태입니다.");
			System.out.println(" ");
		}else {
			speed -= 10;
			rpm -= 10;
            oil -= 5;
            System.out.println("현재속도 : " + speed);
    		System.out.println("현재RPM : " + rpm);
    		System.out.println("현재 주유량 : " + oil);
    		System.out.println(" ");
		}
	}//carUpdate2
	
	public void carUpdate3 () {
		System.out.println("주유 중입니다.");
		speed = 0;
		rpm = 50;
		oil += 50;
		System.out.println("==================");
		System.out.println("주유가 완료되었습니다.");
		System.out.println("현재 주유량 : " + oil);
	}
	
	
}
