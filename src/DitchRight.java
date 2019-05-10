import java.awt.Image;

import javax.swing.ImageIcon;

public class DitchRight {
private int x,y;
private ImageIcon icoDitchRight;
private Image imgDitchRight;

public DitchRight(int x,int y) {
	this.x=x;
	this.y=y;
	this.icoDitchRight=new ImageIcon(getClass().getResource("/images/DitchRight.jpg"));
	this.imgDitchRight=icoDitchRight.getImage();
	
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
 * @return the imgDitchRight
 */
public Image getImgDitchRight() {
	return imgDitchRight;
}

}
