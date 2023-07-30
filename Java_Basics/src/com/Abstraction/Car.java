package com.Abstraction;

public  class Car extends Government {

	@Override
	public void model() {
		// TODO Auto-generated method stub
		System.out.println("BMW");
	}

	@Override
	public void car_color() {
		// TODO Auto-generated method stub
		System.out.println("red");
	}

	@Override
	public void tyre_type() {
		// TODO Auto-generated method stub
		System.out.println("tube less");
	}

	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.engine();
		c.saftey();
		c.numberBoard();
		c.model();
		c.car_color();
		c.tyre_type();
	}
	
}
