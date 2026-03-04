package entities;

public class Matrices {

	private int row;
	private int column;
	private int[][] matA;
	private int[][] matB;
	private int[][] matSum;
	private int[][] matSubtraction;

	public Matrices(int row, int column) {
		this.row = row;
		this.column = column;
		this.matA = new int[row][column];
		this.matB = new int[row][column];
		this.matSum = new int[row][column];
		this.matSubtraction = new int[row][column];
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public void setMatrixA(int row, int column, int element) {
		matA[row][column] = element;
	}

	public void setMatrixB(int row, int column, int element) {
		matB[row][column] = element;
	}

	public void sum() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matSum[i][j] = matA[i][j] + matB[i][j];
			}
		}
	}
	
	public void subtraction() {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				matSubtraction[i][j] = matA[i][j] - matB[i][j];
			}
		}
	}

	public int[][] sumMatrix() {
		return matSum;
	}
	
	public int[][] subtractionMatrix() {
		return matSubtraction;
	}

}
