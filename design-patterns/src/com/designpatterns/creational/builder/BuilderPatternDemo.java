package com.designpatterns.creational.builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("256 GB", "8 GB")
				.setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		System.out.println("OP = " + computer.getHDD());
	}

}
