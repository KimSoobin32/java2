public class example5 {

	public static void main(String[] args) {
		/*
		 * 2���迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * ��ϵ� ���� vip ���� ����Ʈ�� ���
		 * 
		 * user_list : "ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"
		 * user_level : "gold", "vip", "guest", "gold", "vip" ,"vip", "guest"
		 * 
		 * ��� ��� : �̼���, �������, ������,
		 * 
		 * [�׷��ε���][�������ε���]
		 */
		String user[][] = {
				{"ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"},
				{"gold", "vip", "guest", "gold", "vip" ,"vip", "guest"}				
		};
		lev(user);

	}
	
	public static void lev(String u[][]) {
		int w = 0;
		int udl = u[0].length;	//7
		int gp = u.length;	//2
//
//		while(w<udl) {
//			if(u[1][w].equals("vip")) {
//
//				System.out.printf("%s, ",u[0][w]);
//			}
//			w++;
//		}
		while(w<gp) {
			int ww = 0;
			while(ww<udl) {
				//System.out.println(u[w][ww]);
				if(u[w][ww].equals("vip")) {
					System.out.println(u[0][ww]);
				}
				ww++;
			}
			w++;
		}

		
	}

}
