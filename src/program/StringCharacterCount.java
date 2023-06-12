package program;

import java.util.Scanner;

public class StringCharacterCount {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String s1=sc.nextLine();
	int[] count=new int[122];
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		count[ch]++;
	}
	for(int i=0;i<count.length;i++)
	{
		if(count[i]>0)
		{
			System.out.println((char)i+"-------"+count[i]);
		}
	}
}
}
