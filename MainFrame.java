package sutda2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class MainFrame extends JFrame implements ActionListener{
	
	static int myBalance =100000;
	int usersel = 0;
	TextArea ta;
	Dimension dim = null;
	JFrame frame = new JFrame("섰다");
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	
	
	 JLabel userId = new JLabel("ID: 예림이");
     JLabel userMoney;
     JLabel blank = new JLabel("");
     JLabel message = new JLabel("어케할지 선택하시오");
     JButton button1 = new JButton("CALL");
     JButton button2 = new JButton("DOUBLE");
     JButton button3 = new JButton("DIE");
     
     ImageIcon[] origin_userCard = new ImageIcon[20];
     Image[] edit_userCard = new Image[20];
     Image[] changed_userCard = new Image[20];
     ImageIcon[] final_userCard = new ImageIcon[20];
     JLabel[] userCard = new  JLabel[20];
     
     ImageIcon origin_comCard = new ImageIcon("img/comcard.PNG");
     Image edit_comCard = origin_comCard.getImage();
     Image changed_comCard = edit_comCard.getScaledInstance(50,90,Image.SCALE_SMOOTH);
     ImageIcon final_comCard = new ImageIcon(changed_comCard);
     
	public MainFrame() {
		
		
		
		userMoney = new JLabel("잔고:"+myBalance);
		String str = Integer.toString(myBalance);
		userMoney.setText(str);
		
		dim = new Dimension(400,100);
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color color1 = new Color(000,81,000);
		this.setLayout(new BorderLayout());
		
		panel5.setBackground(color1);
		
		  JPanel comsCard1 = new JPanel();

	        	        
	        JLabel comCard1 = new JLabel(final_comCard);
	        JLabel comCard2 = new JLabel(final_comCard);
		
		comsCard1.add(comCard1);
        comsCard1.add(comCard2);

        
        JLabel label1 = new JLabel("Computer1");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setVerticalAlignment(SwingConstants.CENTER);
        label1.setOpaque(true);
        
        JLabel label2 = new JLabel("Computer2");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setVerticalAlignment(SwingConstants.CENTER);
        label2.setOpaque(true);
        
        JLabel label3 = new JLabel("");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setVerticalAlignment(SwingConstants.CENTER);
        label3.setOpaque(true);
        
        JLabel label4 = new JLabel("내 카드");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setVerticalAlignment(SwingConstants.CENTER);
        label4.setOpaque(true);
        
        JLabel label5 = new JLabel("");
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setVerticalAlignment(SwingConstants.CENTER);
        label5.setOpaque(true);   
        
        JPanel user = new JPanel();
        user.setLayout(new GridLayout(7,1));
        
        JPanel left = new JPanel();
        left.setLayout(new GridLayout(3,1));
        
        
        left.add(label1);
        left.add(comsCard1);
        ta = new TextArea("게임을 시작합니다",10,30);
        left.add(ta);
        

        user.add(userId);
        user.add(userMoney);
        user.add(blank);
        user.add(message);
        user.add(button1);
        user.add(button2);
        user.add(button3);
        
        
        //////////////////////////화투이미지/////////////
        
//        ImageIcon origin_userCard1 = new ImageIcon("usercard1.jpg");
//        Image edit_userCard1 = origin_userCard1.getImage();
//        Image changed_userCard1 = edit_userCard1.getScaledInstance(50,90,Image.SCALE_SMOOTH);
//        ImageIcon final_userCard1 = new ImageIcon(changed_userCard1);
//        JLabel userCard1 = new JLabel(final_userCard1);
      
        
        for(int i = 0; i<20; i++) {

        	origin_userCard[i] = new ImageIcon("img/"+(i+1)+".PNG");
        	edit_userCard[i] = origin_userCard[i].getImage();
        	changed_userCard[i] = edit_userCard[i].getScaledInstance(55,90,Image.SCALE_SMOOTH);
            final_userCard[i] = new ImageIcon(changed_userCard[i]);
            userCard[i] = new JLabel(final_userCard[i]);     	
        }
        
        /////////////////////////////////////////////
        
     
        
        JLabel comCard3 = new JLabel(final_comCard);
        JLabel comCard4 = new JLabel(final_comCard);
        
        //////////////////////////////////////////////
        
        ImageIcon origin_dummy = new ImageIcon("img/dummy.png");
        Image edit_dummy = origin_dummy.getImage();
        Image changed_dummy = edit_dummy.getScaledInstance(80,135,Image.SCALE_SMOOTH);
        ImageIcon final_dummy = new ImageIcon(changed_dummy);
        JLabel dummy = new JLabel(final_dummy);
        
        panel2.add(label2);
        panel3.add(label3);
        panel4.add(label4);
        panel5.add(label5);
        panel3.add(user);
        
        addMyCard();
        
//      panel4.add(select_userCard1); select_userCard 변수에다가
//      panel4.add(select_userCard2); 유저 카드 대입해서 패널에 넣

        
        panel1.add(left);
        panel2.add(comCard3);
        panel2.add(comCard4);
        
        panel5.add("Center",dummy); 
                
        frame.add(panel1, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);
        
        frame.pack();
        frame.setVisible(true);
        buttonClickE();
    }
	void messageInput(String s) {
		ta.append("\n"+s);
	}
	void messageInput(int s) {
		ta.append("\n"+s);
	}
	void addMyCard() {
		  Random r = new Random();
	        int randomnum1 = r.nextInt(20);
	        int randomnum2 = r.nextInt(20);
	        panel4.add(userCard[randomnum1]); 
	        panel4.add(userCard[randomnum2]);     
	}
	
	void buttonClickE() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
