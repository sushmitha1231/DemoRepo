package day2;

public class Car {
String brand;
String model;
int price;
int taxamount;
boolean ispetrol;
int netprice=price+taxamount;
public void printCar() {
	System.out.println(brand+" "+model+" "+price+" "+taxamount+" "+ispetrol+" "+netprice);
}

}
