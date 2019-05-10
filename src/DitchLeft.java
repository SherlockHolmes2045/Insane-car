import java.awt.Image;

import javax.swing.ImageIcon;

public class DitchLeft {
private int x,y;
private ImageIcon icoDitchLeft;
private Image imgDitchLeft;

public DitchLeft(int x,int y) {
	this.x=x;
	this.y=y;
	this.icoDitchLeft=new ImageIcon(getClass().getResource("/images/DitchLeft.jpg"));
	this.imgDitchLeft=icoDitchLeft.getImage();
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
 * @return the imgDitchLeft
 */
public Image getImgDitchLeft() {
	return imgDitchLeft;
}

}
