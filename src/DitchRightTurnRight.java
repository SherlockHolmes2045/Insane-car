import java.awt.Image;

import javax.swing.ImageIcon;

public class DitchRightTurnRight {
	private int x,y;
	private ImageIcon icoDitchRightTurnRight;
	private Image imgDitchRightTurnRight;

	public DitchRightTurnRight(int x,int y) {
		this.x=x;
		this.y=y;
		this.icoDitchRightTurnRight=new ImageIcon(getClass().getResource("/images/DitchRightTurnRight.jpg"));
		this.imgDitchRightTurnRight=icoDitchRightTurnRight.getImage();
		
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
	 * @return the imgDitchRightTurnRight
	 */
	public Image getImgDitchRightTurnRight() {
		return imgDitchRightTurnRight;
	}

}
