import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class net6 {
	//Client
	public static void main(String[] args) throws Exception {	//java "C:\java6\Net\src\net6.java"
		System.out.println("Ŭ���̾�Ʈ");
		String ip = "127.0.0.1";	//localhost 127.0.0.1 , ���� ip 
		int port = 8080;	//���� ��Ʈ
		try {
			Socket sc = new Socket(ip, port);	//������ ���� ip, ������ ���� PORT
			System.out.println("���� ���� �Ǿ����ϴ�.");
			String cmsg = "�ȳ��ϼ���!";
			/*Client���� Server�� ������ ���*/
			OutputStream os = sc.getOutputStream();
			
			/*Server���� ������ ���� �޴� ���*/
			//Ŭ���̾�Ʈ���� ������ �޽����� �޸𸮿� ���� �� ����Ʈ�� ����
			InputStream is = sc.getInputStream();
			os.write(cmsg.getBytes());
			os.flush();
			
			//�������� ȸ�ŵ� �������� ����Ʈ�迭�� ���� �� ���
			byte data[] = new byte[1024];
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			
			sc.close();
			os.close();
			
			
			
		} catch (Exception e) {
			System.out.println("���� ���ῡ �����Ͽ����ϴ�.");
		}
	}

}
