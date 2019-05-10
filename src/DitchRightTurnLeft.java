import java.awt.Image;

import javax.swing.ImageIcon;

public class DitchRightTurnLeft {
	private int x,y;
	private ImageIcon icoDitchRightTurnLeft;
	private Image imgDitchRightTurnLeft;

	public DitchRightTurnLeft(int x,int y) {
		this.x=x;
		this.y=y;
		this.icoDitchRightTurnLeft=new ImageIcon(getClass().getResource("/images/DitchLeftTurnLeft.jpg"));
		this.imgDitchRightTurnLeft=icoDitchRightTurnLeft.getImage();
		
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
	 * @return the imgDitchRightTurnLeft
	 */
	public Image getImgDitchRightTurnLeft() {
		return imgDitchRightTurnLeft;
	}

}
