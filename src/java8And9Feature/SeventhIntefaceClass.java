package java8And9Feature;

public class SeventhIntefaceClass {
	int x =777; 
	public void m2()
	{
		SeventhInterf st =()->{
			int x =888; 
			System.out.println(x+"----"+"local variable");
			System.out.println(this.x);
		};
		st.m1();
	}
	
	public static void main(String[] args) {
		SeventhIntefaceClass st= new SeventhIntefaceClass(); 
		st.m2();
		st.m3();
	}
	
	public void m3() {
		int y=10; 
		SeventhInterf st1= ()->{
			System.out.println(x);
		   // System.out.println(y);
			x=999;
			//y=1111; 
			int x =1111; 
			System.out.println(x);
			System.out.println(this.x);
		};
		st1.m1();
		y=666; 
		System.out.println(y+" ////--//"+"local variable");
	}

}
