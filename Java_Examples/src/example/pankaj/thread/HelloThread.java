package example.pankaj.thread;

public class HelloThread implements Runnable {
	PrintHelloWorld printHelloWorld = null;

	public HelloThread(PrintHelloWorld printHelloWorld) {
		this.printHelloWorld = printHelloWorld;
	}

	public void run() {

		int count = 0;

		while (count < 10) {
			printHelloWorld.printHello();
			count++;
		}
	}
}