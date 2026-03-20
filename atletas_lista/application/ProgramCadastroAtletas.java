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
		
		int i = 0;
		char respCadastro = 'S';
		while(respCadastro == 'S') {
			
			System.out.printf("Cadastro Atleta %d°\n", i + 1);
			System.out.print("Nome do Atleta: ");
			String nome = sc.nextLine();
			System.out.print("Data de nascimento (dd/mm/aaaa): ");
			String dataTexto = sc.next();
			LocalDate data = LocalDate.parse(dataTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("Genero (M/F): ");
			Character genero = sc.next().toUpperCase().charAt(0);
			
			Atletas atletas = new Atletas(nome, data, genero);
			
			char respModalidade = 'S';
			while(respModalidade == 'S') {
				System.out.print("\nModalidade (1-Corrida 2-Ciclismo 3-Triatlo): ");
				Integer modalidade = sc.nextInt();
				
				if(modalidade == 3) {
					atletas.addModalidades(modalidade);
					break;
				}
				
				atletas.addModalidades(modalidade);
				
				System.out.print("Adicionar outra modalidade para este atleta? (S/N): ");
                respModalidade = sc.next().toUpperCase().charAt(0);
			}
			
			listaCadastro.addLista(atletas);
			 System.out.println();
			 System.out.print("Cadastrar novo atleta? (S/N): ");
	         respCadastro = sc.next().toUpperCase().charAt(0);
	         sc.nextLine();
	         i++;
	         System.out.println();
		}
		
		System.out.println(listaCadastro);
		
		sc.close();

	}

}
