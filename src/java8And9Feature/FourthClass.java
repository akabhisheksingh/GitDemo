package java8And9Feature;

public class FourthClass {

	public static void main(String[] args) {
		FourthInterface ft = (t)->{
			int mul = t*t*t;
		return mul;	
		};
		
		int tf=ft.test2(2);
		System.out.println(tf);
		int tf1= ft.test2(5);
		System.out.println(tf1);
		}
	
	}

