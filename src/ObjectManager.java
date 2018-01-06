import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	RocketShip rs;
	ArrayList<Projectile>projectile=new ArrayList<Projectile>();
	ArrayList<Alien>alien=new ArrayList<Alien>();
	public ObjectManager(RocketShip rs) {
		this.rs=rs;
		
	}
	public void update() {
		for(Projectile u: projectile) {
			u.update();
		}
		for(Alien u: alien) {
			u.update();
		}
		rs.update();
	}
	public void draw(Graphics g) {
		for(Projectile d: projectile) {
			d.draw(g);
		}
		for(Alien d: projectile) {
			d.draw(g);
		}
		rs.draw(g);
	}
	public void addProjectile(Projectile pr) {
		projectile.add(pr);
	}
	public void addAlien(Alien al) {
		alien.add(al);
}
}
