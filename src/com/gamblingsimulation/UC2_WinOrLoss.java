package com.gamblingsimulation;

public class UC2_WinOrLoss {

		public static void main(String[] args){
			
		    final int daily_bet=1;
		    int stake=100;
			
			int rand = (int)Math.floor(Math.random()*2);
			
			if(rand==1) 
			{
				System.out.println(" Bet is $" +daily_bet+ "." + " Gambler Won");
				stake=stake+daily_bet;
				System.out.println("Current Stake is "  + stake);
			}
			else
			{
				System.out.println(" Bet is $" +daily_bet+ "." + " Gambler Lost");
				stake=stake-daily_bet;
				System.out.println("Current Stake is "  + stake);
			}
		 	
	}
}


