import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
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
	public static void main(String[] args) {	//java "C:\java6\Net\src\server.java", ������ �� ���� �� Ŭ���̾�Ʈ , ������ ������ ������ �̿��ؾ� ��
		int port = 9090;
		ServerSocket ss = null;
		Socket sc = null;
		Scanner sr = null;
		Scanner sr2 = null;
		InputStream is = null;
		OutputStream os = null;
		try {
			ss = new ServerSocket(port);
			
			System.out.println("���� ���� �����...");
			for(;;) {
				
				sc = ss.accept();
				
				
				is = sc.getInputStream();
				os = sc.getOutputStream();
				
				byte[] data = new byte[1024];
				int n = is.read(data);
				String message = new String(data,0,n).intern();
				System.out.println(message);
				
				sr2 = new Scanner(System.in);
				System.out.println("�������� ����Ͻ� ���̵� �Է��� �ּ���: ");
				String sid = sr2.next();
				
				sr = new Scanner(System.in);
				System.out.println("�Է��Ͻ� ������ �����ּ���: ");	//Ŭ���ƾ�Ʈ���� �Է� ������ ��
				String msg = sid+": "+sr.nextLine();
				
				os.write(msg.getBytes());
				
				
				String cid = message.split(": ")[0];
				System.out.println("cid"+cid);
				
			if(message.split(": ")[1].intern()=="exit") {
				System.out.println(cid+"�� �����ϼ̽��ϴ�.");
			} else {
				System.out.println("ddddd");
				System.out.println(message);
				
				
			}
			
//			sr = new Scanner(System.in);
				
				
//				os.flush();

			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			//����...
		}
//		}finally {
//			is.close();
//			os.close();
//			sc.close();
//		}

	}

}
