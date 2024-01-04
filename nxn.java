class  
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[][],i,j,n,sum=0
			System.out.println("Enter the size of matrix");
		     n=s.nextInt();
		    a=new int[m][n];
			System.out.printin("Enter elements");
			for(i=0;i<n;i++);
		{
			for(j=0;j<n;j++);
			{
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<n;i++);
		{
          for(j=0;j<n;j++);
			{
				if(i==j)
					sum=sum+a[i][j];
			}
		}
            System.out.print("sum of diagonal elements="+sum);
	}
}

	       
					
		
	


		
	

		