import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Socket : Server, Client - �޼���, ���� ���� �ۼ��� ��� (�����), ���������� �ް� �ް� ���ʿ����� �������� �հ�..,����

//HTTP��� : JSON, Image, ������, ���� �����(��û)�� ����(����)�� �ۼ��� ��� (�ܹ���), ����ڰ� ���ϰ� �ް� �ٽú�����
public class net5 {
	//Server //java "C:\java6\Net\src\net5.java"
	public static void main(String[] args) {
		System.out.println("Server Connect");
		int port = 8080;	//������ ��Ʈ��ȣ�� ������ (��, ���� �ߺ����� ��Ʈ�� ����ϸ� �ȵ�)
		String msg ="Success Connect!!";
		
		
		try {
			
			

				//�������� ���� �ܾ� , Ŭ���̾�Ʈ���� �׳� ����
				ServerSocket ss = new ServerSocket(port);	//ServerSocket : ���½�ų ��Ʈ�� ����, ���� ���� ���� �� ����-��ӿ��� ����(������ ���� ����)
				//������ �������� �ϱ� ���ؼ��� ServerSocket�� ���� ��ε带 �ؼ��� �ȵ�
				
			while(true) {
				System.out.println("���� �����....");
				Socket sc = ss.accept();	//accept() : Ŭ���̾�Ʈ�� ������ ���� ����ϴ� ������ �ϰ� ��
				System.out.println("ȣ��Ʈ:��� ���� ����");
				
				/* Server���� Client�� �޴� ��� */
				InputStream is = sc.getInputStream();	//Ŭ���̾�Ʈ���� ������ ���� �о����
				
				/* Client�� ������ ��� */
				OutputStream os = sc.getOutputStream();			//Ŭ������Ʈ�� ���� ����	
				
				byte data[] = new byte[1024];	//Ŭ���̾�Ʈ���� �޴� ���� ����Ʈ�� ����
				int n = is.read(data);	//�ش� ���� �о����
				String msgclient = new String(data,0,n);	//�ش� ���� �迭�� Ȯ���Ͽ� ������ �̰�
				System.out.println(msgclient); //client�� �޼��� ���ư�, �̰��� ���� ��½�Ŵ
				
				String aws = "�ݰ����ϴ�.";	//�������� ������ �޼���
				os.write(aws.getBytes());	//Ŭ���̾�Ʈ�� ������ ���� �޸� ����
				os.flush();
				
				is.close();
				os.close();
				sc.close();
			}
			
		}catch (Exception e) {
			System.out.println("���� ������Ʈ�� �ߺ� �Ǿ� ������ ���� ���� �մϴ�.");
		}

	}

}
