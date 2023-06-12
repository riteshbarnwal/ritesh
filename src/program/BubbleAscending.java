package program;

import java.util.Arrays;

public class BubbleAscending {
public static void main(String[] args) {
	int[] a= {4,2,1,5,9,3,6,0};
	Arrays.sort(a);
	System.out.println("sorting"+Arrays.toString(a));
}
}
/*  System.out.println("before sorting "+Arrays.toString(a));
 	for(int i=0;i<a.length-1;i++)     // for no. of passes
	{
		for(int j=0;j<a.length-1;j++)    // for no. of iterations
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}			
		}
	}
	System.out.println("after sorting "+Arrays.toString(a));
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}*/
