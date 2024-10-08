package MultiThreading;

class multithread2 implements Runnable {

	public void fun1() {
		System.out.println("this is fun1");
	}

	public void fun2() {
		System.out.println("this is fun2");
	}

	public void run() {
		fun1();
		fun2();
		System.out.println("Id is" + Thread.currentThread().getId());
		System.out.println("Thread name is " + Thread.currentThread().getName());

	}

}

public class multithreadingDemo2 {
	public static void main(String[] args) {
	//	multithread2 obj1 = new multithread2();
	//	Thread th1 = new Thread(obj1);
//		th1.setPriority(7);
//		th1.start();
//
//		multithread2 obj2 = new multithread2();
//		Thread th2 = new Thread(obj2);
//		th2.setPriority(8);
//		th2.start();
//
//		multithread2 obj3 = new multithread2();
//		Thread th3 = new Thread(obj3);
//		th3.start();

for(int i=0;i<7;i++){
	multithread2 thread1 = new multithread2 ();
	Thread th1 = new Thread(thread1);
	th1.start();
	
}

	}
}
