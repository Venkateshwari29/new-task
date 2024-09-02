package org.excep;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class SchoolTeacher {

	public static void main(String[] args)  {
		
		//unchecked Arithmetic error
		
		System.out.println(1);
		System.out.println(2);
		System.out.println("a");
		System.out.println(8/5);
		try {
		System.out.println(5);
		
     		try {
			String y = "87jg";
			System.out.println(y.charAt(5));
		} 
     		
     		catch (StringIndexOutOfBoundsException p) {
    			System.out.println("CharIndex mismatch");
    		}
     		catch (RuntimeException e) {
    			System.out.println("character not found");
    			}
     		finally {
				System.out.println("inner code");
			}
		}
		
		catch (ArithmeticException e) {
			System.out.println("any number divided by 0");
		
		}
		finally {
			System.out.println("Arith excp created");
		}
		System.out.println(3);
		
		// StringIndexOutOfBound exception
//		
//		String r = "hunter9";
//		char charAt = r.charAt(9);
//		System.out.println(charAt);
		
		//null pointer exception
		
//		String t = null;
//		System.out.println(t.charAt(2));
		
		//ArrayIndexOutOfBound
		//Datatype varref [] = new Datatype (length);
		
//		int g[] = new int [3];
//		
//		g[0] = 25;
//		g[1] = 64;
//		g[2] = 7;
//		
//		System.out.println(g[3]);
		
		//IndexOutOfBound
		
//		List o = new LinkedList();
//		
//		o.add("pot");
//		o.add("cow");
//		o.add("dog");
//		
//		System.out.println(o.get(5));
		
		// Input mismatch excep
//		Scanner k = new Scanner (System.in);
//		System.out.println("is he Indian ?");
//		
//		System.out.println(k.nextBoolean());
		
		
		// number format exception
		
//		String m = "galilio";
//		System.out.println(m + 20);
//		
//		int int1 = Integer.parseInt(m);
//		System.out.println(int1 + 2);
		
		// Complie exception
		
//		System.out.println(1);
//		Thread.sleep(2000);
//		System.out.println(2);
	}
	
	
	
}
