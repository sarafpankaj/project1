
public class MyThread {
	
	
	
	public static void main(String args []) {
		Thread t1 =new Thread(() ->{
			for(int i=0; i<5;i++) {
				System.out.println("Pankaj");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	});

	Thread t2 = new Thread(() ->{
		for(int i=0; i<5;i++) {
			System.out.println("Saraf");try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	
	

		t1.start();
	
		t2.setPriority(4);
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("t1 priority "+t1.getPriority());
		System.out.println("t2 priority "+ t2.getPriority());
	}
}
