import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class net6 {
	//Client
	public static void main(String[] args) throws Exception {	//java "C:\java6\Net\src\net6.java"
		System.out.println("클라이언트");
		String ip = "127.0.0.1";	//localhost 127.0.0.1 , 서버 ip 
		int port = 8080;	//서버 포트
		try {
			Socket sc = new Socket(ip, port);	//접속할 서버 ip, 접속할 서버 PORT
			System.out.println("서버 연결 되었습니다.");
			String cmsg = "안녕하세요!";
			/*Client에서 Server로 보내는 통로*/
			OutputStream os = sc.getOutputStream();
			
			/*Server에서 보내는 값을 받는 통로*/
			//클라이언트에서 적용한 메시지를 메모리에 적용 후 바이트로 전송
			InputStream is = sc.getInputStream();
			os.write(cmsg.getBytes());
			os.flush();
			
			//서버에서 회신된 내용으로 바이트배열로 받은 후 출력
			byte data[] = new byte[1024];
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			
			sc.close();
			os.close();
			
			
			
		} catch (Exception e) {
			System.out.println("서버 연결에 실패하였습니다.");
		}
	}

}
