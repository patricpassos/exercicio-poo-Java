package application;

import entities.ClientCo;

public class ComparacaoClientes {

	public static void main(String[] args) {
		
		ClientCo c1 = new ClientCo("Maria", "maria@gmail.com");
		ClientCo c2 = new ClientCo("bob", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
	}

}
