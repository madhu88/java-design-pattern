package com.designpatterns.creational.builder;

public class Computer {
	
	//required parameters
	private String HDD;
	private String RAM;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	private Computer(ComputerBuilder computerBuilder) {
		this.HDD = computerBuilder.HDD;
		this.RAM = computerBuilder.RAM;
		this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
	}
	
	public static class ComputerBuilder {
		 private String HDD;
		 private String RAM;
		 
		 private boolean isGraphicsCardEnabled;
		 private boolean isBluetoothEnabled;
		 
		 public ComputerBuilder(String pHDD, String pRAM) {
			 this.HDD = pHDD;
			 this.RAM = pRAM;
		 }
		 
		 public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;			
		 }
		 public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			 this.isBluetoothEnabled = isBluetoothEnabled;
			 return this;
		 }
		 public Computer build() {
			 return new Computer(this);
		 }		 		 
	}
	
	public String getHDD() {
		return HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	
	
	
}
