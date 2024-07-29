package stream;

import java.util.ArrayList;
import java.util.List;

public class Quiz3 {

	public static void main(String[] args) {

		// 리스트 생성
		List<Order> list = new ArrayList<Order>();
		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));
		
		// 1번
		list.stream().map(s -> s.orderNo).forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		// 2번
		int sum1 = list.stream().filter(s -> s.year == 2022)
				.mapToInt(s -> s.price).sum();
		System.out.print (sum1 + " ");
		
		long cont1 = list.stream().filter(s -> s.year == 2022).count();;
		System.out.print(cont1);
		
		System.out.println();
		
		// 3번 
		int sum2 = list.stream().filter(o -> o.year == 2023)
				.mapToInt(o -> o.price).sum();
		System.out.print(sum2 + " ");
		
		long count2 = list.stream().filter(o -> o.year == 2023).count();
		System.out.print(count2);
		
	}

}

class Order {
	
	int orderNo;
	int year;
	int price;
	
	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", year=" + year + ", price=" + price + "]";
	}
	
}