package sutda2;
import java.util.Random;

public class CardPick extends CardNaming {
	 
		 int randomcard[] ;
		String mc1,mc2,cc1,cc2,dc1,dc2;
		
	     public CardPick() {
	    	 randomcard = new int[6];
	        for (int i = 0; i < randomcard.length; i++) {
	            randomcard[i] = (int) (Math.random() * 20) + 1;
	 
	            for (int j = 0; j < i; j++) {
	                if (randomcard[i] == randomcard[j]) {
	                    i--;
	                    break;
	                }
	            }
	        }
	        CardNaming mc1 = new CardNaming(randomcard[0]);
	        CardNaming mc2 = new CardNaming(randomcard[1]);
	        CardNaming cc1 = new CardNaming(randomcard[2]);
	        CardNaming cc2 = new CardNaming(randomcard[3]);
	        CardNaming dc1 = new CardNaming(randomcard[4]);
	        CardNaming dc2 = new CardNaming(randomcard[5]);
	        
	        this.mc1 = mc1.cardName;
	        this.mc2 = mc2.cardName;
	        this.cc1 = cc1.cardName;
	        this.cc2 = cc2.cardName;
	        this.dc1 = cc1.cardName;
	        this.dc2 = cc2.cardName;
	     }   
	     
//	     public void objectCall() {
//	    	/* for (int i = 0; i < randomcard.length; i++) {
//				
//	    		 CardNaming mc = new CardNaming(randomcard[i]);
//			}*/
//	    	 	
//	    	CardNaming mc1 = new CardNaming(randomcard[0]);
//	        CardNaming mc2 = new CardNaming(randomcard[1]);
//	        CardNaming cc1 = new CardNaming(randomcard[2]);
//	        CardNaming cc2 = new CardNaming(randomcard[3]);
//	     }
	         
	 
	 
	 
	    
}
