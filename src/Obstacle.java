import java.awt.Image;

import javax.swing.ImageIcon;

public class Obstacle {
	private int x,y;
	private ImageIcon icoObstacle;
	private Image imgObstacle;

	public Obstacle(int x,int y) {
		this.x=x;
		this.y=y;
		this.icoObstacle=new ImageIcon(getClass().getResource("/images/Obstacle.jpg"));
		this.imgObstacle=icoObstacle.getImage();
		
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the imgObstacle
	 */
	public Image getImgObstacle() {
		return imgObstacle;
	}

}
