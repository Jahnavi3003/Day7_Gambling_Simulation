package com.gamblingsimulation;

public class UC6_LuckiestUnluckiestDays {
	 
	public static void main(String[] args) {
	
	 final int daily_bet=1;
	    int stake=100,amount;
	    int day,stakew=0,stakel=0,total_amt=0,total_amt2=0;
	    int max=stake+(stake/2);
	    int min=stake/2;
	    	
	    	
	    	for (day=1; day<30; day++) {
	      while(stake<max && stake>min) {
	    	
	    	  int rand = (int)Math.floor(Math.random()*2);
	    	  if(rand==1) {
	    		  stake=stake+daily_bet;
	    	  }
	    	  else
	    	  {
	    		  stake=stake-daily_bet;
	    	  }
	    	  }
	      
	      }
	    	if(stake==150) {
	    		
	    	
	    	System.out.println("Luckiest day is " + day + " th day with maximum amount " +stake);
	    	}
	    	else if(stake==50) {
	    		System.out.println("Unluckiest Day with amount " + stake);
	    	}
	    		
	}}