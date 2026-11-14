package application;

import entities.Desktop;
import entities.Software;

public class ProgramDesktop {
	
	public static void checkCompatibility(Desktop desktop, Software software) {
		boolean installationRequirements = desktop.isCompatible(software);
		String status = installationRequirements 
				? "The hardware meets the installation specifications." 
			    : "The hardware does not meet the installation specifications.";
		
		System.out.printf("Status: %s%n%n", status);
	}

	public static void main(String[] args) {
		
		try {
			Desktop desktop = new Desktop("Acer", "Intel_i5", "Linux", 8, 64, 650);
			desktop.upgradeRam(16);
			desktop.setOperatingSystem("windows");
			System.out.println(desktop);
			System.out.println("Estimate consumption: " + desktop.estimateEnergyConsumption(10.0, 8) + " Kwh\n");
			
			Software software = new Software("Sonora", "WINDOWS", 16, 32);
			System.out.println(software);
			
			checkCompatibility(desktop, software);
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Desktop desktop02 = new Desktop("Asus", "AMD_RYZEN_7", "Linux", 16, 64, 500);
			desktop02.upgradeProcessor("AMD_RYZEN_15");
			System.out.println(desktop02);
			System.out.println("Estimate consumption: " + desktop02.estimateEnergyConsumption(10.0, 8) + " Kwh\n");

			Software software02 = new Software("Music Perform", "Linux", 16, 32);
			System.out.println(software02);
			
			checkCompatibility(desktop02, software02);
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		//Escreva um programa em Java onde a classe "Desktop" impeça a expansão da RAM além de um limite.
		//Escreva um programa em Java onde a classe "Desktop" inclua um método para verificar a compatibilidade do sistema com o software.
		//Escreva um programa em Java onde a classe "Desktop" permita aos usuários atualizar o processador apenas para modelos suportados.
		//Escreva um programa em Java onde a classe "Desktop" inclua um método para estimar o consumo de energia.

	}

}
