import java.util.Arrays;

public class example2 {

	public static void main(String[] args) {
		/*
		 * 배열 + 기본(클래스)메소드 문제
		 * product  : "수박","참외","사과","배","딸기","키위","바나나","망고" 중
		 * 참외, 배, 키위를 삭제
		 * 해당 삭제 후 배열을 다시 재 리스트 하는 코드를 작성 //다시 받는 배열 하나 필요
		 * 단, 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야 함
		 * 반복문은 free
		 * 결과 : [수박, 사과, 딸기, 바나나, 망고]
		 */
		String product[] = {"수박","참외","사과","배","딸기","키위","바나나","망고"};
				
		basket(product);
	}
	public static void basket(String p[]) {
		//System.out.println("test");
		int w=0;
		int pl = p.length;
		int ct =0;
		int no = 5;
		String np[] = new String[no];
//		while(w<pl) {
//			if(!p[w].equals("참외") && !p[w].equals("배") && !p[w].equals("키위")) {
//				np[ct] = p[w];
//				ct++;
//			}
//			w++;
//		}
		for(String f : p) {
			if(!f.equals("참외") && !f.equals("배") && !f.equals("키위")) {
				
				np[ct] = f;
				ct++;
			}
		}
		
		System.out.println(Arrays.toString(np));
	}

}
