package day2;

public class UseBus {
	public static void main(String[] args) {
		Bus b1 = new Bus();
		b1.brand = "hyundai";
		b1.price = 1700;
		String x= b1.colour();
		int y= b1.speed(200);
		 b1.rating();
		b1.type("public");
		System.out.println(b1.brand);
		System.out.println(b1.price);
		System.out.println(x);
		System.out.println(y);
		
	}
}

