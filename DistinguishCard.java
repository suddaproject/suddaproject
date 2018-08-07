package sutda2;

public class DistinguishCard {
	int score=0;
	
	void distinguish(String st1, String st2){
		 if ((st1.equals("a3") && st2.equals("a8")) || (st2.equals("a3") && st1.equals("a8")))
			 score =100;
		    else if ((st1.equals("a1") && st2.equals("a3")) || (st2.equals("a3") && st1.equals("a1")))
		    	score =90;
		    else if ((st1.equals("a1") && st2.equals("a8")) || (st2.equals("a8") && st1.equals("a1")))
		    	score =90;
		    else if ((st1.equals("a1") && st2.equals("a8")) || (st2.equals("a8") && st1.equals("a1")))
		    	score =90;
		    else if ((st1.equals("b9") && st2.equals("b4")) || (st2.equals("b4") && st1.equals("b9")))
		    	score =1000;
		    else if ((st1.equals("a1") && st2.equals("b1")) || (st2.equals("b1") && st1.equals("a1")))
		    	score =80;
		    else if ((st1.equals("a2") && st2.equals("b2")) || (st2.equals("b2") && st1.equals("a2")))
		    	score =81;
		    else if ((st1.equals("a3") && st2.equals("b3")) || (st2.equals("b3") && st1.equals("a3")))
		    	score =82;
		    else if ((st1.equals("a4") && st2.equals("b4")) || (st2.equals("b4") && st1.equals("a4")))
		    	score =83;
		    else if ((st1.equals("a5") && st2.equals("b5")) || (st2.equals("b5") && st1.equals("a5")))
		    	score =84;
		    else if ((st1.equals("a6") && st2.equals("b6")) || (st2.equals("b6") && st1.equals("a6")))
		    	score =85;
		    else if ((st1.equals("a7") && st2.equals("b7")) || (st2.equals("b7") && st1.equals("a7")))
		    	score =86;
		    else if ((st1.equals("a8") && st2.equals("b8")) || (st2.equals("b8") && st1.equals("a8")))
		    	score =87;
		    else if ((st1.equals("a9") && st2.equals("b9")) || (st2.equals("b9") && st1.equals("a9")))
		    	score =88;
		    else if ((st1.equals("a0") && st2.equals("b0")) || (st2.equals("b0") && st1.equals("a0")))
		    	score =89;
		     
		    else if ((st1.equals("a1") && st2.equals("b1")) || (st2.equals("b1") && st1.equals("a1")))
		    	score =70;
		    else if ((st1.equals("b1") && st2.equals("b2")) || (st2.equals("b2") && st1.equals("b1")))
		    	score =70;
		    else if ((st1.equals("b1") && st2.equals("a2")) || (st2.equals("a2") && st1.equals("b1")))
		    	score =70;
		    else if ((st1.equals("a1") && st2.equals("b1")) || (st2.equals("b1") && st1.equals("a1")))
		    	score =70;
		    else if ((st1.equals("a1") && st2.equals("b2")) || (st2.equals("b2") && st1.equals("a1")))
		    	score =70;
		    else if ((st1.equals("a4") && st2.equals("a1")) || (st2.equals("a1") && st1.equals("a4")))
		    	score =60;
		    else if ((st1.equals("b4") && st2.equals("b1")) || (st2.equals("b1") && st1.equals("b4")))
		    	score =60;
		    else if ((st1.equals("b4") && st2.equals("a1")) || (st2.equals("a1") && st1.equals("b4")))
		    	score =60;
		    else if ((st1.equals("a4") && st2.equals("b1")) || (st2.equals("b1") && st1.equals("a4")))
		    	score =60;
		    else if ((st1.equals("a9") && st2.equals("a1")) || (st2.equals("a1") && st1.equals("a9")))
		    	score =50;
		    else if ((st1.equals("b9") && st2.equals("b1")) || (st2.equals("b1") && st1.equals("b9")))
		    	score =50;
		    else if ((st1.equals("b9") && st2.equals("a1")) || (st2.equals("a1") && st1.equals("b9")))
		    	score =50;
		    else if ((st1.equals("a9") && st2.equals("b1")) || (st2.equals("b1") && st1.equals("a9")))
		    	score =50;
		    else if ((st1.equals("a0") && st2.equals("a1")) || (st2.equals("a1") && st1.equals("a0")))
		    	score =40;
		    else if ((st1.equals("b0") && st2.equals("b1")) || (st2.equals("b1") && st1.equals("b0")))
		    	score =40;
		    else if ((st1.equals("a0") && st2.equals("b1")) || (st2.equals("b1") && st1.equals("a0")))
		    	score =40;
		    else if ((st1.equals("b0") && st2.equals("a1")) || (st2.equals("a1") && st1.equals("b0")))
		    	score =40;
		    else if ((st1.equals("a0") && st2.equals("a4")) || (st2.equals("a4") && st1.equals("a0")))
		    	score =30;
		    else if ((st1.equals("b0") && st2.equals("b4")) || (st2.equals("b4") && st1.equals("b0")))
		    	score =30;
		    else if ((st1.equals("a0") && st2.equals("b4")) || (st2.equals("b4") && st1.equals("a0")))
		    	score =30;
		    else if ((st1.equals("a0") && st2.equals("a4")) || (st2.equals("a4") && st1.equals("a0")))
		    	score =30;
		    else if ((st1.equals("b0") && st2.equals("a4")) || (st2.equals("a4") && st1.equals("b0")))
		    	score =30;
		    else if ((st1.equals("a4") && st2.equals("a6")) || (st2.equals("a6") && st1.equals("a4")))
		    	score =20;
		    else if ((st1.equals("b4") && st2.equals("b6")) || (st2.equals("b6") && st1.equals("b4")))
		    	score =20;
		    else if ((st1.equals("a4") && st2.equals("b6")) || (st2.equals("b6") && st1.equals("a4")))
		    	score =20;
		    else if ((st1.equals("b4") && st2.equals("a6")) || (st2.equals("a6") && st1.equals("b4")))
		    	score =20;
		    else another(st1,st2);
	}
	
	void another(String st1,String st2) {
		 score = (st1.charAt(1)-48) + (st2.charAt(1)-48); 
		if(score >=10) {
			score = score -10;
		}	
		
	}
	}

