import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		/*
		 * �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * product  : "����","����","���","��","����","Ű��","�ٳ���","����" ��
		 * ����, ��, Ű���� ����
		 * �ش� ���� �� �迭�� �ٽ� �� ����Ʈ �ϴ� �ڵ带 �ۼ� //�ٽ� �޴� �迭 �ϳ� �ʿ�
		 * ��, �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ�� ��
		 * �ݺ����� free
		 * ��� : [����, ���, ����, �ٳ���, ����]
		 */
		String product[] = {"����","����","���","��","����","Ű��","�ٳ���","����"};
				
		basket(product);
	}
	public static void basket(String p[]) {
		//System.out.println("test");
		int w=0;
		int pl = p.length;
		int ct =0;
		int no = 5;
		String np[] = new String[no];
//		while(w<pl) {
//			if(!p[w].equals("����") && !p[w].equals("��") && !p[w].equals("Ű��")) {
//				np[ct] = p[w];
//				ct++;
//			}
//			w++;
//		}
		for(String f : p) {
			if(!f.equals("����") && !f.equals("��") && !f.equals("Ű��")) {
				
				np[ct] = f;
				ct++;
			}
		}
		
		System.out.println(Arrays.toString(np));
	}

}
