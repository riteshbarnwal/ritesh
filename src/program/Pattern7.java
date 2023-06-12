package program;

public class Pattern7 {
public static void main(String[] args) {
    int n=5;
  	for(int i=0;i<n;i++)
  	{
  		for(int j=0;j<n;j++)
  		{
  			if(i==j)
  					System.out.print((char)(i+65));
  			else
  				System.out.print(j+i+2);
  		}
  		System.out.println();
}
}
}
