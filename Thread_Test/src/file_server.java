import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class file_server {

	public static void main(String[] args) {
		f_server fs = new f_server();
		fs.data();
	}

}

class f_server{
	ServerSocket server = null;
	Socket sk = null;
	int port = 8005;
	InputStream is = null;
	OutputStream os = null;
	public void data() {
		try {
			this.server = new ServerSocket(this.port);
			this.sk = this.server.accept();
			System.out.println("****서버 가동중*****");
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			byte data[] = new byte[1024*16];
			int n = this.is.read(data);
			//String f = new String(data,0,n);	//채팅 문자로 받을 때
			//System.out.println(f);
			
			String url = "C:\\java6\\Thread_Test\\src\\copy.jpg";	//복사하려면 경로 이름을 받아온 값으로
			//파일로 클라이언트가 전송을 하므로 서버에서 byte로 값을 받게 됨
			//getInputStream() -> FileOutputStream
			FileOutputStream fs = new FileOutputStream(url);
			fs.write(data,0,n);	//바이트, 해당 url 자료형으로 저장되도록 함
			fs.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}