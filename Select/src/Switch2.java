import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ����ڰ� ������ ���� ������ �޽��ϴ�.
		 * "1~5������ ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�."
		 * ��� ����
		 * 1 : 5% ��������
		 * 2 : 10% ��������
		 * 3~4 : �ù�� ����
		 * 5 : ���� ��ȸ��
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("1~5������ ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.");
		int n = s.nextInt();
		String msg = "";
		/* �ڹ� 8, 11 ...
		switch(n) {
		case 1:	//n�� String���� �޾Ҵٸ� "1"
			msg = "5% ��������";	//�ǹ����� ������ ����
		break;
		case 2:
			msg = "5% ��������";
		break;
		case 3:
		case 4:
			msg = "�ù�� ����";
		break;
		case 5:
			msg = "���� ��ȸ��";
		break;		
		}
		*/
		
		/* switch version �� ���� : �ڹ� 14 �̻�*/
		switch(n) {
		case 1 -> {
			msg = "5% ��������";
		}	//break ���� ���
		case 2 -> {
			msg = "10% ��������";
		}
		case 3,4 -> {
			msg = "�ù�� ����";
		}
		default -> {
			msg = "���� ��ȸ��";
		}
		
		}
		System.out.println(msg);
		s.close();

	}

}
