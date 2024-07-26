package lambda;

public class Quiz1 {

	public static void main(String[] args) {

		// Q.MyNumber를 익명클래스로 구현하고, max()를 호출하세요
		// Q.MyNumber를 람다식 함수로 구현하고, max()를 호출하세요
		
		// 구현 클래스 사용
		MyNumber myNumber1 = new MyNumberImpl();
		System.out.println(myNumber1.max(5, 10));
		
		// 익명 클래스 사용
		MyNumber myNumber2 = new MyNumber() {
			
			@Override
			public int max(int x, int y) {
				return x > y ? x : y;
			}
			
		};
		System.out.println(myNumber2.max(5, 20));
		
		// 람다식 사용
		MyNumber myNumber3 = (x,y) -> x > y ? x : y;
		int max = myNumber3.max(5, 30);
		System.out.println(max);
		
	}

}

// 함수형 인터페이스
@FunctionalInterface
interface MyNumber {
	// 두숫자 중에 더 큰 값을 반환하는 함수
	int max(int x, int y);
}

// Q.MyNumber의 구현 클래스 만들기!
class MyNumberImpl implements MyNumber {

	@Override
	public int max(int x, int y) {
		return x > y ? x : y;
	}
	
}
