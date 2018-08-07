package sutda2;

import java.awt.event.ActionEvent;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bet extends MainFrame{
	static Scanner scan = new Scanner(System.in);
	int buttonValue =0 ;
	
	
	int korea=0;
	int scorea;
	int scoreb;
	int scorec;
	int pandon;
	int chip;
	int dealer;
	boolean callvalueA, callvalueB, callvalueC;
	boolean dievalueA, dievalueB, dievalueC;
	
	

	public Bet(int a, int b, int c) {
		scorea = a;
		scoreb = b;
		scorec = c;
		
	
	}

	void gamePlay(String a, String b) {

		boolean gameggt=true;
		while (gameggt) {
			
			initialvalue();
			messageInput("현재 잔액:" + myBalance);
				if (dealer == 0) {
					while (!((callvalueA && callvalueB && callvalueC)
							|| ((dievalueA && dievalueB) || (dievalueA && dievalueC) || (dievalueB && dievalueC)))) {
						
						userAct();
						comAct();
						compareScore();
						buttonValue = 0;
					}
				}

				else if (dealer == 1) {
					while (!((callvalueA && callvalueB && callvalueC)
							|| ((dievalueA && dievalueB) || (dievalueA && dievalueC) || (dievalueB && dievalueC)))) {
						
						comAct();
						userAct();
						compareScore();
						buttonValue = 0;
					}
					;
				}
			 //점수비교, 승패판단
			
				
		}
		
	 korea =1;
	}

	

	public int getBalance() {
		return myBalance;
	}

	public void setBalance(int myBalance) {
		this.myBalance = myBalance;
	}

	void userCall() {
		myBalance = myBalance - pandon;
		chip = chip + pandon;
		callvalueA = true;
	}

	void userDouble() {
		pandon = pandon * 2;
		myBalance = myBalance - pandon;
		chip = chip + pandon;
		callvalueA = false;
	}

	void userDie() {
		callvalueA = true;
		dievalueA = true;
	}

	void com1Call() {
		messageInput("컴퓨터1: 콜~!");
		chip = chip + pandon;
		callvalueB = true;
	}

	void com1Double() {
		messageInput("컴퓨터1: 더블~!");
		pandon = pandon * 2;
		chip = chip + pandon;
		callvalueB = false;
	}

	void com1Die() {
		messageInput("컴퓨터1: 다이 ㅠㅠ");
		callvalueB = true;
		dievalueB = true;
	}

	void com2Call() {
		messageInput("컴퓨터2: 콜~!");
		chip = chip + pandon;
		callvalueC = true;
	}

	void com2Double() {
		messageInput("컴퓨터2: 더블~!");
		pandon = pandon * 2;
		chip = chip + pandon;
		callvalueC = false;
	}

	void com2Die() {
		messageInput("컴퓨터2: 죽을게요ㅠ");
		callvalueC = true;
		dievalueC = true;
	}

	void win() {
		dealer = 0;
		myBalance = myBalance + chip;
		chip = 0;
	}

	void lose() {
		dealer = 1;
		chip = 0;
	}

	void compareScore() {
		if(dievalueB&&dievalueC) {
			win();
		}
		else {
		if (callvalueA && callvalueB && callvalueC) {

			if (scorea > scoreb) {
				if (scorea > scorec) {
					win();
				} else
					lose();
			} else
				lose();
		}
		
	}}

	void userAct() {
		int userSel = 0;
		messageInput("1.콜\n2.더블\n3.다이");
		try {
			
			for(int i= 0 ; i<10; i++) {
			Thread.sleep(1000);
			messageInput(i);
			
			if(buttonValue!=0) {
				break;
			}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userSel = buttonValue;
		messageInput("usersel=" +userSel );
		messageInput("buttonValue=" +buttonValue );
		if (userSel == 1) {
			messageInput("콜");
			userCall();
		} else if (userSel == 2) {
			messageInput("더블");
			userDouble();
		} else if (userSel == 3) {
			messageInput("다이");
			userDie();
		}
	}

	void comAct() {
		if (!dievalueB) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int random1 = (int) ((Math.random() * 3) + 1);
			if (random1 == 1) {
				com1Call();
			} else if (random1 == 2) {
				com1Double();
			} else if (random1 == 3) {
				com1Die();
			}
		}

		if (!dievalueC) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int random2 = (int) ((Math.random() * 3) + 1);
			if (random2 == 1) {
				com2Call();
			} else if (random2 == 2) {
				com2Double();
			} else if (random2 == 3) {
				com2Die();
			}
		}
	}

	void initialvalue() {
		callvalueA = false;
		callvalueB = false;
		callvalueC = false;
		dievalueA = false;
		dievalueB = false;
		dievalueC = false;
		pandon = 1000;
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		//액션 리스너 재정의
//		if (e.getSource().equals(button1))
		
		if (e.getSource()==button1)
		{
			messageInput("call눌럿네");
			buttonValue =1;
			
			
		}
		if(e.getSource().equals(button2))
		{
			messageInput("double눌럿네");
			buttonValue =2;
		}
		if(e.getSource().equals(button3)) {
			messageInput("die눌럿네");
		buttonValue =3;
		}
		
		
	
	}
	
	
}
