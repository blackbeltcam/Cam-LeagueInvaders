import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
Rectangle collisionBox; 
int x;
int y;
int width;
int height;
boolean isAlive;
public GameObject(int x, int y, int width, int height) {
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
	Rectangle collisionBox= new Rectangle(x, y, width, height);
	isAlive=true;
}
public void update() {
	collisionBox.setBounds(x, y, width, height);
}
public void draw(Graphics g) {
	
}
}
