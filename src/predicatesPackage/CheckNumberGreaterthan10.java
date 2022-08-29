package predicatesPackage;
import java.util.function.*;

public class CheckNumberGreaterthan10{
	Interface1 it =(int i)->{
		if(i>10)
			return true; 
		else 
			return false; 
	};
	public static void main(String[] args) {
		CheckNumberGreaterthan10 ct = new CheckNumberGreaterthan10();
		boolean value=ct.it.check(2);
		System.out.println(value);
		boolean value2=ct.it2.check(202); 
		System.out.println(value2);
		Predicate<Integer> p=I->(I>10);
		System.out.println(p.test(25));
	}
	Interface1 it2=(i)->(i>10);

}
