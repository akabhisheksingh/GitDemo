package java8And9Feature;

public class TestLeftRight implements Right,Left {

	public void m1() {
		Right.super.m1();
	}
	
	public static void main(String[] args) {
		TestLeftRight t = new TestLeftRight(); 
		t.m1();
	}
	
	

}
