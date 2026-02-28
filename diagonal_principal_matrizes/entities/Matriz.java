package entities;

public class Matriz {
	
	private int n; //define a ordem da matriz
	private int [][] dados; // define a estrutura da matriz (matriz)
	
	public Matriz(int n) {
		this.n = n; 
		this.dados = new int[n][n]; 
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void setValor(int linha, int coluna, int elemento) { //metodo para insetir os valores da matriz
        dados[linha][coluna] = elemento;
    }
	
	 public int[] getDiagonalPrincipal() { 
		 	//intanciado um vetor no heap temporario "RECIPIENTE" com o objetivo de de guarda-los
	        int[] diagonal = new int[n]; 
	        for (int i = 0; i < n; i++) {
	            diagonal[i] = dados[i][i]; //diagonal recebe os valores da diagonal principal do objeto
	        }
	        return diagonal; //envia o endereço de memoria do vetor
	    }
	
	
}
