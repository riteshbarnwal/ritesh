package program;

public class SmallestLengthString {
    public static void main(String[] args) {
		String s1="what about Ritesh aim";
		String[] s2=s1.split(" ");
		String small=s2[0];
		for(int i=0;i<s2.length;i++)
		{
		  if(s2[i].length()<s2[0].length())
			  small=s2[i];
		}
		System.out.println(small);
	}
		
}
