
public class Double_loop4 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ���� �ݺ��� for, do while
		 */
		int f;
		for(f=2;f<=3;f++) {
			int w = 1;
			do {
//				System.out.println(f+"*"+w+"="+(f*w));
				w++;
			}while(w<=9);
		}
		
		/*
		 * ���빮�� ������ 7~9�ܱ��� ��, �� ������ ��������
		 * 5������ �������� ��. 7*1=7 ... 7*5=35 8*1=8... 9*5=45
		 * ����(do while, while)
		 */
		int d = 7;
		do {
			int w = 1;
			while(w<=5) {
//				System.out.println(d+"*"+w+"="+(d*w));
				w++;
			}
			d++;
		}while(d<=9);
		
		/*
		 * ���빮�� ���� ������� Ȯ���Ͽ� �ڵ� �ۼ�
		 * ��, for ~ while���� ����
		 * 1*1=1
		 * 2*2=4
		 * ...
		 * 9*9=81
		 */
//		int a;
//		
//		for(a=1;a<=9;a++) {
//			//System.out.println(a);
//			
//			while(a<=9) {
//				System.out.println(a+"*"+a+"="+(a*a));
//				a++;
//			}
//		}
		
		int g;
		for(g=1;g<=9;g++) {
			int y=g;	//!!!
			while(y<=g) {	//!!!
//				System.out.println(y+"*"+g+"="+(y*g));
				y++;
			}
			
		}
		
		/*
		 * ���빮�� ���� �ش� �����ó�� ����� �ǵ��� ����ݺ��� �̿�
		 * while ~ do while
		 * 1+1=2 2+1=3 2+2=4 3+1=4 3+2=5 3+3=6 4+1=5 4+2=6 4+3=7 4+4=8
		 */
		int w = 1;
		
		while(w<=4) {
			int dw = 1;
			do {
				System.out.println(w+"+"+dw);
				dw++;
			}while(dw<=w);
			
			w++;
		}
		
		
		
	
		

	}

}
