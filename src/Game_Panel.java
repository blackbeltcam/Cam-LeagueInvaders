
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game_Panel extends JPanel implements ActionListener, KeyListener {
	Font titleFont;
	Font subtitleFont;
	RocketShip rs=new RocketShip(250, 700, 50, 50);
	ObjectManager om=new ObjectManager(rs);
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState=MENU_STATE;
	@Override
	public void paintComponent(Graphics g){
		 if(currentState == MENU_STATE){
         drawMenuState(g);
     }else if(currentState == GAME_STATE){
         drawGameState(g);
     }else if(currentState == END_STATE){
         drawEndState(g);
     }


	        }
	public Game_Panel() {
		timer = new Timer(1000 / 60, this);
		titleFont=new Font("Comic Sans", Font.PLAIN, 48);
		subtitleFont=new Font("Arial", Font.ROMAN_BASELINE, 20);
	}

	public void startGame() {
		timer.start();
	}
	public void updateMenuState() {
		
	}
	public void updateGameState() {
		om.manageEnemies();
		om.update();
	}
	public void updateEndState() {
		
	}
	
	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT); 
		g.setFont(titleFont);
		g.setColor(new Color(170, 17, 255));
		g.drawString("Welcome To", 90, 100);
		g.drawString("League Invaders!", 50, 200);
		g.setFont(subtitleFont);
		g.drawString("Press ENTER to Begin", 150, 400);
		g.drawString("Press SPACE for Instructions", 120, 550);
	}
	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		om.draw(g);
	}
	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("GAME OVER", 110, 100);
		g.setFont(subtitleFont);
		g.drawString("You Killed 0 Alies", 170, 350);
		g.drawString("Press ENTER to Restart", 140, 410);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if(currentState == MENU_STATE){

            updateMenuState();

    }else if(currentState == GAME_STATE){

            updateGameState();

    }else if(currentState == END_STATE){

            updateEndState();

    }


	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		currentState++;
		currentState=currentState%3;
	}
	else if (e.getKeyCode()==KeyEvent.VK_SPACE) {
		if (currentState==MENU_STATE) {
			JOptionPane.showMessageDialog(this, "Use ARROW KEYS to move and SPACE to shoot");
		}
		if (currentState==GAME_STATE) {
			om.addProjectile(new Projectile(rs.x+21, rs.y, 10, 10));
		}
	}
	
	
	if (e.getKeyCode()==KeyEvent.VK_UP) {
		 rs.y -= rs.speed;
	}
	else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		rs.y += rs.speed;
	}
	else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		rs.x -= rs.speed;
	}
	else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		rs.x += rs.speed;
	}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
