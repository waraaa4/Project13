package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Quiz1 {

	public static void main(String[] args) {

		// 다음과 같이 리스트를 생성하세요
		// String[] arr = { "aaa", "aaa", "b", "b", "ccccc" };
		// 1.문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요
		// 결과: 3
		// 2.모든 문자열의 길이를 더한 합을 구하세요
		// 결과: 13
		// 3.가장 길이가 짧은 문자열의 길이를 구하세요
		// 결과: 1
		// 4.중복을 제거한 리스트를 만드세요.
		// 결과: [aaa, b, ccccc]
		
		String[] arr = {"aaa", "aaa", "b", "b", "cccc"};
		
		Stream<String> stream1 = Arrays.stream(arr);
		long count = stream1.filter(s -> s.length() > 2).count();
		System.out.println("1: " + count);
		
		

	}

}
