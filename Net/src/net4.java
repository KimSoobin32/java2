import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

//크롤링2
public class net4 {

	public static void main(String[] args) throws Exception {
		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL url  = new URL(page);
		/* Stream을 사용하면 read만 사용(byte로 받아야 해서.. - byte이용), Reader는 readeLine 사용 가능(String) 
		 * flush() 사용 형태 - BuffereedOutputStream 에서.., 나머지에서는 flush 쓸 필요 x
		 * 외워두자/..
		 */
		InputStream is = url.openStream();
		BufferedInputStream bs = new BufferedInputStream(is);	//베열 byte[]
		
		byte html[] = new byte[1024];
		
		//FileOutputStream fs = new FileOutputStream("game.html");	//배열값 로드해서 저장, 방법1
		//저장할 땐 FileWriter 써도 가능은 함
		
		BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream("game.html"));	//방법2, 속도 더 빠름
		
		int s = 0;
		while((s=bs.read(html))!=-1) {	//String 이면 s=bs.readLine()!=null, Stream은 read()에 byte[] 넣어야..
			fs.write(html,0,s);
		}
		
		fs.flush();
		bs.close();
		fs.close();
		

	}

}
