package program;

public class Pattern11 {
public static void main(String[] args) {
	int n=5;
	for(int i=n;i>=1;i--)
	{
		for(int j=0;j<n-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=0;k<2*i-1;k++)
		{
			System.out.print(2*i-1);
		}
		System.out.println();
	}
}
}
