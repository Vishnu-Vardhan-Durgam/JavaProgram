package day1;

import java.util.*;

public class FirstProgram {

	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("before swapping a="+a+" and b="+b);	
		a=(a+b)-(b=a);
		System.out.println("after swapping : a="+a+" and b="+b);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		System.out.println(list);
		
		Set set=new HashSet<Integer>(list);
		System.out.println(set);		
	}
}



// https://demo.opencart.com/en-gb?route=account/login ===>> OpenCart
