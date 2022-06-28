import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
	/*
	 * 1:1 ä�� ���α׷� ���μ��� - 9090 port
	 * [Server]
	 * "�������� ����Ͻ� ���̵� �Է��� �ּ���:"
	 * ������
	 * �����...
	 * ȫ�浿: �ݰ����ϴ�.
	 * "������ �Է��� �ּ���:"�������~
	 * "ȫ�浿�� �����ϼ̽��ϴ�."
	 * "������ �Է��� �ּ���:"
	 * 
	 * [Client]
	 * "ä�ÿ� ����Ͻ� ���̵� �Է����ּ���:"
	 * ȫ�浿
	 * "������ �Է��� �ּ���:" �ݰ����ϴ�.
	 * ������: �������~
	 * "������ �Է����ּ���: " exit (�ݺ��� break)
	 * "ä���� ����Ǿ����ϴ�."
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String ip = "192.168.1.198";
		int port = 9090;
		Scanner sn = null;
		Socket sc = null;
		OutputStream os = null;
		InputStream is = null;
		try {
			sc = new Socket(ip,port);
			System.out.println("���� ���� �Ǿ����ϴ�.");
			os = sc.getOutputStream();
			is = sc.getInputStream();
			sn = new Scanner(System.in);
			for(;;) {	//���������� ���Ͽ� ��� ���ӵǵ��� �ϴ� ����
				
				
				
				System.out.println("�Է��Ͻ� ������ �����ּ���: ");
				String msg = "ȫ�浿: "+sn.nextLine();
				
				os.write(msg.getBytes());
				os.flush();
				
				byte[] data = new byte[1024];
				int n = is.read(data);
				String cmsg = new String(data,0,n);
				System.out.println(cmsg);
				
				
				//sc.close();
				//sn.close(); ������ ����
			}
			
			
			
		} catch (Exception e) {
			if(e.getMessage()!=null) {
				
				System.out.println("���� ���� ��ְ� �߻� �Ͽ����ϴ�.");
				
			}
		} finally {	//Ŭ���̾�Ʈ�� ���� ���� �� �ش� ���� �� ���� Stream, Scanner ��� ����
			try {
				sc.close();
				os.close();
				is.close();
				sn.close();	//������ ���� �� üũ
				System.out.println("����");
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
