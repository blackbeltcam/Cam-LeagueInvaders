import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final int width = 500;
	final int height = 800;
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
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
