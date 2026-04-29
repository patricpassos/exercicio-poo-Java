package application;

import entities.ComboDevice;

public class ProgramDevice {

	public static void main(String[] args) {
		
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		System.out.println("Scan result: " + c.scan());
		c.print("My dissertation");
		

	}

}
