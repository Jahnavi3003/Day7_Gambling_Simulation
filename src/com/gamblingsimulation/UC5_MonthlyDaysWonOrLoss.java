package com.gamblingsimulation;

public class UC5_MonthlyDaysWonOrLoss {
	
public static void main(String[] args){
		
	    final int daily_bet=1;
	    int stake=100,no_of_daysl=0;
	    int day, no_of_daysw=0;
	    
	    for (day=1; day<=30; day++) {
	    	int rand = (int)Math.floor(Math.random()*2);
	    	if(rand ==1)
	    	{
	    		stake=stake+daily_bet;
	    		no_of_daysw++;
	    		
	    	}
	    	else
	    	{
	    		stake=stake-daily_bet;
	    		no_of_daysl++;
	    	}

	    }	    	
	    
	    System.out.println("Number of Days Won in a month are " +no_of_daysw);
	    System.out.println("Number of Days Loss in a month are " +no_of_daysl);
}


}
