package examples;

public class Factors {
	public static void main(String[] args) {
		int n=6;
		System.out.println("factors of a number are:"+n);
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
}
