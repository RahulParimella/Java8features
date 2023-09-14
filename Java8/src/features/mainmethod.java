package features;
// can we overload main method(yes)
public class mainmethod {
	public static void main(String[] args)
	{
		System.out.println("main with String[]");
		}  
	public static void main(String args){
		System.out.println("main with String");
		}  
	public static void main(){
		System.out.println("main without args");
		}  
}
