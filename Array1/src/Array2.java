
public class Array2 {

	public static void main(String[] args) {
		/*
		 * hong kim park lee jang jung
		 */
		String id[] = {"hong", "kim", "park", "lee", "jang", "jung"};
//		System.out.println(id[4]);
		int word = id[4].length();	//jung ����(���� ��)
		System.out.println(word);
		
		/*
		 * ���빮�� �ش� ����� ����Ʈ �迭
		 * �ش� �迭�� �� ����� ���̵� 3�ܾ� �̻� ���
		 */
		int a = 0;
		int member = id.length;	//��ü ȸ������ �ľ��ϱ� ����
		int wl;	//������ �迭 �������� ���� ���� �ľ�
		while(a<member) {
			wl = id[a].length();	//���� ���� �ľ�
			if(wl>3) {	//�� �ܾ� �̻�(������)�� �����͸� ���
				System.out.println(id[a]);
			}
			a++;
		}
		
		/*
		 * ���빮�� �迭 ������ ������ ����
		 * 15 60 11 14 27
		 * ���� �����Ͱ��� ��� ���ؼ� ���� ������� ��� : 127
		 */
		int b[] = {15, 60, 11, 14, 27};
		int d = 0;
		int len = b.length;
		int t = 0;
		do {
			t = t + b[d];			
			d++;
		}while(d<len);
		System.out.println(t);

	}

}
