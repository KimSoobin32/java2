import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		
		int num = 3;
		datalist da = new datalist();
		da.array_data(num);
		
		
		//String pay = "�ſ�ī��";
		String pay = "������ü";
		if(pay.equals("�ſ�ī��")) {
			da.pay1();	//�ش� ���ǿ� �´� �޼ҵ带 ȣ��
		}else {
			da.pay2(pay);	//�޼ҵ忡 ��ü���� �¿��� ���� (������ ��ü�� ������ ���Ѵ� ����)
		}
		
		/*
		 * ���빮�� �ش� �ε��� class���� agrees��� �̸��� ������ �ִ�.
		 * main�޼ҵ忡�� ����ڰ� "������", "���Ǿ���"�� �Է�
		 * ���������� �ԷµǾ��� ��� "ȸ�������� ����˴ϴ�."��� �޽����� ����ϰ�
		 * ���Ǿ����� �Է� �� "���Ǹ� �ϼž� ����˴ϴ�."��� ���
		 * ��, agreesŬ���� �ȿ� void �޼ҵ� �Ѱ� �Ǵ� �ΰ��� �����Ͽ� �ڵ带 ����
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("����� �����Ͻðڽ��ϱ�?");
		String a = s.next();
		agrees ag = new agrees();
		ag.agree(a);
		s.close();
	}

}

class datalist{
	/*
	 * static�޼ҵ带 Ȱ���ϴ� ���� : ���� package���� �ش� �޼ҵ带 ���� ����ؾ��ϴ� �κп����� static�� �̿��Ῡ ���
	 * static(���� �޼ҵ�) : �������̵��� ����� �� ����
	 * void�� ���(���� �޼ҵ�) : �������̵��� ����� �� ����
	 * �������̵� ����
	 * class a{
	 * 	void �޼ҵ�
	 * }
	 * class b extend a{
	 * 	void �޼ҵ�
	 * }
	 */
	//static ������ ���� �޸� ��� ���� -> �ӵ� ������
	public void array_data(int a) {	//static���� �޼ҵ�
		int w = 1;
		while(w<10) {
			System.out.println(a*w);
			w++;
		}
	}
	
	public void pay1() {
		System.out.println("�ſ�ī��� ���� �����մϴ�.");
	}
	public void pay2(String pm) {
		System.out.println(pm+"(��)�� ���� �����մϴ�.");
	}

}

class agrees{
	public void agree(String a) {
		String msg;
		if(a.equals("������")) {
			msg = "ȸ�������� ����˴ϴ�.";
		} else if(a.equals("���Ǿ���")) {	//!a.equals("������")
			msg = "���Ǹ� �ϼž� ����˴ϴ�.";
		} else {
			msg = "������/���Ǿ��Ը� �Է°���";
		}
		System.out.println(msg);
	}
}
