package JavaLambdaExpressions;
  

interface Rahul{
	public abstract void run(String msg);
}
public class LambdaExp3 {  
    public static void main(String[] args) {  
    	
    	//without Lambda expressions
    	Rahul r =new Rahul(){

		 public void run(String msg) {
			// TODO Auto-generated method stub
			System.out.println(msg);
		}
       };
       r.run("rahul");
    }  
}  
