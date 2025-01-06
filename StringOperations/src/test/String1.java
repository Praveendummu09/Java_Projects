package test;

import java.util.Arrays;

public class String1 {

	public static void main(String[] args) {
		// Creating String without object creation(String pool Memory)
		String s1="Hello";
		String s2="Hello";
		// Creating String with object creation(String pool Memory)
		String s3=new String("Hello");  //102ff
		String s4=new String("Hello"); //102ff
		String s5="Hello hai how are you";
		//Comparing their address
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		//Comparing their text
		System.out.println(s1.equalsIgnoreCase(s4));
		// print each word
		System.out.println(Arrays.toString(s5.split(" ")));
		System.out.println(s5.split(" ").length);
		
		//Conversion
		String s6="145";
		int in=Integer.valueOf(s6);
		System.out.println(in);
		System.out.println(((Object)in).getClass());//getName());
	    int in1=124;
	    System.out.println(String.valueOf(in1));
		System.out.println(((Object)String.valueOf(in1)).getClass());
	    //total number of occurrence of char
	    System.out.println(s5.lastIndexOf("o"));
	    System.out.println(s5.indexOf('o', 5));
	    System.out.println(s5.startsWith("He"));
	    System.out.println(s5.toUpperCase().replace('H', 'Y'));
	    System.out.println(s2.isBlank());
	}

}

