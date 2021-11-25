
/*Assignment - 1:
Write a java program and represent the following elements in ArrayList object.
Java, Angular, ReactJS, JavaScript, Python .
Iterate one by one element using for-each loop and ListIterator cursor.*/

import java.util.*;
public class Arraylist_Demo {
	public static ArrayList Programming_Languages() {
		ArrayList a = new ArrayList();
		a.add("JAVA");
		a.add("ANGULAR");
		a.add("REACT JS");
		a.add("JAVASCRIPT");
		a.add("PYTHON");
		
		return a;
	}

	public static void main(String[] args) {
		ArrayList a = Arraylist_Demo.Programming_Languages();
		System.out.println("ArrayList Representation Using For-Each Loop");
		System.out.println("============================");
		for(Object o : a) {
			System.out.println(o);
		}
		
       ListIterator Litr = a.listIterator();
       System.out.println("============================");
       System.out.println("ArrayList Representation Using List_Iteratorr");
       System.out.println("============================");
       while(Litr.hasNext()) {
    	   System.out.println(Litr.next());
       }
	}

}
