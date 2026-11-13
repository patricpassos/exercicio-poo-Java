package application;

import entities.Desktop;
import entities.Software;

public class ProgramDesktop {

	public static void main(String[] args) {
		
		
		try {
			Desktop desktop = new Desktop("Acer", "Intel Core i5", "Linux", 8, 64, 650);
			desktop.upgradeRam(16);
			desktop.setOperatingSystem("windows");
			System.out.println(desktop);
			System.out.println("Estimate consumption: " + desktop.estimateEnergyConsumption(10.0, 8) + " Kwh");
			
			Software software = new Software("Sonora", "WINDOWS", 16, 32);
			System.out.println(software);
			
			boolean installationRequirements = desktop.isCompatible(software);
			System.out.println("Status: " + (installationRequirements ? "The hardware meets the installation specifications." : "The hardware does not meet the installation specifications."));
			
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		//Escreva um programa em Java onde a classe "Desktop" impeça a expansão da RAM além de um limite.
		//Escreva um programa em Java onde a classe "Desktop" inclua um método para verificar a compatibilidade do sistema com o software.
		//Escreva um programa em Java onde a classe "Desktop" permita aos usuários atualizar o processador apenas para modelos suportados.
		//Escreva um programa em Java onde a classe "Desktop" inclua um método para estimar o consumo de energia.

	}

}
