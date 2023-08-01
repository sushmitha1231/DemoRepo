package day2;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1 = new Shirt();
		s1.brand = "tommy";
		s1.colour = "black";
		s1.price = 5000;
		s1.discount = 50;
		s1.netprice = s1.price - (s1.price * s1.discount/ 100);
		System.out.println(s1.brand);
		System.out.println(s1.colour);
		System.out.println(s1.price);
		System.out.println(s1.discount);
		System.out.println(s1.netprice);
		
		s1.brand = "louis";
		s1.colour = "pink";
		s1.price = 7000;
		s1.discount = 1090;
		s1.netprice = s1.price - (s1.price * s1.discount/ 100);
		System.out.println(s1.brand);
		System.out.println(s1.colour);
		System.out.println(s1.price);
		System.out.println(s1.discount);
		System.out.println(s1.netprice);
		
		s1.brand = "otto";
		s1.colour = "yellow";
		s1.price = 17000;
		s1.discount = 1500;
		s1.netprice = s1.price - (s1.price * s1.discount/ 100);
		System.out.println(s1.brand);
		System.out.println(s1.colour);
		System.out.println(s1.price);
		System.out.println(s1.discount);
		System.out.println(s1.netprice);



	}
}
