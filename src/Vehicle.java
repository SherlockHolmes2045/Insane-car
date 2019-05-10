import java.awt.Image;

import javax.swing.ImageIcon;

public class Vehicle {
private int x,y;
private ImageIcon IcoVehicle;
private Image ImgVehicle;

public Vehicle(int x,int y) {
	this.x=x;
	this.y=y;
	this.IcoVehicle=new ImageIcon(getClass().getResource("/images/MyVehicle.png"));
	this.ImgVehicle=IcoVehicle.getImage();
	
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
 * @return the imgVehicle
 */
public Image getImgVehicle() {
	return ImgVehicle;
}



}
