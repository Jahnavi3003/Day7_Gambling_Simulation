package com.gamblingsimulation;

public class UC3_ResignCondition {
	
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
		
		if(stake==lossp)
		{
			System.out.println(" Current Stake is " +stake+ " . LOSS 50% stake And Resigning For Today");
		}
		else if(stake<=winp){
			System.out.println(" Current Stake is " +stake+ " . WON 50% stake And Resigning For Today");
		}
		
}
}