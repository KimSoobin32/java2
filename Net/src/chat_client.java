import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {
	

	public static void main(String[] args) throws Exception {
		try {
			String ip = "127.0.0.1";
			int port = 9090;
//			static Scanner sc = null;
			String myid = null;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("ä�ÿ� ����Ͻ� ���̵� �Է��� �ּ���: ");
			myid = sc.next();
			//sc.close();
			Socket sk = new Socket(ip,port);
			OutputStream os = sk.getOutputStream();	//��� ������ �ȿ��� ���� ����!
			//InputStream is = sk.getInputStream();
			String message = "["+myid+"]���� �����ϼ̽��ϴ�.";
			os.write(message.getBytes());
			os.flush();
//			//os.close(); OutputStream, InputStream close�� �ִ��� finally�� �����
			
			int cnt=0;
			while(true) {
				
				InputStream is = sk.getInputStream();
				
				byte data[] = new byte[9999];
				int no = is.read(data);
				String msg = new String(data,0,no);
				System.out.println(msg);
				
				//sc = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				System.out.println("������ �Է����ּ���Ŭ :");
				//String ms = "["+myid+"]: "+sc2.nextLine().intern();
				String ms = sc2.nextLine().intern();
				if(ms=="exit") {
					System.exit(0);	//�ý��� ��ü ����
				}
				
				
				OutputStream os2 = sk.getOutputStream();	//��� ������ �ȿ��� ���� ����!
				os2.write(ms.getBytes());
				os2.flush();
				
				
				os.flush();
				
				os.close();
				is.close();
				sc.close();
				
				
			
				
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

	}

}
