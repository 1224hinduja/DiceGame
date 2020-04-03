package pigGame;

import java.util.Scanner;

public class start {
	public  void play()
	{
		int player=0,currscore=0;
		String[] names=new String[] {"saketh","shashi"};
		int[] score = new int[]{ 0,0 }; 
		int num=randomnum();
		System.out.println(" The number you rolled is "+num);
		while(num<=6)
		{
			
			if(num==1)
			{
				System.out.println("So the player "+names[player]+" has lost the chance");
				System.out.print("Now its opponent choice that is ");
				currscore=0;
				player=playerselect(player);
				System.out.println(names[player]);
				num=randomnum();
			}
			else {
				currscore+=num;
				int choice;
				System.out.println("Current player is "+names[player]+" and the current score is "+currscore);
				System.out.println("\t\t\tEnter");
				System.out.println("\t\t\t1.Roll die");
				System.out.println("\t\t\t2.Stop");
				System.out.println("\t\t\t3."
						+ " of players");
				System.out.println("\t\t\t4.Exit");
				Scanner ob=new Scanner(System.in);
				choice=ob.nextInt();
				switch(choice)
				{
					case 1:
						
						num=randomnum();
						System.out.println(" The number you rolled is "+num);
						break;
					case 2:
						
							score[player]+=currscore;
							if(score[player]>=100) {
								System.out.println("Current player has won that is "+names[player]+" and the score is "+score[player]);
								System.exit(0);
							}
							player=playerselect(player);
							currscore=0;
							num=randomnum();
							System.out.println(" The number you rolled is "+num);
						break;						
					case 4:
						System.exit(0);
						
				}
				System.out.println(score[0]+" is the score of "+names[0]);
				System.out.println(score[1]+" is the score of "+names[1]);
				
			}
		}
	}
	public int randomnum() {
		return((int)(6*(Math.random())+1));
	}
	public int playerselect(int player) {
		if(player==0) {
			return(1);
		}
		else
			return(0);
	}
}
