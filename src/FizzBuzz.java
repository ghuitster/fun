
public class FizzBuzz
{
	/*This is an old drinking game! It will print out Fizz when the number is a multiple of 3,
	 *Buzz if the number is a multiple of 5 and FizzBuzz if the number is a multiple of both, we go to 100*/
	public static void main (String[] args)
	{
		final int MAX=100;
		for(int i=1; i-1<MAX; i++)
		{
			String printMe="";
			if(i%3==0)
				printMe="Fizz";
			if(i%5==0)
				printMe+="Buzz";
			if(printMe.equals(""))
				printMe+=i;
			System.out.println(printMe);
		}
	}
}
