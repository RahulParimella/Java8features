package examples;
interface thread{
	void run();
}
public class MethodReference2  {
	public static void ThreadStatus() {
		System.out.println("thread is running");
	}
public static void main(String[] args) {
	thread r =MethodReference2 ::ThreadStatus;
	r.run();
}
}
