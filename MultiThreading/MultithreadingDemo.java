package MultiThreading;

class Demo {
	public void fun1() {
		System.out.println("this is fun1");
	}

	public void fun2() {
		System.out.println("this is fun2");
	}
}

class Multithread extends Thread {
	// ch //parent
	Demo demo1 = new Demo();

	public void run() {

		demo1.fun1();
		demo1.fun2();

		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		System.out.println("Id is" + id);
		System.out.println("Thread name is " + name);
	}
}

public class MultithreadingDemo {

	public static void main(String[] args) {
//		Multithread thread1=new Multithread();
//		thread1.start(); //will call run() method
//		thread1.setPriority(3);
//		
//		Multithread thread2=new Multithread();
//		thread2.start();
//		thread2.setPriority(2);
//		
//		Multithread thread3=new Multithread();
//		thread3.start();
//		thread3.setPriority(1);
//instead of this many time thread writing use for loop		

		for (int i = 0; i < 7; i++) {
			Multithread thread1 = new Multithread();
			thread1.start();

		}
	}

}
