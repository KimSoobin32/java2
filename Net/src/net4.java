import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

//ũ�Ѹ�2
public class net4 {

	public static void main(String[] args) throws Exception {
		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL url  = new URL(page);
		/* Stream�� ����ϸ� read�� ���(byte�� �޾ƾ� �ؼ�.. - byte�̿�), Reader�� readeLine ��� ����(String) 
		 * flush() ��� ���� - BuffereedOutputStream ����.., ������������ flush �� �ʿ� x
		 * �ܿ�����/..
		 */
		InputStream is = url.openStream();
		BufferedInputStream bs = new BufferedInputStream(is);	//���� byte[]
		
		byte html[] = new byte[1024];
		
		//FileOutputStream fs = new FileOutputStream("game.html");	//�迭�� �ε��ؼ� ����, ���1
		//������ �� FileWriter �ᵵ ������ ��
		
		BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream("game.html"));	//���2, �ӵ� �� ����
		
		int s = 0;
		while((s=bs.read(html))!=-1) {	//String �̸� s=bs.readLine()!=null, Stream�� read()�� byte[] �־��..
			fs.write(html,0,s);
		}
		
		fs.flush();
		bs.close();
		fs.close();
		

	}

}
