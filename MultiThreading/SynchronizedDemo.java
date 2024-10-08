package MultiThreading;
class Myclass implements Runnable{
	private static boolean flag=true;
	
	public synchronized  void printEven() {
		long id=Thread.currentThread().getId();
		for(int i=2;i<20;i+=2) {
			System.out.println(i+"even id is "+id);
		}
	}
	public   synchronized  void printOdd() {
		long id=Thread.currentThread().getId();
		for(int i=1;i<20;i+=2) {
			System.out.println(i+"odd "
					+ " is "+id);
	} 
	}
	public void run() {
		if(flag==true) {
			flag=false;
			printEven();
		}else {
			printOdd();
		}
	}
}
public class SynchronizedDemo {

	public static void main(String[] args) {
		Myclass myclass=new Myclass();
		Thread eventh1=new Thread (myclass);
		Thread oddth2=new Thread (myclass);
		
		eventh1.start(); //will call run() method
		oddth2.start(); //will call run() method
		
		
	}

}
