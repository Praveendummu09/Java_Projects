package test;
import java.util.*;
public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String s3=reverse(s1);
		System.out.println("Reverse String is  :"+ s3);
		sc.close();
		

	}
	public static String reverse(String str)
	{
		String[] s2=str.split(" ");
		String reversed="";
		for (int i=0; i<=s2.length-1; i++)
		{
			for(int j=s2[i].length()-1;j>=0;j--)
			{
				reversed = reversed+s2[i].charAt(j);
			}
			reversed=reversed+" ";
		}
		return reversed.trim();
		
	}

}
