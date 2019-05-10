import java.awt.Image;

import javax.swing.ImageIcon;

public class DitchLeftTurnRight {
private int x,y;
private ImageIcon icoDitchLeftTurnRight;
private Image imgDitchLeftTurnRight;

public DitchLeftTurnRight(int x,int y) {
	this.x=x;
	this.y=y;
	this.icoDitchLeftTurnRight=new ImageIcon(getClass().getResource("/images/DitchLeftTurnRight.jpg"));
	this.imgDitchLeftTurnRight=icoDitchLeftTurnRight.getImage();
	
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
 * @return the imgDitchLeftTurnRight
 */
public Image getImgDitchLeftTurnRight() {
	return imgDitchLeftTurnRight;
}



}
