	
	class Data
{
int a,bl;
void get(int a,int b)
	{
		this.a=100;
		
	}
	void show()
	{
		System.out.println("super demo");
	}
}
		
class Second extends Data
	{
	int a=256;
		
		
		void Shown(int a)
		{
          super.show();
		  System.out.println(a);
           System.out.println(this.a);
		   System.out.println(super.a);
		}
	}
   class Single
	{
	public static void main(String args[])
			{
		Second a1=new Second();
			a1.show (888);
			}
	}
				
		
	

					
									
				

		 
		       
	