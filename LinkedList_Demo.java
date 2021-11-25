
/*Assignment - 2:
Write a java program and represent the following elements in LinkedList object.
Java, Angular, ReactJS, JavaScript, Python.
Iterate one by one element using for-each loop and ListIterator cursor.*/

import java.util.*;

public class LinkedList_Demo {

	
  public static LinkedList Programming_Languages() {
			LinkedList ll = new LinkedList();
			ll.add("JAVA");
			ll.add("ANGULAR");
			ll.add("REACT JS");
			ll.add("JAVASCRIPT");
			ll.add("PYTHON");
			
			return ll;}
		
	public static void main(String[] args) {
		
		LinkedList ll=  LinkedList_Demo.Programming_Languages();
		System.out.println("LinkedList Representation Using For-Each Loop");
		System.out.println("============================");
		
		for (Object o : ll) {
			System.out.println(o);
		}
		   ListIterator Litr = ll.listIterator();
	       System.out.println("============================");
	       System.out.println("LinkedList Representation Using List_Iteratorr");
	       System.out.println("============================");
	       while(Litr.hasNext()) {
	    	   System.out.println(Litr.next());
	       }

	}

}
