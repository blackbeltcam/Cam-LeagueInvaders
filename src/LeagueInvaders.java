import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final int WIDTH = 500;
	final int HEIGHT = 800;
	Game_Panel gp;

	public static void main(String[] args) {
		LeagueInvaders invade = new LeagueInvaders();
		invade.setup();
	}

	public LeagueInvaders() {
		frame = new JFrame();
		gp = new Game_Panel();
	}

	public void setup() {
		frame.add(gp);
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.pack();
		frame.setVisible(true);
		frame.addKeyListener(gp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gp.startGame();
	}
}
