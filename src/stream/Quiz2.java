package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Quiz2 {

	public static void main(String[] args) {

		// 리스트 생성
		String[] arr =  {"file1.txt", "file2.pdf", 
				"file3.txt", "file4.img", "file5.txt", "file6.img" };
		
		// 1번
		Stream<String> stream = Arrays.stream(arr);
		stream.filter(s -> s.endsWith("txt")).forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		// 2번
		Stream<String> stream2 = Arrays.stream(arr);
		long count1 = stream2.filter(s -> s.endsWith("txt")).count();
		System.out.print(count1 + " ");
		
		Stream<String> stream3 = Arrays.stream(arr);
		long count2 = stream3.filter(s -> s.endsWith("pdf")).count();
		System.out.print(count2 + " ");
		
		Stream<String> stream4 = Arrays.stream(arr);
		long count3 = stream4.filter(s -> s.endsWith("img")).count();
		System.out.print(count3 + " ");
		
		System.out.println();
		
		// 3번
		Stream<String> stream5 = Arrays.stream(arr);
		stream5.map(s -> {
			String[] strArr = s.split("\\."); 
			return strArr[1];
		}).distinct().forEach(s -> System.out.print(s + " "));
		
		
		
	}

}
















