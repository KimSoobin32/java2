//Thread �����
public class Thread1 {

	public static void main(String[] args) {
		int w=0;
		while(w<6) {
//			box b = new box(w);
//			Thread t = new Thread(b);	//������ ����
//			t.start();	//thread�� ������ start�� ����, �μ� ���� �� ����
			//�Ѹ� �����Ҷ����� ������ �߰�.. �ϳ� ������ ������ �ϳ� ����, �������� ���� ��..
			w++;
		}
		
		for(int f=0;f<10;f++) {
		
			box2 b2 = new box2(f);
			
			//������ �޼ҵ带 ȣ���Ͽ� �ش� Ŭ������ CPU�Ѱ��� �Ҵ��� -> 10���� cpu, �ھ� ���� ���� ���� �ھ� ������ŭ �����۾�����(n������)
			Thread t2 = new Thread(b2);	//������ ����(������� �۵���ų Ŭ���� ��), ���� �̸� Ŭ������ �������� ���ҵ�
			t2.start();	//������ �۵���ų ��ɾ�
			
			//���� �����۾�, ���������� ��� �޶���
			//�ϳ��� Ŭ���������� �������� ���, �Ѹ�ɾ�� ���� �۾�
		}
			
		
				

	}

}

/* Extends Thread */
//extends ���1
class box extends Thread{
	int no = 0;
	public box(int a) {
		this.no = a;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			
		}catch (Exception e) { }
		System.out.println(this.no);
	}
}

/* interface Runnable Thread */
//implements ���2
class box2 implements Runnable{	//�� ����� �ᵵ ��
	int no = 0;
	public box2(int b) {
		this.no=b;
	}
	
	@Override
	public void run() {	//�������� �⺻ �޼ҵ�, Thread ���� ������ run�޼ҵ� ��� ��
		try {
			Thread.sleep(1000);
			//����ġ�� ���� �޼ҵ� ȣ��, 1�̸鹹 2�鹹..
		} catch (Exception e) { }
		System.out.println(this.no);
		
	}
}

