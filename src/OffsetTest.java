public class OffsetTest {
	public static void main(String[] args) {
		new OffsetTest().testGoto();
	}
	
	public void testGoto(){
		int a=1;
		if (a>1){
			System.out.println("a is bigger than 1.");
		}else{
			System.out.println("a is less than or equal to 1.");
		}
	}
}