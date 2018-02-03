import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Alien extends GameObject {
	
	public Alien(int x, int y, int width, int height) {
		super(x, y ,width, height);
	}
	public void update() {
		super.update();
		y++;
	}
	
	public void draw(Graphics g) {
		g.drawImage(Game_Panel.alienImg, x, y, width, height, null);


	}
	
}

