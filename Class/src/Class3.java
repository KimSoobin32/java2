
public class Class3 {
	//package�� ������� ���� (default��)
	public static void main(String[] args) {
		//�ڷ���(��������)	��ȯ
		//double -> int�� ��ȯ
		double a = 137.5;
		int b = (int)a;
		
		//int -> double
		int c = 35;
		double d = (double)c;	
		System.out.println(d);
		
		//int -> long���� �ٲ� ���� �ø��⵵ ����
		
		//String -> int
		String x = "35";
		String x2 = "156";
		//int z = (int)x; �� �ٸ� ����(����->����)�̹Ƿ� ��ȯ �Ұ�
		int z = Integer.parseInt(x); //parseInt : int���� ����ϴ� ������� ��� ,int�� �ٷ� �ٲ� - �ӵ� �� ���� ,��¥����(ex) a) ������ ����
		//int z = Integer.valueOf(x);	//valueOf Ŭ���� �޼ҵ�(�޼ҵ��Լ�) �ȿ� parseInt�� ���ԵǾ�����
		//int total = Integer.parseInt(x + x2);	//35156
		int total = Integer.parseInt(x) + Integer.parseInt(x2);	//�������� ���ڷ� ��ȥ�Ͽ� �������� ó��
		System.out.println(total);
		
		//String -> long : Long ��� �� Long.parseLong ��� ��(10�� ���� �ʰ�)
		String j = "923456789";
		String j2 = "9234567892";
		//int total2 = Integer.parseInt(j) + Integer.parseInt(j2);	//���� �ʰ�
		long total2 = Long.parseLong(j) + Long.parseLong(j2);
		double total3 = (double)total2;	//long -> double
		System.out.println(total2);
		System.out.println(total3);
		
		//����(char) -> ����(String) : �⺻ ���ĸ� ����..
		char p = 'M';
		String f = String.valueOf(p);	//���� -> ����(valueOf)�� ���	 , parse�� �� ��
		System.out.println(f);
	}

}
