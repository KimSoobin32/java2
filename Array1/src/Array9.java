import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		/*
		 * 응용문제 2개의 데이터 배열이 있다. 해당 데이터 배열을
		 * 다음 결과처럼 값을 출력
		 * 
		 * 1번 데이터 : "대한민국", "일본", "중국", "베트남", "태국"
		 * 2번 데이터 : "40", "35", "70", "55", "32"
		 * 결과 데이터 : 
		 * ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"]
		 * 
		 * 배열 array는 두개인데 결과가 한 배열이면 반복문 하나만 필요!
		 */
		String data[][] = {
				{"대한민국", "일본", "중국", "베트남", "태국"},
				{"40", "35", "70", "55", "32"}
		};
//		int ar = data.length;	//그룹개수
		int ar2 = data[0].length;		
		String newdata[] = new String[ar2];
//		int w = 0;
//		do {
			int ww = 0;
			do {
				//System.out.println(data[w][ww]);
				newdata[ww] = data[0][ww] + "(" + data[1][ww] + ")";
				ww++;
			}while(ww<ar2);
//			w++;
//		}while(w==0);	//한바퀴 돌리고 끝냄
		System.out.println(Arrays.toString(newdata));
		
		//double loop로 바꿔보기
		
		
		/*
		 * 응용문제
		 * 해당 두개의 배열 데이터가 있다. 각 배열별로 인덱스가 같은 번호를 더해서
		 * 짝수, 홀수인지를 배열 결과 데이터로 재설정
		 * 
		 * Adata = 5, 17, 19, 22, 33
		 * Bdata = 1, 2, 3, 4, 5
		 * Result = ["짝수","홀수","짝수","짝수","짝수"]
		 */
		int d[][] = {
				{5, 17, 19, 22, 33},
				{1, 2, 3, 4, 5}
		};
		int dl = d[0].length;
		String nd[] = new String[dl];
		int dw = 0;
		int h;
		String result;
		do {
			//System.out.println(d[0][dw]+d[1][dw]);
			h = d[0][dw] + d[1][dw];
			if(h%2==0) {
				result = "짝수";
			}else {
				result = "홀수";
			}
			nd[dw] = result;
			dw++;
		}while(dw<dl);
		System.out.println(Arrays.toString(nd));
		

		
		

	}

}
