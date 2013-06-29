package org.vld.prx;

import java.util.*;

public class Main
{
	
	Collection<?> col = new LinkedList<String>();
	
	public void call(String m)
	{
		System.out.println("string");
	}
	
	public void call(Object o)
	{
		
		System.out.println("object");
	}
	
	public static void main(String ... s)
	{
		System.out.println(12345 + 5432l);
		new Main().call("mama");
		
		new Main().call("Father");
		
	}
}