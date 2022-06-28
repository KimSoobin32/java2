import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Socket : Server, Client - 메세지, 파일 전달 송수신 통신 (양방향), 보내고보내고 받고 받고 한쪽에서만 보낼수도 잇고..,느림

//HTTP통신 : JSON, Image, 동영상, 음약 사용자(요청)와 서버(응답)가 송수신 통신 (단방향), 사용자가 콜하고 받고 다시보내고
public class net5 {
	//Server //java "C:\java6\Net\src\net5.java"
	public static void main(String[] args) {
		System.out.println("Server Connect");
		int port = 8080;	//오픈할 포트번호를 셋팅함 (단, 절대 중복도니 포트를 사용하면 안됨)
		String msg ="Success Connect!!";
		
		
		try {
			
			

				//서버에서 쓰는 단어 , 클라이언트에선 그냥 소켓
				ServerSocket ss = new ServerSocket(port);	//ServerSocket : 오픈시킬 포트를 적용, 소켓 위로 빼야 안 끊김-계속연결 가능(여러번 접속 가능)
				//연결을 지속유지 하기 위해서는 ServerSocket은 절대 재로드를 해서는 안됨
				
			while(true) {
				System.out.println("연결 대기중....");
				Socket sc = ss.accept();	//accept() : 클라이언트가 들어오는 것을 대기하는 역할을 하게 함
				System.out.println("호스트:통신 연결 성공");
				
				/* Server에서 Client로 받는 통로 */
				InputStream is = sc.getInputStream();	//클라이언트에서 보내는 값을 읽어들임
				
				/* Client로 보내는 통로 */
				OutputStream os = sc.getOutputStream();			//클라이인트로 값을 전송	
				
				byte data[] = new byte[1024];	//클라이언트에서 받는 값을 바이트로 받음
				int n = is.read(data);	//해당 값을 읽어들임
				String msgclient = new String(data,0,n);	//해당 값을 배열로 확인하여 변수로 이관
				System.out.println(msgclient); //client로 메세지 날아감, 이관된 값을 출력시킴
				
				String aws = "반갑습니다.";	//서버에서 보내는 메세지
				os.write(aws.getBytes());	//클라이언트로 보내기 위한 메모리 저장
				os.flush();
				
				is.close();
				os.close();
				sc.close();
			}
			
		}catch (Exception e) {
			System.out.println("현재 서버포트가 중복 되어 서버를 강제 종료 합니다.");
		}

	}

}
