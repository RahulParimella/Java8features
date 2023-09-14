package examples;

interface mobile{
	void oneplus();
}
public class MethodReference1{
	public static void oneplus5T() {
		System.out.println("oneplus 5T");
	}
	public static void main(String[] args) {
		mobile m =MethodReference1 :: oneplus5T;
		m.oneplus();
		
	}
	
}
