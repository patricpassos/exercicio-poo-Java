package entities;

public class Line {

	private int order;
	private int[][] mat;

	public Line(int order) {
		this.order = order;
		this.mat = new int[order][order];
	}

	public int getOrder() {
		return order;
	}

	public void setElement(int rows, int columns, int element) {
		mat[rows][columns] = element;
	}

	public int[] majorElement() {
		int[] major = new int[order];

		for (int i = 0; i < mat.length; i++) {
			int k = mat[i][0];
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > k) {
					k = mat[i][j];
				}
			}
			major[i] = k;
		}
		return major;
	}

	public int[] mainDiagonal() {
		int[] main = new int[order];
		for (int i = 0; i < mat.length; i++) {
			main[i] = mat[i][i];
		}
		return main;
	}

	public int[] secondaryDiagonal() {
		int[] secondary = new int[order];
		for (int i = 0; i < mat.length; i++) {
			secondary[i] = mat[i][(order - 1) - i];
		}
		return secondary;
	}

}
