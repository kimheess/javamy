package chap04;

import java.util.*;

class FlowEx6 {
	public static void main(String[] args) { 
		int month = 0;
		String result="";
		
		System.out.print("���� ���� �Է��ϼ���.>");

		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		scanner.close();
		

		switch(month) {
			case 3: 
			case 4: 
			case 5:
				result = "��";
				break;
			case 6: case 7: case 8:
				result = "����";
				break;
			case 9: case 10: case 11:
				result = "����";
				break;
			
			case 12:	case 1: case 2:
				result = "�ܿ�";
				break;
			default:
				System.out.println("�ùٸ� ���� �Է��ϼ���!");
		}
		
		System.out.printf("������ ������ %s�Դϴ�." , result);
	} // main�� ��
}