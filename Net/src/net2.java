import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/* 전송 형태의 프로토콜 */
//TCP(연결 프로토콜)-전송 속도가 빠름, UDP(사용자 데이터 프로토콜)-전송 속도가 느림(1:1일 경우 굉장히 빠름)
/* PORT
 * (TCP) 
 * 80 : WEB (http://)
 * 21 : FTP - 파일 전송 시 사용
 * 22 : SSH - Linux, Unix 쉘, 파일전송, 서버외부접속
 * 23 : TELNET - Window, 서버외부접속
 * 443 : WEP (https://)
 * 25 : SMTP (메일서버) - 메일 보내기
 * 110 : POP3 (메일받기) - 문자, 파일 받기, pc에 다운, pc에서 메일 지우면 완전 없어짐 (서버에 남아있지 않음) -비동기화
 * 143 : IMAP (메일받기) - 문자, 파일 받기, 지워도 서버에 남아있음 -서버와 동기화
 */
/* SNMP : UDP (문자 발송 시스템) */
public class net2 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해주세요.");
		//http://t1.daumcdn.net/friends/prod/editor/dc8b3d02-a15a-4afa-a88b-989cf2a50476.jpg
		String url = sc.next();
		//String url = "http://naver.com/123.jpg";
		
		URL u = new URL(url);	//URL(클래스) : 네트워크 경로를 말함
		URLConnection con = u.openConnection();	//해당 경로를 연결 , 있나 확인
		
		//System.out.println(con);
		int imgsize = con.getContentLength();	//107989 용량, indexOf 기능 -1(없음), 그외에는 파일 확인, 있는지 없는지 확인
		//System.out.println(imgsize);
		
		String imgtype = con.getContentType();	//파일 속성을 확인하는 부분
		//System.out.println(imgtype);	//image/jpeg
		
		long date = con.getDate();	//파일 로드 날짜 1656316883000(서버시간)
		//System.out.println(date);
		
		//openStream : URL에만 사용 (pc에 저장된 파일엔 쓰지 않음
		InputStream is = u.openStream();	//URL에서 파일을 읽어올 때 사용함
		BufferedInputStream bi = new BufferedInputStream(is);	//URL에서 읽은 파일을 임시저장
		FileOutputStream fo = new FileOutputStream("copy.mp4");	//저장형태
		byte data[] = new byte[1024];	//해당 파일을 조각냄 1024 = 1KB
		int imgdata=0;
		int cnt=0;	//반복값
		while((imgdata=bi.read(data))!=-1) {
			fo.write(data,0,imgdata);	//조각난 파일을 붙여넣기하는 상태
			cnt += imgdata;	//1024씩 (1024++
			System.out.println("다운로드 중..."+(cnt*100)/imgsize+"%");
		}
		fo.flush();
		fo.close();
		
		//fo.write(bi.read(data));
		System.out.println("다운로드가 완료 되었습니다.");
		
		sc.close();
	}

}
