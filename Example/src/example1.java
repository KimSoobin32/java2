
public class example1 {

	public static void main(String[] args) {
		/*
		 * �迭 + �⺻(Ŭ����)�޼ҵ幮�� (example1 class�ȿ� �޼ҵ�)
		 * 1���迭�� ������ ���� ���� �ִ�.
		 * �迭 ����Ʈ�� 22,33,44,55,66,77,88,99 �̸�
		 * �ش� ��ü ���� ��� ���� ���հ谪�� ������ �޼ҵ�� ó���ǵ��� ��
		 * ��, �ݺ����� do while�� �ۼ�
		 */
		int[] a = {22,33,44,55,66,77,88,99};
		//void = ��ü ���� + �ν��Ͻ�(�޸� ���)
		//static�̸� �̹� �޸� �ö�, �׳� plus();
		example1 ex = new example1();
		ex.plus(a);
		ex = null;

	}
	
	public void plus(int arr[]) {	//�Ű������� �Ѱ����� �迭�̸� ���� �ʵ��� ����, ���߿� ȥ���� �� ����
		//System.out.println("test");
		int d = 0;
		int al = arr.length;
		int h = 0;
		do {
			h = h + arr[d];
			d++;
		}while(d<al);
		System.out.println(h);
	}

}
