
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Prime2
{
	public static void main(String[] args)
	{
		/*Variables*/
		int max=0,index1,index2;
		boolean[] numList;
		ArrayList<Integer> primeList=new ArrayList<Integer>();
		long startTime,endTime,totalTime;
		JFrame frame=new JFrame();
		boolean validEntry=false;
		
		/*Get the number from the user. Keep prompting until they gave me something valid*/
		while(!validEntry)
			try
			{
				max=Integer.parseInt(JOptionPane.showInputDialog(frame,"Enter an integer greater than 2 to find primes less or equal to that number."));
			
				if(max>=3)
					validEntry=true;
				else
					JOptionPane.showMessageDialog(frame,"That input is invalid.");
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(frame,"That input is invalid.");
			}
		
		/*This is to calculate run time later on*/
		startTime=System.currentTimeMillis();

		/*Initialize and build the list of primes*/
		numList=new boolean[max+1];

		/*If we find a prime, set every multiple of that prime to  not be prime and add that number to our list of primes*/
		for(index1=2;index1<numList.length;index1++)
			if(!numList[index1])
			{
				primeList.add(index1);

				for(index2=index1;index2<numList.length;index2+=index1)
					numList[index2]=true;
			}

		/*Finish up the run time calculation*/
		endTime=System.currentTimeMillis();
		totalTime=endTime-startTime;
		
		/*Inform the user what the highest prime was and how many there were in addition to if the number they put in was prime or not and how long it took to do everything*/
		if(primeList.get(primeList.size()-1)!=max)
			JOptionPane.showMessageDialog(frame,"The highest prime found was: "+primeList.get(primeList.size()-1)+".\nThere are this many: "+primeList.size()+".\n" + max +
											" is not prime.\nThe whole program took "+totalTime/1000.000+" seconds to run.");
		else
			JOptionPane.showMessageDialog(frame,max+ ", your number, was the highest prime found.\nThere are this many: "+primeList.size()+".\n" +
											" The whole program took "+totalTime/1000.000+" seconds to run.");
		
		System.exit(0);
	}
}

