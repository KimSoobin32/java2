
public class Double_loop2 {

	public static void main(String[] args) {
		//while
		int w = 1;
		while(w<=3) {
			//���� while���� �ʱⰪ�� ū �ݺ��� �ȿ� ����
			int ww = 1;	//��(��)�� ������ �ѹ��� �� �� �������� (�ö��� ����) �ν� ���ϱ� ������ �����ع����� ������..(11,12,13,14) ww=4���� ����(ww=1�� �ʱ�ȭ�Ұ�)
			
			while(ww<=4) {
//				System.out.println(w+" + "+ww);			
				ww++;
			}		
			w++;
		}
		
		
		//do while
		int dw = 1;
		do {
			//do while�� ���� while������ �ʱⰪ�� ū �ݺ��� �ȿ� ����
			int ddw = 1;
			do {
				System.out.println(dw + " + " + ddw);
				
				ddw++;
			}while(ddw<=4);	//���� �ݺ��� ����
					
			dw++;
		}while(dw<=3);	//ū �ݺ��� ����
		
		

	}

}
