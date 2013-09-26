
public class IntSwap
{
	/*I figured this all out by myself. It will switch the value of two
	 *ints without the need of a temporary third variable*/
	public static void main(String[] args)
	{
		int a=382;
		int b=12;
		System.out.println("Old a: "+a+"\nOld b: "+b);
		a=b-a;
		b=b-a;
		a=(b+a);
		System.out.println("New a: "+a+"\nNew b: "+b);
	}
}
