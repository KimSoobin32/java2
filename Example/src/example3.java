public class example3 {

	public static void main(String[] args) {
		/*
		 * �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * product  : "����","����","���","��","����","Ű��","�ٳ���","����"
		 * moneys : 35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900
		 * ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��Ҵ�.
		 * ��, ���� ����� �ٳ����� �����ϰ� �� ���� �ݾ� ���, ��� : 75600
		 */
		String product[] = {"����","����","���","��","����","Ű��","�ٳ���","����"};
		int moneys[] = {35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900};
		example3 ex3 = new example3();
		ex3.basket2(product, moneys);
		ex3 = null;
	}
	
	public void basket2(String p[], int m[]) {
		//System.out.println("test");
		int pl = p.length;
		int d = 0;
		int h = 0;
		do {
			if(!p[d].equals("���") && !p[d].equals("�ٳ���")) {
				 h = h + m[d];
			}
			d++;
		}while(d<pl);
		System.out.println(h);
	}

}
