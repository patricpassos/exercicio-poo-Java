package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Atletas;
import services.OperacaoAtletas;

public class ProgramCadastroAtletas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		OperacaoAtletas listaCadastro = new OperacaoAtletas();
		
		System.out.print("Nome do Atleta: ");
		String nome = sc.nextLine();
		System.out.print("Data de nascimento (dd/mm/aaaa): ");
		String dataTexto = sc.next();
		LocalDate data = LocalDate.parse(dataTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Genero (M/F): ");
		Character genero = sc.next().toUpperCase().charAt(0);
		System.out.print("Modalidade \n1-Corrida \n2-Ciclismo \n3-Triatlo\n");
		Integer modalidade = sc.nextInt();
		
		Atletas a = new Atletas(nome, data, genero, modalidade);
		listaCadastro.addLista(a);
		
		sc.close();

	}

}
