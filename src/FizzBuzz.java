public class FizzBuzz
{
	/*This is an old drinking game! It will print out Fizz when the number is a multiple of 3,
	 *Buzz if the number is a multiple of 5 and FizzBuzz if the number is a multiple of both, we go to 100*/
	public static void main (String[] args)
	{
		final int MAX=100;
		for(int i=1; i<=MAX; i++)
		{
			if(i%3==0)
				System.out.print("Fizz");
			if(i%5==0)
				System.out.print("Buzz");
			System.out.println();
		}
	}
}
