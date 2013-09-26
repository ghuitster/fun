
import java.util.ArrayList;
import java.util.Scanner;

public class Prime
{
	/*I wrote this after a calculus class in which we determined that every number is a multiple of a unique set of prime numbers. Mike helped :)*/
	public static void main(String[] args)
	{	
		/*Create the list and add 2*/
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(2);
		
		/*Start with 1 because we're going to increment twice before we do anything else*/
		int x=1;
		
		/*Accept a number from the user. Look for primes that are less than that number*/
		int MAX;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a whole number to find primes less or equal to that number: ");
		MAX=scan.nextInt();
		
		/*This is to calculate run time later on*/
		long startTime=System.currentTimeMillis();
		
		while(x<MAX)
		{
			/*We can skip the even numbers because we know they are not prime*/
			x+=2;
			
			/*If we are given an even number we'll end up higher than the user-provided number on the last go, this is to account for that*/
			if(x>MAX)
				break;
			
			/*Continue until there are no more primes to test in the list*/
			for(int i=0; i<list.size(); i++)
			{
				/*Get each of the primes in the list and mod that number with my number. If the result is ever 0 then it's
				not prime and we can break.*/
				int temp;
				temp=Integer.parseInt(list.get(i).toString());
				if(x%temp==0)
					break;
				
				/*If we went all the way through without breaking then we know we've found a prime, add it to the list!*/
				if(i==list.size()-1)
					list.add(x);
			}
		}

		/*Inform the user what the highest prime was and how many there were*/
		System.out.println("The highest prime found was: "+list.get(list.size()-1));
		System.out.println("There are this many: "+list.size());
		
		/*Finish up the run time calculation and print the result*/
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("startTime: "+startTime+" endTime: "+endTime+" totalTime in seconds: "+totalTime/1000.0000);
	}
}

