package sutda2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class GameApp {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		CardPick cardpick =null;
		DistinguishCard dplayer1 = new DistinguishCard();
		DistinguishCard dplayer2 = new DistinguishCard();
		DistinguishCard dplayer3 = new DistinguishCard();
		Bet b1 = null;
		Bet b2 = null;
		
		
		
		
			// 게임시작
		cardpick = new CardPick(); //객체생성, 메모리에할당, 자동 생성자함수 호출
		dplayer1.distinguish(cardpick.mc1, cardpick.mc2);
		dplayer2.distinguish(cardpick.cc1, cardpick.cc2);
		dplayer3.distinguish(cardpick.dc1, cardpick.dc2);
		
		b1 = new Bet(dplayer1.score,dplayer2.score, dplayer3.score);
		b1.gamePlay(cardpick.mc1,cardpick.mc2);
		
		if(b1.korea ==1) {
			switch (JOptionPane.showConfirmDialog
					(null,"게임 계속?","",JOptionPane.YES_NO_OPTION)) {
				case 0:
					
					b2 = new Bet(dplayer1.score,dplayer2.score, dplayer3.score);
					b2.gamePlay(cardpick.mc1,cardpick.mc2);
					
					
					
				case 1:
					
					break;
		}
		
		}

		
		
			//else if(UserSelect ==2) // sql 로 저장하기
		
		
	}
}
