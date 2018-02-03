import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {
	int speed;
	public RocketShip(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed=8;
	}
	
	public void update() {
		super.update();
	}
	public void draw(Graphics g) {
		g.drawImage(Game_Panel.rocketImg, x, y, width, height, null);
		//g.setColor(Color.BLUE);
        //g.fillRect(x, y, width, height);
	}
}
