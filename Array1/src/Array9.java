import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 2���� ������ �迭�� �ִ�. �ش� ������ �迭��
		 * ���� ���ó�� ���� ���
		 * 
		 * 1�� ������ : "���ѹα�", "�Ϻ�", "�߱�", "��Ʈ��", "�±�"
		 * 2�� ������ : "40", "35", "70", "55", "32"
		 * ��� ������ : 
		 * ["���ѹα�(40)","�Ϻ�(35)","�߱�(70)","��Ʈ��(55)","�±�(32)"]
		 * 
		 * �迭 array�� �ΰ��ε� ����� �� �迭�̸� �ݺ��� �ϳ��� �ʿ�!
		 */
		String data[][] = {
				{"���ѹα�", "�Ϻ�", "�߱�", "��Ʈ��", "�±�"},
				{"40", "35", "70", "55", "32"}
		};
//		int ar = data.length;	//�׷찳��
		int ar2 = data[0].length;		
		String newdata[] = new String[ar2];
//		int w = 0;
//		do {
			int ww = 0;
			do {
				//System.out.println(data[w][ww]);
				newdata[ww] = data[0][ww] + "(" + data[1][ww] + ")";
				ww++;
			}while(ww<ar2);
//			w++;
//		}while(w==0);	//�ѹ��� ������ ����
		System.out.println(Arrays.toString(newdata));
		
		//double loop�� �ٲ㺸��
		
		
		/*
		 * ���빮��
		 * �ش� �ΰ��� �迭 �����Ͱ� �ִ�. �� �迭���� �ε����� ���� ��ȣ�� ���ؼ�
		 * ¦��, Ȧ�������� �迭 ��� �����ͷ� �缳��
		 * 
		 * Adata = 5, 17, 19, 22, 33
		 * Bdata = 1, 2, 3, 4, 5
		 * Result = ["¦��","Ȧ��","¦��","¦��","¦��"]
		 */
		int d[][] = {
				{5, 17, 19, 22, 33},
				{1, 2, 3, 4, 5}
		};
		int dl = d[0].length;
		String nd[] = new String[dl];
		int dw = 0;
		int h;
		String result;
		do {
			//System.out.println(d[0][dw]+d[1][dw]);
			h = d[0][dw] + d[1][dw];
			if(h%2==0) {
				result = "¦��";
			}else {
				result = "Ȧ��";
			}
			nd[dw] = result;
			dw++;
		}while(dw<dl);
		System.out.println(Arrays.toString(nd));
		

		
		

	}

}
