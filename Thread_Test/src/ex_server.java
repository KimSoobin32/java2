import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ex_server {
	/*
	 * ���� ���빮��. (PORT ��ȣ�� ������ ���ڸ� �Է¹޵��� ��)
	//������ x
	���� ���α׷��� ������. ���� �� ���� ���� �ش� ������ �ϰ� ��
	"����Ͻ� PORT��ȣ�� �Է��ϼ��� : " 9009
	"*** ä�ü��� ����[9009] *****"
	
	Ŭ���̾�Ʈ ���α׷� ������.
	"������ IP ��ȣ�� �Է��� �ּ��� : "
	"������ PORT ��ȣ�� �Է��� �ּ���: "
	
	���� ���� �޼���
	"***** GUEST�� ���� �Ͽ����ϴ�. *****"
	//���Ӹ�
	 */
	public static void main(String[] args) {
		e_sever e = new e_sever();
		e.es();

	}

}

class e_sever{
	ServerSocket sk = null;
	Socket so = null;
	Scanner sc = null;
	int port = 0;
	public void es() {
		this.sc = new Scanner(System.in);
		System.out.println("����Ͻ� PORT��ȣ�� �Է��ϼ��� : ");
		this.port = this.sc.nextInt();
		
		try {
			this.sk = new ServerSocket(this.port);
			System.out.println("*** ä�ü��� ����["+this.port+"] *****");
			this.so = this.sk.accept();
			System.out.println("***** GUEST�� ���� �Ͽ����ϴ�. *****");
			
		} catch (Exception e) {
			System.out.println(e);
//			if(e.getMessage()=="InputMismatchException") {
//				System.out.println("port�� ����");
//			}
		}
	}
}