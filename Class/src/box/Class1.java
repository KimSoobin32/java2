package box;	//package는 메인 java를 실행 시키면 함께 실행 되는 java파일 로드 형태
//default package는 따로따로 실행됨

public class Class1 {

	public static void main(String[] args) {	//main package중에서 실행되는 최초의 java파일에만 적용함
		Class2 c2 = new Class2();
		System.out.println(c2.names);
		
		Adata a = new Adata();	//Class2.java에 별도의 Adata클래스 객체를 로드함
		System.out.println(a.names);

	}

}	//로드하고 찍는 용도
