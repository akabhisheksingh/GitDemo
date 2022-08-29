package predicatesPackage;

import java.util.function.*;

public class Predicate2 {
	
	public static void main(String[] args) {
		int [] x= {0,1,2,5,10,20,25,30};
		Predicate<Integer>p1= i->i>10;
		System.out.println("numbers are greater than 10");
		m1(p1,x);
		
		Predicate<Integer>p2=i->i%2==0;
		System.out.println("Even numbers are:");
		m1(p2,x);
		System.out.println("Greater than 10 and Even");
		m1(p1.and(p2),x);
		
		
	}
	public static void m1(Predicate<Integer>p, int []x) {
		for(int x1:x) {
			if(p.test(x1))
				System.out.println(x1);
		}
		
	}

}
