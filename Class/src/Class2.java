
public class Class2 {
	//Class3�� ���� �Ұ�..
	//package�� ������� ���� (default��)
	public static void main(String[] args) {
		//������ Ŭ���� ���� �� �Լ��� �̿��Ͽ� ���� ���޹ޱ�
		
		//���� �⺻�� �Ǵ� �Լ� ��, static void ��� ��
		inject.oksign(); 	//new ��ü �ȸ���� �ε� ����
		inject.test();
		
//		inject a = new inject();
//		a.oksign("ȫ�浿"); �� ���� �ϱ� ��
		
		members.user("�̼���");	//��ȣ �ȿ� �ִ� ������(���ڰ�)
		members.cal(5, 10);	//members Ŭ���� �ȿ� cal��� �Ϲ��Լ��� 5�� 10 ���ڰ��� ����
	}

	
}

class inject{
	//public static void : ���� �⺻�� �Ǵ� �Ϲ� �Լ��� ���� (�⺻�Լ�)
	public static void oksign() {
		String user = "ȫ�浿";
		System.out.println(user);
	}
	public static void test() {
		int aa = 1;
		int bb = 3;
		int cc = aa+bb;
		System.out.println(cc);
	}
}

class members{
	public static void user(String names){
		String msg = names + "�� ȯ���մϴ�.";
		System.out.println(msg);
	}
	
	public static void cal(int a, int b) {	//(�ڷ��� �̸�, �ڷ��� �̸�) : ���ڰ� 2���� ����
		int c = a * b;
		System.out.println(c);
	}
}

