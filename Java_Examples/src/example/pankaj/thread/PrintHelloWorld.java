package example.pankaj.thread;

public class PrintHelloWorld {

	int count = 0;

	public synchronized void printHello() {
		while (count == 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Hello");
		count++;
		notifyAll();
	}

	public synchronized void printWorld() {
		while (count == 0) { 
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("World");
		count--;
		notifyAll();

	}
}