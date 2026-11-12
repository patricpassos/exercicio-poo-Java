package application;

import entities.Desktop;
import entities.Software;

public class ProgramDesktop {

	public static void main(String[] args) {
		
		
		try {
			Desktop desktop = new Desktop("Acer", "Intel Core i5", "Linux", 8, 64);
			desktop.setRamSize(16);
			desktop.setgetOperatingSystem("windows");
			System.out.println(desktop);
			
			
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
