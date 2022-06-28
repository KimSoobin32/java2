import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
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

	public static void main(String[] args) {
		String ip = "192.168.1.198";
		int port = 9090;
		Scanner sn = null;
		Socket sc = null;
		OutputStream os = null;
		InputStream is = null;
		try {
			sc = new Socket(ip,port);
			System.out.println("서버 접속 되었습니다.");
			os = sc.getOutputStream();
			is = sc.getInputStream();
			sn = new Scanner(System.in);
			for(;;) {	//지속적으로 소켓에 계속 접속되도록 하는 형태
				
				
				
				System.out.println("입력하실 내용을 적어주세요: ");
				String msg = "홍길동: "+sn.nextLine();
				
				os.write(msg.getBytes());
				os.flush();
				
				byte[] data = new byte[1024];
				int n = is.read(data);
				String cmsg = new String(data,0,n);
				System.out.println(cmsg);
				
				
				//sc.close();
				//sn.close(); 닫으면 절단
			}
			
			
			
		} catch (Exception e) {
			if(e.getMessage()!=null) {
				
				System.out.println("현재 접속 장애가 발생 하였습니다.");
				
			}
		} finally {	//클라이언트가 접속 종료 시 해당 소켓 및 각종 Stream, Scanner 모두 종료
			try {
				sc.close();
				os.close();
				is.close();
				sn.close();	//접속이 종료 시 체크
				System.out.println("종료");
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
