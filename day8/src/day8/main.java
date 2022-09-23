     //METHODS


package day8;

public class main {
	
public static void main(String [] args) {
	
	shouldwakeup(true,1);
	tomilesperhour(1.5);
	
	
	checknumber(5);
	
	calculatescore(true,800,5,100);
	
	calculatescore(true,10000,8,200);
	
	
	int highscoreposition=calculatehighscoreposition(1500); 
	displayhighscoreposition("mahesh",highscoreposition);
	
	highscoreposition=calculatehighscoreposition(900); 
	displayhighscoreposition("priya",highscoreposition);
    
	highscoreposition=calculatehighscoreposition(400); 
	displayhighscoreposition("sowmya",highscoreposition);
	
	highscoreposition=calculatehighscoreposition(50); 
	displayhighscoreposition("pooja",highscoreposition);
}

public static boolean shouldwakeup(boolean barking,int hourofday) {
	
	if (hourofday<0 || hourofday>23) {
		return false;
	}
if (barking==true && hourofday<8 || hourofday>22) {
	return true;
}
else {
	return false;

    }

}


   public static long tomilesperhour(double kilometersperhour) {
	   
	   if(kilometersperhour<0) {
		   return -1; 
	   }
	   long tomilesperhour=Math.round(kilometersperhour/1.609);
	   return tomilesperhour;
	   
	   
   }
   

       public static void printconversion(double kilometersperhour) {
    	   
    	   if(kilometersperhour<0) {
              
    		   System.out.println("invalid value");
    		   
    	   }
    	   
       }
   
   
   
   
   
public static void checknumber(int parameter) {
	  if(parameter>0) {
		  System.out.println("positive");
		  
	  }
	  else if(parameter<0) {
		   System.out.println("negative");
		   
	  }
	  else if(parameter==0) {
		  System.out.println("number was zero");
	  }
}

public static void calculatescore(boolean gameover,int score,int levelcompleted,int bonus) {
  
	if(gameover) {
		int finalscore=score+(levelcompleted*bonus);
		finalscore+=2000;
		System.out.println("yout final score is " +finalscore);
	}
}

 public static void displayhighscoreposition(String playername,int playerposition) {
	 System.out.println(playername +   " managed to get into position" 
                                 +  playerposition   +  " on high score table");
	  
 }
  public static int calculatehighscoreposition(int playerscore) {
	  
	  if(playerscore>1000) {
		  return 1;
	     }
		  else if(playerscore>500 && playerscore<1000) {
			  return 2;
		  }
		  else if(playerscore>100 && playerscore<500) {
			  return 3;
		  }
		  else {
			  return 4;
		  }
	 
	  
  }

}

