package program;

public class Pattern3 {
public static void main(String[] args) {
	int m=1;
	char ch='A';
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(i%2==0)
				System.out.print(m+" ");
			else
			System.out.print(ch+" ");	
		}
		System.out.println();
		if(i%2==0)
			m++;
		else
			ch++;
	}
}
}
