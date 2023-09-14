package examples;

public class CopyConstructor
{  
private double fprice;  
private String fname;  
//constructor to initialize roll number and name of the student  
CopyConstructor(double fPrice, String fName)  
{   
fprice = fPrice;  
fname = fName;  
}  
//creating a copy constructor  
CopyConstructor(CopyConstructor fruit)  
{  
System.out.println("\nAfter invoking the Copy Constructor:\n");  
fprice = fruit.fprice;  
fname = fruit.fname;  
}  
//creating a method that returns the price of the fruit  
double showPrice()  
{  
return fprice;  
}  
//creating a method that returns the name of the fruit  
String showName()  
{  
return fname;  
}  
//class to create student object and print roll number and name of the student  
public static void main(String args[])  
{  
	CopyConstructor f1 = new CopyConstructor(399, "Ruby Roman Grapes");  
System.out.println("Name of the first fruit: "+ f1.showName());  
System.out.println("Price of the first fruit: "+ f1.showPrice());  
//passing the parameters to the copy constructor  
CopyConstructor f2 = new CopyConstructor(f1);  
System.out.println("Name of the second fruit: "+ f2.showName());  
System.out.println("Price of the second fruit: "+ f2.showPrice());  
}  
}  
