package Ch02;

import java.util.Scanner;

public class LoginExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���̵� �Է��ϼ��� :");
		String id = input.nextLine();
		System.out.println("�Է��Ͻ� ID�� " + id + "�Դϴ�."); // �Է��� ���̵� Ȯ��
		
		System.out.print("��ȣ�� �Է��ϼ���.");
		String pw = input.nextLine(); // �н����� Ȯ��
		System.out.print("��ȣ�� �ѹ��� �Է����ּ��� :");
		String pww = input.nextLine(); // 2�� Ȯ��
		
		if(pww.equals(pw)) {
			System.out.println("Ȯ�εǾ����ϴ�.");
			System.out.println("========�α���========");
		}else {
			System.out.println("��ġ�����ʽ��ϴ�.");
		}// if�� ����
		
		String loginid = id ; // ������ �Է��� ���̵�
		String loginpw = pw = pww ; // ������ �Է��� ��й�ȣ
		
		
		System.out.println("�α����Ͻ� ���̵� �Է��ϼ��� :");
		String id2 = input.nextLine();
		
		System.out.println("�α����Ͻ� ��ȣ�� �Է��ϼ��� :");
		String pw2 = input.nextLine();
		System.out.println("====��ø� ��ٷ��ּ���====");
		
		if ( (loginid.equals(id2)) & loginpw.equals(pw2) ) {
			System.out.print("�α��εǾ����ϴ�!");
		}else {
			System.out.print("��ġ�����ʽ��ϴ�.");
		}//if�� ����

	} // main �޼ҵ� ����

} // class ����
