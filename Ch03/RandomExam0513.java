package Ch03;

public class RandomExam0513 {

	public static void main(String[] args) {
		
		int kor = (int)(Math.random()*100) + 1 ;
		int mat = (int)(Math.random()*100) + 1 ;
		int eng = (int)(Math.random()*100) + 1 ;
		int sce = (int)(Math.random()*100) + 1 ;
		int pe = (int)(Math.random()*100) + 1 ;
		
		int total = kor + mat + eng + sce + pe ;
		double avg = (double)total / 5 ;
		
		System.out.println(" 총점 : " + total);
		System.out.println(" 퍙균 : " + avg);
		if (kor >= 90) {
			System.out.println("국어 : A등급 " + kor + "점");
		} else if (kor >= 80) {
			System.out.println("국어 : B등급 " + kor + "점");
		} else if (kor >= 70) {
			System.out.println("국어 : C등급 " + kor + "점");
		} else if (kor >= 60) {
			System.out.println("국어 : D등급 " + kor + "점");
		} else {
			System.out.println("국어 : F등급 " + kor + "점");
		} // ���� ���� ���� ��� ����
		
		if (mat >= 90) {
			System.out.println("수학 : A등급 " + mat + "점");
		} else if (mat >= 80) {
			System.out.println("수학 : B등급 " + mat + "점");
		} else if (mat >= 70) {
			System.out.println("수학 : C등급 " + mat + "점");
		} else if (mat >= 60) {
			System.out.println("수학 : D등급 " + mat + "점");
		} else {
			System.out.println("수학 : F등급 " + mat + "점");
		} // ����
		
		if (eng >= 90) {
			System.out.println("영어 : A등급 " + eng + "점");
		} else if (eng >= 80) {
			System.out.println("영어 : B등급 " + eng + "점");
		} else if (eng >= 70) {
			System.out.println("영어 : C등급 " + eng + "점");
		} else if (eng >= 60) {
			System.out.println("영어 : D등급 " + eng + "점");
		} else {
			System.out.println("영어 : F등급 " + eng + "점");
		} // ����
		
		if (sce >= 90) {
			System.out.println("과학 : A등급 " + sce + "점");
		} else if (sce >= 80) {
			System.out.println("과학 : B등급 " + sce + "점");
		} else if (sce >= 70) {
			System.out.println("과학 : C등급 " + sce + "점");
		} else if (sce >= 60) {
			System.out.println("과학 : D등급 " + sce + "점");
		} else {
			System.out.println("과학 : F등급 " + sce + "점");
		} // ����
		
		if (pe >= 90) {
			System.out.println("체육 : A등급 " + pe + "잠");
		} else if (pe >= 80) {
			System.out.println("체육 : B등급 " + pe + "점");
		} else if (pe >= 70) {
			System.out.println("체육 : C등급 " + pe + "점");
		} else if (pe >= 60) {
			System.out.println("체육 : D등급 " + pe + "점");
		} else {
			System.out.println("체육 : F등급 " + pe + "점");
		} // ü��
		
		
		

	}

}
