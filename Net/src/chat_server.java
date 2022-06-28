import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server {

//	static Scanner sc = null;
//	static InputStream is = null;
//	static OutputStream os = null;
//	static byte[] data = null;

	public static void main(String[] args) {	//java "C:\java6\Net\src\chat_server.java"
		String mid = null;
		int port = 9090;
		Scanner sc = new Scanner(System.in);
		System.out.println("서버에서 사용하실 아이디를 입력해 주세요: ");
		mid = sc.next();	//서버 담당자 아이디
		//ServerSocket server_sock = null;
		try {
			ServerSocket server_sock = new ServerSocket(port);
			
			
//			sc = new Scanner(System.in);
		
			//sc.close(); -종료하면 밑에꺼(내용입력이후..) 안돌아감
			
			System.out.println("채팅 대기중 입니다...");
			
			Socket sk = server_sock.accept();
			
			while(true) {
				
				
				
				
				InputStream is = sk.getInputStream();
				OutputStream os = sk.getOutputStream();
				
				
				
				byte[] data = new byte[9999];
				int arr = is.read(data);
				String message = new String(data,0,arr);
				System.out.println(message);
				
				Scanner sc2 = new Scanner(System.in);
				System.out.println("내용을 입력해 주세요서: ");
				String msg = "["+mid+"]: "+sc2.nextLine();
				
				os.write(msg.getBytes());
				os.flush();
				
//				is.close();
//				os.close();
//				sc.close();
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
		}

	}

}
