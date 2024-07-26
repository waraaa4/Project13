package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		
		// hello의 구현 클래스를 만들고, helloPrint()를 호출하세요
		// hello의 익명 클래스로 구현하고, helloPrint()를 호출하세요
		// hello의 람다식 함수로 구현하고, helloPrint()를 호출하세요
		
		HelloImpl helloImpl = new HelloImpl();
		helloImpl.helloPrint();
		Hello hello1 = new HelloImpl();
		hello1.helloPrint();

		Hello hello2 = new Hello() {
			
			@Override
			public void helloPrint() {
				System.out.println("익명 클래스");
			}
		}; 
		hello2.helloPrint();
		
		Hello hello3 = () -> System.out.println("람다식 함수");
		hello3.helloPrint();
	}

}

// 함수형 인터페이스 선언
interface Hello {
	// "안녕하세요"를 출력하는 함수
	void helloPrint();
}

// 구현 클래스
class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("구현 클래스");
	}
	
}