package entities;

public class Operations {

	private int order;
	private double[][] mat;

	public Operations(int order) {
		this.order = order;
		this.mat = new double[order][order];
	}

	public int getOrder() {
		return order;
	}

	public void setElement(int row, int column, double element) {
		mat[row][column] = element;
	}

	public double sumPositives() {
		double sum = 0.0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > 0.0) {
					sum += mat[i][j];
				}
			}
		}
		return sum;
	}

	public double[] line(int row) {
		double[] lineMatrix = new double[order];

		for (int i = row; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				lineMatrix[j] = mat[row][j];
			}
		}
		return lineMatrix;
	}

	public double[] column(int column) {
		double[] columnMatrix = new double[order];

		for (int i = 0; i < mat.length; i++) {
			for (int j = column; j < mat[i].length; j++) {
				columnMatrix[i] = mat[i][column];
			}
		}
		return columnMatrix;
	}

	public double[] mainDiagonal() {
		double[] main = new double[order];

		for (int i = 0; i < mat.length; i++) {
			main[i] = mat[i][i];
		}
		return main;
	}

	public double[] secondaryDiagonal() {
		double[] secondary = new double[order];

		for (int i = 0; i < mat.length; i++) {
			secondary[i] = mat[i][(order - 1) - i];
		}
		return secondary;
	}

	public double[][] modified() {
		double[][] modified = new double[order][order];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > 0.0) {
					modified[i][j] = mat[i][j];
				} else {
					modified[i][j] = mat[i][j] * mat[i][j];
				}
			}
		}
		return modified;
	}

}
