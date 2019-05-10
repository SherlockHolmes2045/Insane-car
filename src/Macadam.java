import java.awt.Image;

import javax.swing.ImageIcon;

public class Macadam {
private int x,y;
private ImageIcon icoMacadam;
private Image imgMacadam;

public Macadam(int x,int y) {
	this.x=x;
	this.y=y;
	this.icoMacadam=new ImageIcon(getClass().getResource("/images/Macadam.jpg"));
	this.imgMacadam=icoMacadam.getImage();
	
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
 * @return the imgMacadam
 */
public Image getImgMacadam() {
	return imgMacadam;
}

}
