import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2.lists2();	//�޸𸮿��� �ε�
		
		Member2 mb2 = new Member2();	//static�� ���� �Լ��̹Ƿ� ��ü �� �ν��Ͻ��� ���� ,static ������ �����ؾ� ��
		mb2.lists();	//�ν��Ͻ�(�޸�)�� �ִ� �޼ҵ带 �ε�
		
		Member2.list3("������", 123456);
		
		/*
		 * ���빮�� for_in��� �Ϲ� �޼ҵ�(�޸�)�� �ִ�.
		 * ���α׷� ���� �� ������ ���� ����
		 * "����Ͻ� ������ ���ڸ� �ϳ� �Է����ּ���."
		 * [���] - �ش� �޼ҵ忡�� ����� ���
		 * ���� ����ڰ� 3���� �Է� ��
		 * 3*1=3 ... 3*9=27 ��µǾ�� ��. (for������ ����)
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("����Ͻ� ������ ���ڸ� �ϳ� �Է����ּ���.");
		int ug = s.nextInt();
		Member2.for_in(ug);
		s.close();

	}

}

class Member2{
	
	public void lists() {	//�޸𸮿� ������ �Ҵ���� �޼ҵ� �Լ��� ����
		String a = "ȫ�浿";
		System.out.println(a);
	}
	public static void lists2() {	//�޸� �÷����� ����(static)
		String a = "�̼���";
		System.out.println(a);
	}
	//Member2�� �Ϲ��Լ�(�޸�), �̸� list3, �޼ҵ� �ȿ� 3���� �ʵ带 ����
	//���� user_name, ���� user_tel, ���� user_point
	public static void list3(String nm, int pw) {
		//�޼ҵ忡�� ���� �޴� ��(nm)�� �ٷ� ����� ��� (nm.equals("������"))
		
		int user_pw = pw;	//�޼ҵ忡 ��ü���� ÷���Ͽ� �ε� �� �޼ҵ� �ȿ� ������ �ʵ���� �̿��Ͽ� ���޹޴� ����
//		System.out.println(nm);
		if(nm.equals("������") && user_pw == 123456) {
			System.out.println("ȸ�� Ȯ���� �Ǿ����ϴ�.");
		}else {
			System.out.println("��ȸ���Դϴ�.");
		}
	}
	
	public static void for_in(int g) {
		int a;
		for(a=1; a<=9; a++) {
			System.out.println(g+"*"+a+"="+g*a);
		}
	}
}