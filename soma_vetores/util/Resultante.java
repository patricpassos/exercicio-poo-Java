package util;

public class Resultante {

	private int[] vetA;
	private int[] vetB;
	private int[] vetC;

	public Resultante(int n) {
		this.vetA = new int[n];
		this.vetB = new int[n];
		this.vetC = new int[n];
	}

	public void setElementoA(int index, int elementoA) {
		vetA[index] = elementoA;
	}

	public void setElementoB(int index, int elementoB) {
		vetB[index] = elementoB;
	}

	public void somaVetores() {
		for (int i = 0; i < vetC.length; i++) {
			vetC[i] = vetA[i] + vetB[i];
		}
	}

	public int[] somaResultante() {
		return vetC;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("VETOR RESULTANTE\n");
		for(int s : vetC) {
			sb.append(s + "\n");
		}
		
		return sb.toString();
	}

}
