public class MultidimensionalArray {
	public static void main(String[] args) {
		new MultidimensionalArray().create3DArray();
	}

	int[][][] create3DArray() {
		int grid[][][];
		grid = new int[10][5][];
		return grid;
	}
}