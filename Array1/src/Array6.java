import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ���� �� ��ٱ����� �������� ��ǰ�� ���������
		 * �� �� �ù�� ������ �����Ǵ� �ݾ׸� ����
		 * �ù�� 30000�� �̻�(����)
		 * 15000 48000 67000 8000 118200 49800 6000 18700
		 * 
		 * [48000,67000,118200,49800]
		 */
		int a[] = {15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700};
		int b[] = new int[8];	//[null,null,null,null,null,null,null,null]
		int w = 0;
		int ct = 0;
		while(w<a.length) {
			if(a[w]>=30000) {
				b[ct] = a[w];
				ct++;	//���� ���� ���� �ε��� ����
			}
			w++;
		}
		System.out.println(Arrays.toString(b));

	}

}
