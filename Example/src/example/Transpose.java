package example;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and columns");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr1[][]=new int[a][b];
		int tran[][]=new int[b][a];
		int i,j;
		System.out.println("enter values:");
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
	
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				tran[i][j]=arr1[j][i];
				System.out.print(tran[i][j]+" ");
			}
			System.out.println();
		}
	}

}
