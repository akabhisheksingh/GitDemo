package java8And9Feature;

public class FirstProgram {
	public static void main(String[] args) {
		//Test t = new Test();
		
		FirstProgram ft = new FirstProgram(); 
		ft.t.demo();
		ft.t1.demo();
		
	}
	Test t = ()->{
		System.out.println("Hello");
	};
	Test t1=()->System.out.println("India");
	
}
