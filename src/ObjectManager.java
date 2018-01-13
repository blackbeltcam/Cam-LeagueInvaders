import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	RocketShip rs;
	ArrayList<Projectile>projectile=new ArrayList<Projectile>();
	ArrayList<Alien>alien=new ArrayList<Alien>();
	long enemyTimer = 0;
	int enemySpawnTime = 1000;		
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
		for(Alien d: alien) {
			d.draw(g);
		}
		rs.draw(g);
	}
	public void addProjectile(Projectile pr) {
		projectile.add(pr);
	}
	public void manageEnemies(){
        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
                addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
        }
}
	private void purgeObjects() {
		for(int i=0; projectile.get(i);i++) {
			
		}
	}
	public void addAlien(Alien al) {
		alien.add(al);
}
}