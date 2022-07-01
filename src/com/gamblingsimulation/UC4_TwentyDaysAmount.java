package com.gamblingsimulation;

public class UC4_TwentyDaysAmount {
	
public static void main(String[] args){
		
	    final int daily_bet=1;
	    int stake=100,stakewon=0,stakeloss=0;
	    int day, total_amount=0;
	    
	    for (day=1; day<=20; day++) {
	    	int rand = (int)Math.floor(Math.random()*2);
	    	if(rand ==1)
	    	{
	    		stake=stake+daily_bet;
	    	}
	    	else
	    	{
	    		stake=stake-daily_bet;
	    	}
//	    	System.out.println(stake);
	    	
	    	total_amount+=stake;
	    }	    	
	    
	    System.out.println("Total Amount is " +total_amount);
}
}