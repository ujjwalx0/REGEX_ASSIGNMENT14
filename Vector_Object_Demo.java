
/*Write a java program and represent the following elements in Vector object.
Java, Angular, ReactJS, JavaScript, Python.
Iterate one by one element using for-each loop and Enumerator cursor*/
import java.util.*;
public class Vector_Object_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		for(int i=0;i<5;i++) {
			System.out.println("Enter the element at index "+(i+1));
			String s= sc.nextLine();
			v.addElement(s);
		}
		System.out.println("VectorList Representation Using For-Each Loop");
		System.out.println("============================");
		for (Object o: v) {
			System.out.println(o);
		}
		System.out.println("===================================");
		System.out.println("Printing the elements using Enumaration");
		System.out.println("===================================");
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
		}

		

	}

}
