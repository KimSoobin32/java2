
public class example7 {

	public static void main(String[] args) {
		/*
		 * ������ �迭�� ���� + �ܺ� class �� �޼ҵ� ���
		 * [data]
		 * {"ȫ�浿","�հ�"},
		 * {"�̼���","�հ�"},
		 * {"������","���հ�"},
		 * {"������","�հ�"},
		 * {"������","���հ�"},
		 * {"�庸��","���հ�"}
		 * 
		 * ������ �迭 �����̸�, �ش� �� �� �հ��ڸ� ���
		 * ��, �迭���� �ܺ� Ŭ���� �ȿ� �޼ҵ忡�� ó��
		 * ��� : ȫ�浿 �̼��� ������
		 */
		aa a = new aa();
		a.hap();
		a = null;

	}

}

class aa{	//���� ��Ű�� �ȿ����� �ٸ� Ŭ������ �����
	public void hap() {
		//System.out.println("test");
		String data[][] = { 
			{ "ȫ�浿", "�հ�" }, 
			{ "�̼���", "�հ�" }, 
			{ "������", "���հ�" }, 
			{ "������", "�հ�" }, 
			{ "������", "���հ�" },
			{ "�庸��", "���հ�" } 
		};
		int w=0;
		int dl = data.length;	//6
		int ddl = data[0].length;	//2

		while(w<dl) {
			if(data[w][1].equals("�հ�")) {
				System.out.printf("%s ",data[w][0]);
			}
			w++;
		}
		
//		while(w<dl) {
//			int ww = 0;
//			while(ww<ddl) {
//				if(data[w][ww].equals("�հ�")) {
//					System.out.printf("%s ",data[w][0]);
//				}
//				//System.out.println(data[w][ww]);
//				ww++;
//			}			
//			w++;
//		}
		
		
		
	}
}
