public class ArrayTest {
	private static int[][] array={
			{1,2,5,9,10},
			{}
	};
	
	public static void main (String... args){
		System.out.println(array);
		
		int[][][] myArr1=new int[8][][];
		int[][][] myArr2=new int[1][9][];
		System.out.println(myArr1.getClass());
		System.out.println(myArr2.getClass());
	}
}