package JavaFunctionalInterface;




public class MyBooks implements Books {

	@Override
	public void readable(int a) {
		// TODO Auto-generated method stub
		System.out.println("My age is " +a);
	}
	public static void main(String[] args) {
		MyBooks b =new MyBooks();
		
		b.readable(22);
		
	}
	
	

}
