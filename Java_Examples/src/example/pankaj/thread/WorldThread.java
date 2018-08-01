package example.pankaj.thread;

public class WorldThread implements Runnable {
	PrintHelloWorld printHelloWorld = null;

	public WorldThread(PrintHelloWorld printHelloWorld) {
		this.printHelloWorld = printHelloWorld;
	}

	public void run() {

		int count = 0;
		while (count < 10) {
			printHelloWorld.printWorld();
			count++;
		}
	}
}