package com.gamblingsimulation;

public class UC7_StopOrPlayNextMonth {
	
public static void main(String[] args){
		
	    final int daily_bet=1;
	    int stake=100;
	    int winp=stake+(stake/2); 
	    int lossp=stake/2;
	    
	    int rand = (int)Math.floor(Math.random()*2);
		while((stake>lossp) && (stake<winp)) {
			
		if(rand==1) {
			
			stake=stake+daily_bet;
		}
		else
		{
			stake=stake-daily_bet;
		}
		}
		
		if(stake==winp) {
			System.out.println("WON...Will continue playing next month");
		  }
			else 
			{
				System.out.println("Stop Playing");
			}
		}

}
