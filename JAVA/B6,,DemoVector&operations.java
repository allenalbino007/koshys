package VectorDemo;
import java.util.*;
public class VectorDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		   v.add("C");
		   v.add("c++");
		   v.add("Java");
		   v.add("VB6");

		   System.out.println("Intially the vector contents"+v.toString());
		   System.out.println("The last element :"+ v.lastElement());
		   System.out.println("The Element at Second position :"+ v.elementAt(2));
		   

		  v.insertElementAt("Python",1);
		  v.insertElementAt("c#",0);
		  System.out.println("After inserting contents"+v.toString());   

		  v.removeElementAt(3);
		  System.out.println("After removing element at 3 the contents are " + v.toString());

		  v.setElementAt("c++",1);
		  v.remove("VB6");
		     System.out.println(" After removing VB the vector contents"+v.toString());

	}

}
