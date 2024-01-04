import java.util.*;
class Quadratic
{
 public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
		double a,b,c;
		a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
		double r1,r2,d;
		d=b*b-4*a*c;
		if(d<0P)
		{
         System.out.println("Roots are not possible");
		}
		else
		{
			r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b+Math.sqrt(d))/(2*a);
			System .our.println("Root1="+r1);
            System .our.println("Root2="+r2);
		}
	}
}
        

