package program;

public class StringInitcap {
public static void main(String[] args) {
	String s1="how are you";
	String[] s2=s1.split(" ");
	for(int i=0;i<s2.length;i++)
	{
		for(int j=0;j<s2[i].length();j++)
		{
			char ch=s2[i].charAt(j);
			if(j==0)
			{
				ch=(char)(ch-32);
			}
			System.out.print(ch);
		}
		System.out.print(" ");
	}
}
}
