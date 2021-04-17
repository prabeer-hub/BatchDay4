package com.see;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass c = 	new FinalClass();
		c.marks = 100;
		//System.out.println(c.marks);
		
		int x = 5;
		System.out.println(x);
		x +=3; //x = x+3;
		System.out.println(x);
		x -= 2;
		System.out.println(x);
		x++;
		System.out.println(x);
		x--;
		x %= 3;
		System.out.println(x);
		
		
		String article = "This is a test string for learning programming in JAVA";
		int u = article.length();
		u--;
		String h = "My string length id:" + Integer.toString(article.length());
		Integer.toString(u);
		
		System.out.println(h);
		System.out.println(article.charAt(u));
		System.out.println(article.codePointAt(2));
		//Replace
		//Strip
		//Split
		//indexOf
		u = 10;
		/*
		if(u > 20) {
			System.out.println("Length is too great");
		}else {
			System.out.println("Length is too small");
		}
		*/
		boolean k = h.contains("y");
		String t = (k) ? "It has y" : "it does't have y";
		System.out.println(t);
	}
	

}
