public class MultidimensionalArray {
	private static final int[][] values = { { 1, 2, 3 }, { 4, 5 },
			{ 6, 7, 8, 9 } };

	public static void main(String[] args) {
		MultidimensionalArray multidimensionalArray = new MultidimensionalArray();
		multidimensionalArray.create3DArray();
		multidimensionalArray.createFixed3DArray();
		multidimensionalArray.create2DArray();
	}

	int[][][] create3DArray() {
		int grid[][][];
		grid = new int[10][5][];
		return grid;
	}

	int[][][] createFixed3DArray() {
		int[][][] grid = new int[10][20][30];
		return grid;
	}

	int[][] create2DArray() {
		System.out.println(values);
		return values;
	}
}