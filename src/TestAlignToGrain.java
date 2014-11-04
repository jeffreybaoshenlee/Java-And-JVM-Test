public class TestAlignToGrain {
	public static void main(String[] args) {
		System.out.println(align2grain(217, 1));
		System.out.println(align2grain(217, 2));
		System.out.println(align2grain(217, 4));
		System.out.println(align2grain(217, 8));
		System.out.println(align2grain(217, 16));
		System.out.println(align2grain(217, 32));
		System.out.println(align2grain(217, 64));
	}

	public static int align2grain(int i, int grain) {
		return ((i + grain - 1) & ~(grain - 1));
	}
}