package JavaFunctionalInterface;




interface example{  
     default void run(){  
        System.out.println("im running");  
    }  
     
}  

interface Sayable extends example{  
    void say(String msg);   // abstract method  
}  
public class FunctionalInterface implements Sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	FunctionalInterface fie = new FunctionalInterface();  
        fie.say("Hello there");  
        fie.run();  
    }  
}  

