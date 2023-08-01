	package day2;

public class UseCar {
	public static void main(String[] args) {

		Car c1 = new Car();
		c1.brand = "hyundai";
		c1.model = "creta";
		c1.price = 170000;
		c1.taxamount = 2000;
		c1.netprice = c1.price + c1.taxamount;
		c1.ispetrol = true;

		Car c2 = new Car();
		c2.brand = "hyundai";
		c2.model = "crista";
		c2.price = 200000;
		c2.taxamount = 3000;
		c2.netprice = c2.price + c2.taxamount;
		c2.ispetrol = false;

		Car c3 = new Car();
		c3.brand = "Rolls Roys";
		c3.model = "panthor";
		c3.price = 300000;
		c3.taxamount = 5000;
		c3.netprice = c3.price + c3.taxamount;
		c3.ispetrol = true;
		c1.printCar();
		c2.printCar();

//		System.out.println(c1.brand+"\n"+c1.price+"\n"+c1.model+"\n"+c1.taxamount+"\n"+c1.netprice+"\n" +c1.ispetrol);
		

//		System.out.println(c2.brand);
//		System.out.println(c2.model);
//		System.out.println(c2.price);
//		System.out.println(c2.taxamount);
//		System.out.println(c2.netprice);
//		System.out.println(c2.ispetrol);
//
//		System.out.println(c3.brand);
//		System.out.println(c3.model);
//		System.out.println(c3.price);
//		System.out.println(c3.taxamount);
//		System.out.println(c3.netprice);
//		System.out.println(c3.ispetrol);

	}

}
