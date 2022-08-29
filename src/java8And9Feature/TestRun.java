package java8And9Feature;

public class TestRun {
	public static void main(String[] args) {
		Runnable rt =  new MyThread();
		Thread th = new Thread(rt); 
		th.start();
		for(int i =0;i<=10; i++)
		{
			System.out.println("Main Thread");
		}
	}

}
