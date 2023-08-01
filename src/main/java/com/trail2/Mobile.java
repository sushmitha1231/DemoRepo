package com.trail2;

public class Mobile {
	private int id;
	private String brand;
	private String model;
	private String color;
	private int price;
	private int ram;
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price
				+ ", ram=" + ram + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Mobile(int id, String brand, String model, String color, int price, int ram) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.ram = ram;
	}

	
	
	
}
