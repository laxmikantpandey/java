import java.util.*;
class triangle
{
	public static void main(String args[])
	{
		int m, i, k, number=1, j;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows : ");
		m = scan.nextInt();
		
		for(i=0;i<m;i++)
		{
			for(k=m; k>i; k--)
			{
				System.out.print(" ");
			}
            number = 1;
			for(j=0;j<=i;j++)
			{
				 System.out.print(number+ " ");
                 number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}

	}
}