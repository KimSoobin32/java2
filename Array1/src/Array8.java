import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/* 정적배열 - 공간 잡힘
		int a[] = new int[2];
		a[0] = 22;
		a[1] = 32;
		*/
		
		/* 동적배열
		int b[] = {1,2,3,4};
		int[] c = {1,2,3,4};
		int[] d = new int[]{1,2,3,4};
		*/
		
		
		/* 2차 배열 [][] */
		
		// String member2[][] = new String[3][3]; //2차 정적배열
		
		String member[][] = {
				{"홍길동","김유신","유관순"},
				{"25","31","22"}
		};	//2차 동적배열 ,안배열 무조건 3개
		int ea = member.length;	//2 ,배열 갯수가 몇개 있는지를 확인
		int data_ea = member[0].length;	//3 ,해당 배열에서 데이터객체가 몇개 있는지 확인
		//System.out.println(data_ea);
		//System.out.println(member[0][2]);	//유관순
		int f, ff;
		for(f=0;f<ea;f++) {	//큰 반복문은 배열 갯수만큼 loop
			//System.out.println(Arrays.toString(member[f]));
			for(ff=0;ff<data_ea;ff++) {	//작은 반복문은 배열에 있는 데이터 갯수만큼 loop
//				System.out.println(member[f][ff]);
			}
		}
		
		
		int[][] datas = {
				{1,3,5},
				{2,4,6}
		};
		int fea = datas.length;
		int dea = datas[0].length;	//0넣으나 1넣으나 값이 같기 때문에
		int total = 0;
		int w, ww;
		for(w=0;w<fea;w++) {
			//System.out.println(Arrays.toString(datas[w]));
			for(ww=0;ww<dea;ww++) {
				//System.out.println(datas[w][ww]);
				total += datas[w][ww];
			}
		}
		System.out.println("총합계는 : "+total);
		
		
		/*
		 * 응용문제 해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더함. 결과값 : 90
		 * 1번 데이터 : 11,42,22,16
		 * 2번 데이터 : 7,33,10,29
		 */
		int a[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int al = a.length;
		int adl = a[0].length;
		int t = 0;
		//for문
//		int b,bb;
//		for(b=0;b<al;b++) {
//			//System.out.println(Arrays.toString(a[b]));
//			for(bb=0;bb<adl;bb++) {
//				//System.out.println(a[b][bb]);
//				if(a[b][bb]%2==0) {
//					t += a[b][bb];
//				}
//			}
//		}
		//do while문
		int d = 0;		
		do {
			int dd = 0;	//위치 주의 ,밖에 쓰면 초기값 못찾음
			do {
				if(a[d][dd]%2==0) {
					t += a[d][dd];
				}
				dd++;
			}while(dd<adl);
			d++;
		}while(d<al);
				
		System.out.println(t);
		
		
		
		
		

	}

}
