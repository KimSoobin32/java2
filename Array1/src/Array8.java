import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/* �����迭 - ���� ����
		int a[] = new int[2];
		a[0] = 22;
		a[1] = 32;
		*/
		
		/* �����迭
		int b[] = {1,2,3,4};
		int[] c = {1,2,3,4};
		int[] d = new int[]{1,2,3,4};
		*/
		
		
		/* 2�� �迭 [][] */
		
		// String member2[][] = new String[3][3]; //2�� �����迭
		
		String member[][] = {
				{"ȫ�浿","������","������"},
				{"25","31","22"}
		};	//2�� �����迭 ,�ȹ迭 ������ 3��
		int ea = member.length;	//2 ,�迭 ������ � �ִ����� Ȯ��
		int data_ea = member[0].length;	//3 ,�ش� �迭���� �����Ͱ�ü�� � �ִ��� Ȯ��
		//System.out.println(data_ea);
		//System.out.println(member[0][2]);	//������
		int f, ff;
		for(f=0;f<ea;f++) {	//ū �ݺ����� �迭 ������ŭ loop
			//System.out.println(Arrays.toString(member[f]));
			for(ff=0;ff<data_ea;ff++) {	//���� �ݺ����� �迭�� �ִ� ������ ������ŭ loop
//				System.out.println(member[f][ff]);
			}
		}
		
		
		int[][] datas = {
				{1,3,5},
				{2,4,6}
		};
		int fea = datas.length;
		int dea = datas[0].length;	//0������ 1������ ���� ���� ������
		int total = 0;
		int w, ww;
		for(w=0;w<fea;w++) {
			//System.out.println(Arrays.toString(datas[w]));
			for(ww=0;ww<dea;ww++) {
				//System.out.println(datas[w][ww]);
				total += datas[w][ww];
			}
		}
		System.out.println("���հ�� : "+total);
		
		
		/*
		 * ���빮�� �ش� ������ �迭�� �ִ� ��� �� �� ¦������ ��� ����. ����� : 90
		 * 1�� ������ : 11,42,22,16
		 * 2�� ������ : 7,33,10,29
		 */
		int a[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int al = a.length;
		int adl = a[0].length;
		int t = 0;
		//for��
//		int b,bb;
//		for(b=0;b<al;b++) {
//			//System.out.println(Arrays.toString(a[b]));
//			for(bb=0;bb<adl;bb++) {
//				//System.out.println(a[b][bb]);
//				if(a[b][bb]%2==0) {
//					t += a[b][bb];
//				}
//			}
//		}
		//do while��
		int d = 0;		
		do {
			int dd = 0;	//��ġ ���� ,�ۿ� ���� �ʱⰪ ��ã��
			do {
				if(a[d][dd]%2==0) {
					t += a[d][dd];
				}
				dd++;
			}while(dd<adl);
			d++;
		}while(d<al);
				
		System.out.println(t);
		
		
		
		
		

	}

}
