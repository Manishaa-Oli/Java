package TrialGame;

import java.util.*;

public class NumGuess {
		public static void main(String a[])
		{
			int i=1;
			List<Integer>l=new ArrayList<Integer>();
			Random r=new Random();
			int guess=r.nextInt(10);
			Scanner sc=new Scanner(System.in);
			while(true)
			{
				System.out.println("enter your guess:");
				int n=sc.nextInt();
				if(guess!=n)
				{
					System.out.println("your "+i+"th input is wrong \nsorry try again!!");
					l.add(n);
					i++;
				}
				else {
					System.out.println("it's a match!!\n you won!!");
					break;
				}
			}
			sc.close();
			
		}
}
