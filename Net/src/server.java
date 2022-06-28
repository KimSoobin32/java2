import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	/*
	 * 1:1 채팅 프로그램 프로세서 - 9090 port
	 * [Server]
	 * "서버에서 사용하실 아이디를 입력해 주세요:"
	 * 유관순
	 * 대기중...
	 * 홍길동: 반갑습니다.
	 * "내용을 입력해 주세요:"어서오세요~
	 * "홍길동님 퇴장하셨습니다."
	 * "내용을 입력해 주세요:"
	 * 
	 * [Client]
	 * "채팅에 사용하실 아이디를 입력해주세요:"
	 * 홍길동
	 * "내용을 입력해 주세요:" 반갑습니다.
	 * 유관순: 어서오세요~
	 * "내용을 입력해주세요: " exit (반복문 break)
	 * "채팅이 종료되었습니다."
	 * 
	 * 
	 */
	public static void main(String[] args) {	//java "C:\java6\Net\src\server.java", 지금은 한 서버 한 클라이언트 , 여러명 쓰려면 쓰레드 이용해야 함
		int port = 9090;
		ServerSocket ss = null;
		Socket sc = null;
		Scanner sr = null;
		Scanner sr2 = null;
		InputStream is = null;
		OutputStream os = null;
		try {
			ss = new ServerSocket(port);
			
			System.out.println("서버 연결 대기중...");
			for(;;) {
				
				sc = ss.accept();
				
				
				is = sc.getInputStream();
				os = sc.getOutputStream();
				
				byte[] data = new byte[1024];
				int n = is.read(data);
				String message = new String(data,0,n).intern();
				System.out.println(message);
				
				sr2 = new Scanner(System.in);
				System.out.println("서버에서 사용하실 아이디를 입력해 주세요: ");
				String sid = sr2.next();
				
				sr = new Scanner(System.in);
				System.out.println("입력하실 내용을 적어주세요: ");	//클래아언트에서 입력 보내야 뜸
				String msg = sid+": "+sr.nextLine();
				
				os.write(msg.getBytes());
				
				
				String cid = message.split(": ")[0];
				System.out.println("cid"+cid);
				
			if(message.split(": ")[1].intern()=="exit") {
				System.out.println(cid+"님 퇴장하셨습니다.");
			} else {
				System.out.println("ddddd");
				System.out.println(message);
				
				
			}
			
//			sr = new Scanner(System.in);
				
				
//				os.flush();

			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			//퇴장...
		}
//		}finally {
//			is.close();
//			os.close();
//			sc.close();
//		}

	}

}
