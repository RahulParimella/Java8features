package examples;

interface Rahul{
	abstract void name(String msg);
	
}
public class FunctionalInterface1 implements Rahul {
public static void main(String[] args) {
	FunctionalInterface1 f1=new FunctionalInterface1();
	f1.name("spy");
}

@Override
public void name(String msg) {
	// TODO Auto-generated method stub
	System.out.println(msg);
}
}
