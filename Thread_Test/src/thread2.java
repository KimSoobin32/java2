
public class thread2 {
	//Thread�� ���������� ������� ���� �ȳ���
	public static void main(String[] args) {
		/*
		 * ���빮�� Thread�� �̿��Ͽ� �� �迭�� ���� ������������ ��� ���Ͽ� ��� ���
		 * �������α׷� ����
		 * 
		 */
		int data[] = {6,9,10,15,3,17};
		//int data[] = {6};
		/*��Ʈ : 6�̶�� �迭 ���� �μ������� Thread�� ����
		 * 6+5+4+3+2+1 ����������� print => 21
		 * 
		 */
		int w=0;
		int ea = data.length;
		pr p = null;
		while(w<ea){
			p = new pr(data[w]);			
			p.start();
			w++;
		}
		

	}

}

class pr extends Thread{
	int num=0;
	public pr(int n) {	//�����忡�� ���� ����ϱ� ���� �⺻ �޼ҵ�
		this.num = n;
	}
	@Override
	public void run() {		//run�޼ҵ�� ���� �μ����� ������, run���� ��ó��
		int c = this.num;
		int tot = 0;
		while(c>0) {
			tot += c;			
			c--;
		}
		System.out.println(tot);
	}
}

