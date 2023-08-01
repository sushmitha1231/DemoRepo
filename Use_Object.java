package day2;

public class Use_Object {
	public static void main(String[] args) {
		Objectmarker m1 = new Objectmarker();
		m1.colour = "black";
		m1.height = 10;
		m1.weight = 5;
		m1.brand = "camlin";
		m1.price = 50;
		m1.printObjectmarker();
		
		
//		System.out.println(m1.colour);
//		System.out.println(m1.height);
//		System.out.println(m1.weight);
//		System.out.println(m1.brand);
//		System.out.println(m1.price);

		Objectmarker m2 = new Objectmarker();
		m2.colour = "black";
		m2.height = 500;
		m2.weight = 50;
		m2.brand = "natraj";
		m2.price = 50;
//		System.out.println(m2.colour);
//		System.out.println(m2.height);
//		System.out.println(m2.weight);
//		System.out.println(m2.brand);
//		System.out.println(m2.price);
		m2.printObjectmarker();

		Objectmarker m3 = new Objectmarker();
		m3.colour = "black";
		m3.height = 70;
		m3.weight = 15;
		m3.brand = "absara";
		m3.price = 100;
//		System.out.println(m3.colour);
//		System.out.println(m3.height);
//		System.out.println(m3.weight);
//		System.out.println(m3.brand);
//		System.out.println(m3.price);
		m3.printObjectmarker();

	}
}
