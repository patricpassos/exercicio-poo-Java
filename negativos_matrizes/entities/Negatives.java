package entities;

public class Negatives {

	private Integer rows;
	private Integer columns;
	private int[][] mat;

	public Negatives(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		this.mat = new int[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setElement(int rows, int columns, int element) {
		mat[rows][columns] = element;
	}

	public int negativeQuantity() {
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		return count;
	}

	public int[] negativeValues() {
		int sizeVet = negativeQuantity();
		int[] negative = new int[sizeVet];

		int k = 0; // controle de posição para o veto negative
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					negative[k] = mat[i][j];
					k++;
				}
			}
		}
		return negative;
	}

}
