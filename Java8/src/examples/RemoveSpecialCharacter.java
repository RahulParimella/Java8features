package examples;

public class RemoveSpecialCharacter {
public static void main(String[] args) {
	String str ="@lenovo";
	String str2="";
	String str1=str.replaceAll("[^a-zA-Z0-9]+", "");
	
	System.out.println(str1);
	System.out.println("----------");
	

}
}
