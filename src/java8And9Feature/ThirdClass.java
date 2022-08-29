package java8And9Feature;

public class ThirdClass {
	ThirdInterface th=	(a,b)->{
		int mul =a*b;
	return mul;
	};
	
	public static void main(String[] args) {
		
		ThirdClass t = new ThirdClass();
		int c =t.th.test(10,20);
		System.out.println(c);
	}

}
