import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * ���� �迭���� �ֽ��ϴ�. �ش� �迭���� ���Ͽ�
		 * ����� ������ ���
		 * Adata = hong kim park jang lee soun
		 * Bdata = 80 100 46 38 65 88
		 * 
		 * ��� �迭�� ���� ������ 60�� �̻�(����) �� �հ��ڸ� ���
		 * ����迭[hong, kim, lee, soun]
		 */
		//Ǯ�̴� �ݿ��ϳ�..
		String a[] = {"hong", "kim", "park", "jang", "lee", "soun"};
		int b[] = {80, 100, 46, 38, 65, 88};
		String na[] = new String[6];
		int w = 0;
		int wl = a.length;
		int ct = 0;
		while(w<wl) {
			if(b[w]>=60) {
				na[ct] = a[w];
				ct++;
			}
			w++;
		};
		System.out.println(Arrays.toString(na));

	}

}
