package test2;

//import java.io.*;
//import java.util.*;
import java.lang.*;
public class C {
	
	public static void main(String[] args)
{
		 Display object = new Display();
		 
	      // method invocation
	      object.display();

}
}
class Display {
	 
	   //Private nested or inner class 
	   protected class InnerDisplay {
	       void display() {
	         System.out.println("Private inner class method called");
	      }
	   }
	 
	   void display() {
	      System.out.println("Outer class (Display) method called");
	      // Access the private inner class
	      InnerDisplay innerDisplay = new InnerDisplay();
	      innerDisplay.display();
	   }
	}




