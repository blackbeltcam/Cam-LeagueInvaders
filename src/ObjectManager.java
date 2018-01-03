import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	RocketShip rs;
	ArrayList<Projectile>projectile=new ArrayList<>();
	public ObjectManager(RocketShip rs) {
		this.rs=rs;
		
	}
	public void update() {
		rs.update();
	}
	public void draw(Graphics g) {
		rs.draw(g);
	}
	
}
