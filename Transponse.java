class main
{
    public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[][]ij,m,n;
		System.out.println("Enter no of rows and columns");
		m=s.nextInt();
		n=s.nextInt();
		a=new int[m][n];
		System.out.println("Enter elements");
		for(i=0;i<m;i++)
		{
          for(j=0;j<m;j++){
			  a[i][j]=s.nextInt();
		  }
		}
		System.out.println)("Matrix is");
		for ((i=0;i<m;i++)
		{
        	for ((j=0;j<m;j++)
			{
				System.out.println(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Transponse matrix is");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out println();
		}
	}
}
		

