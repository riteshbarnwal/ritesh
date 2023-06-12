package program;

public class CountNumSum {
    public static void main(String[] args) {
		String s="abc2134kjej";
		char[] ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>'0' && ch[i]<'9')
			{
				int a=ch[i]-48;
				sum=sum+a;
			}
		}
		System.out.println(sum);
	}
}
