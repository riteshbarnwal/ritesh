package program;

public class Pattern8 {
public static void main(String[] args) {
    int n=7;
  	for(int i=1;i<=n;i++)
  	{
  		for(int j=0;j<n-i;j++)
  		{
  			System.out.print(" ");
  		}
  		for(int j=0;j<i;j++)
  		{
  			System.out.print("*");
  		}
  		System.out.println(); 
}
}
}
