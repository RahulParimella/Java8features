package features;

interface runnable{
	void say(String s);
}
public class FI1 implements runnable {
	public void say(String s) {
		System.out.println(s);
	}
	public static void main(String args[]) {
	FI1 fi=new FI1();
	fi.say("Hello there");
	}
}
