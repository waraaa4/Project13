package stream;

import java.util.ArrayList;
import java.util.List;

public class Quiz4 {

	public static void main(String[] args) {

		List<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
		// 1번
		list.stream().map(s -> s.name).forEach(s -> System.out.println(s));
		
		System.out.println();
		
		// 2번
		int sum = list.stream().mapToInt(s -> s.budget).sum();
		System.out.println(sum);
		
		System.out.println();
		
		// 3번
		list.stream().filter(s -> s.age >= 20).sorted((s1, s2) -> {
			if(s1.age > s2.age) {
				return 1; // 양수면 s1.age가 뒤로 이동
			} else {
				return -1; // 음수면 s2.age가 뒤로 이동
			}
		}).forEach(s -> System.out.println(s.name + ", " + s.age));
		
		
		
	}

}

class Customer {
	
	String name;
	int age;
	int budget;
	
	public Customer(String name, int age, int budget) {
		super();
		this.name = name;
		this.age = age;
		this.budget = budget;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", budget=" + budget + "]";
	}
	
}