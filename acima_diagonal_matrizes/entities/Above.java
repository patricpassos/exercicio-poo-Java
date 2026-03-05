package entities;

public class Above {
	
	private int order;
	private int[][] mat;
	
	public Above(int order) {
		this.order = order;
		this.mat = new int[order][order];
	}
	
	public int getOrder() {
		return order;
	}
	
	public void setElement(int row, int column, int element) {
		mat[row][column] = element;
	}

	
	public int sumAboveDiagonal() {
		int sum = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = i + 1; j < mat[i].length; j++) {
				sum += mat[i][j]; 
			}
		}
		return sum;
	}
	

}
