package test;

public class OddEvenWords {

	public static void main(String[] args) {
		String str1="Hello Praveen hai dude how do you";
		String[] word=str1.split(" ");
		String Modifies="";
		for(int i=0;i<=word.length-1;i++)
		{
			String words=word[i];
			if(i%2==0)
			{
				words=reverseWord(words);
			}
			else
			{
				words=words.toUpperCase();
			}
			Modifies=Modifies+words+" ";
		}
		System.out.println("Modifies :"+Modifies);
	}
	public static String reverseWord(String word)
	{
		String s1="";
		for(int j=word.length()-1;j>=0;j--)
		{
			s1=s1+word.charAt(j);
		}
		return s1;
	}

}
