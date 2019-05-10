import java.awt.Image;

import javax.swing.ImageIcon;

public class DitchLeftTurnLeft {
private int x,y;
private ImageIcon icoDitchLeftTurnLeft;
private Image imgDitchLeftTurnLeft;

public DitchLeftTurnLeft(int x,int y) {
	this.x=x;
	this.y=y;
	this.icoDitchLeftTurnLeft=new ImageIcon(getClass().getResource("/images/DitchLeftTurnLeft.jpg"));
	this.imgDitchLeftTurnLeft=icoDitchLeftTurnLeft.getImage();
	
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
 * @return the imgDitchTurnLeft
 */
public Image getImgDitchLeftTurnLeft() {
	return imgDitchLeftTurnLeft;
}

}
