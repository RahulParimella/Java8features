package features;


//No static methods so object is created to invoke a method 
//class Adder{  
//public int add(int x,int b)
//{
//	return x+b;
//	}  
//public int add(int x,int b,int c){
//	return x+b+c;
//	}  
//}  
//public class TestOverloading{  
//public static void main(String[] args){ 
// Adder a =new Adder();
//System.out.println(a.add(1,1));
//System.out.println(a.add(1,1,1)); 
//}
//}  




//static method is used so no need to create object directly we can invoke class
class Adder{  
static int add(int x,int b)
{
	return x+b;
	}  
static int add(int x,int b,int c){
	return x+b+c;
	}  
}  
public class TestOverloading{  
public static void main(String[] args){ 
  System.out.println(Adder.add(1, 10));
  System.out.println(Adder.add(1, 10,11));
}
} 
