
public class Class7 {

	public static void main(String[] args) {
		//Class에 기본 메소드 객체 필드값 전달
		String mid = "hong";
		String mname = "홍길동";
		java1 jv1 = new java1(mid, mname);
		

	}

}

class java1{
	//java1 class를 main에서 객체 생성 및 인스턴스를 실행하면 바로 작동하는 class 기본 메소드이다.
	public java1(String a, String b) {	//class명과 동일(기본 메소드), class에 기본으로 사용하는 메소드 (따라서 기본메소드는 클래스에서 하나만 쓸 수 있다.)
		System.out.println(a+b);
		java2();	//void 메소드를 바로 호출 할 수 있다.
	}
	public void java2() {
		System.out.println("test");
	}
}