package lambda;

public class Quiz3 {

	public static void main(String[] args) {

		StringConverterImpl stringConverterImpl = new StringConverterImpl();
		System.out.println(stringConverterImpl.convert("a"));
		StringConverter stringConverter1 = new StringConverterImpl();
		System.out.println(stringConverter1.convert("a"));
		
		StringConverter stringConverter2 = new StringConverter() {
			
			@Override
			public String convert(String s) {
				return s.toUpperCase();
			}
		};
		System.out.println(stringConverter2.convert("b"));
		
		StringConverter stringConverter3 = s -> s.toUpperCase();
		System.out.println(stringConverter3.convert("c"));
	}

}

// 함수형 인터페이스 선언
interface StringConverter {
	// 문자열을 대문자로 변환해서 반환하는 함수
	String convert(String s);
}

// 구현 클래스
class StringConverterImpl implements StringConverter {

	@Override
	public String convert(String s) {
		return s.toUpperCase();
	}
	
}


