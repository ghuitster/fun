
import java.util.Scanner;
import java.util.ArrayList;

public class JessicaLove
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int state=0;
		boolean finished=false,getInput=true;
		String input="";
		ArrayList<String> inputs=new ArrayList<String>();
		
		while(!finished)
			switch(state)
			{
			case 0:
				System.out.println("Do you love me? (yes/no)");
				input=scan.next();
				inputs.add(state+": "+input);
				
				if(input.equals("yes"))
				{
					System.out.println("Yay!");
					state=1;
				}
				else
					if(input.equals("no"))
					{
						System.out.println("That stinks...");
						state=7;
					}
					else
					{
						System.out.println("That wasn't valid...Try again!");
						state=0;
					}
				
				break;
				
			case 1:
				System.out.println("Are you sure? (yes/no)");
				input=scan.next();
				inputs.add(state+": "+input);
				
				if(input.equals("yes"))
				{
					System.out.println("That's awesome!");
					state=2;
				}
				else
					if(input.equals("no"))
						state=6;
					else
					{
						System.out.println("That wasn't valid...Try again!");
						state=1;
					}
				
				break;
				
			case 2:
				System.out.println("So...just to double check...you really do love me? Like, a lot? (yes/no)");
				input=scan.next();
				inputs.add(state+": "+input);
				
				if(input.equals("yes"))
				{
					System.out.println("That's great! Now we can move on to something else");
					state=3;
				}
				else
					if(input.equals("no"))
						state=6;
					else
					{
						System.out.println("That wasn't valid...Try again!");
						state=2;
					}
				
				break;
				
			case 3:
				System.out.println("Want to go on a date this Friday?! (yes/no)");
				input=scan.next();
				inputs.add(state+": "+input);
				
				if(input.equals("yes"))
				{
					System.out.println("Awesome! That makes me super happy!");
					state=4;
				}
				else
					if(input.equals("no"))
						state=6;
					else
					{
						System.out.println("That wasn't valid...Try again!");
						state=3;
					}
				
				break;
				
			case 4:
				System.out.println("What do you want to do?\nOption 1: Watch a movie and snuggle." +
						"\nOption 2: Go for a nice walk and look at the stars.\nOption 3: Go ice skating!\nNow pick 1/2/3:");
				input=scan.next();
				inputs.add(state+": "+input);
				state=5;
				getInput=true;
				
				if(input.equals("1"))
					System.out.print("Great idea! What movie? ");
				else
					if(input.equals("2"))
						System.out.print("Ooh! Okay! I can arrange that! Where should we walk? ");
					else
						if(input.equals("3"))
							System.out.print("I kind of thought you would pick this one...just saying! How long have you been wanting to do this? ");
						else
						{
							System.out.println("That's invalid, try again!");
							getInput=false;
							state=4;
						}
				
				if(getInput)
				{
					System.out.println("Enter anything!");
					scan=new Scanner(System.in);
					input=scan.nextLine();
					inputs.add(state+": "+input);
				}
				
				break;
				
			case 5:
				System.out.println("Thank you for playing this little game. I love you very much and I hope this made you smile!\nDo you want to play again? (yes/no)");
				input=scan.next();
				inputs.add(state+": "+input);
				
				if(input.equals("yes"))
					state=8;
				else
					if(input.equals("no"))
						finished=true;
					else
					{
						System.out.println("That wasn't valid...Try again!");
						state=5;
					}
				
				break;
				
			case 6:
				System.out.println("Why not?\nOption 1: You think I'm weird.\nOption 2: You're dating someone else.\nOption 3: You don't want to.\nNow pick 1/2/3:");
				input=scan.next();
				inputs.add(state+": "+input);
				
				if(input.equals("1"))
				{
					System.out.println("That makes sense. I did write this whole program after all. I guess that's alright.");
					state=5;
				}
				else
					if(input.equals("2"))
					{
						System.out.println("WHAT?! YOU CHEATING LITTLE MONKEY!");
						state=7;
					}
					else
						if(input.equals("3"))
						{
							System.out.println("Ouch. That's all. Just ouch.");
							state=7;
						}
						else
						{
							System.out.println("That's invalid, try again!");
							state=6;
						}
				
				break;
				
			case 7:
				System.out.println("Well, you clearly did something wrong. Want to try again to reach success? (yes/no)");
				input=scan.next();
				inputs.add(state+": "+input);
				
				if(input.equals("yes"))
					state=8;
				else
					if(input.equals("no"))
						finished=true;
					else
					{
						System.out.println("That wasn't valid...Try again!");
						state=7;
					}
				
				break;
				
			case 8:
				System.out.println("Okay! Time to start over! You entered this on this time around: (state: input) "
						+inputs.toString().substring(1,inputs.toString().length()-1));
				inputs.clear();
				state=0;
				
				break;
			}
		
		System.out.println("Okay, if you're really finished. :(\nHere's everything you input on this round: (state: input) " +
				""+inputs.toString().substring(1,inputs.toString().length()-1)+"\nCome again soon!");
	}
}
