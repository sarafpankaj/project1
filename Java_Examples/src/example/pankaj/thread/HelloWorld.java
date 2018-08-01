package example.pankaj.thread;



public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintHelloWorld printHelloWorld = new PrintHelloWorld();

		Thread helloThread = new Thread(new HelloThread(printHelloWorld));
		helloThread.setName("Hello");

		Thread worldThread = new Thread(new WorldThread(printHelloWorld));
		worldThread.setName("World");

		worldThread.start();
		helloThread.start();

	}

}