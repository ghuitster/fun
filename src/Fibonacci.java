
import java.util.ArrayList;

public class Fibonacci 
{
	/*This was just a fun little program that prints the first 47 numbers of the Fibonacci sequence
	 * 47 is the highest we can go before we get an underflow due to the number of bits used with an int*/
	public static void main(String[] args)
	{
		final int MAX=47;
		ArrayList<Integer> fibList=new ArrayList<Integer>();
		fibList.add(0);
		fibList.add(1);
		for(int i=2;i<MAX;i++)
		{
			fibList.add(fibList.get(i-1)+fibList.get(i-2));
		}
		System.out.println(fibList);
	}

}
