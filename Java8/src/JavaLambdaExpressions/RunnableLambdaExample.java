package JavaLambdaExpressions;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method called..");
		
	}
	
}
public class RunnableLambdaExample {
	public static void main(String[] args) {
	Thread th=new Thread(new ThreadDemo());
	th.start();
	Runnable runnable =()->{
		System.out.println("run method called using lambda....");
	};
	Thread thread =new Thread(runnable);
	thread.start();
	}
}
