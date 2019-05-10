import java.awt.Image;

import javax.swing.ImageIcon;

public class Tree {
private int x,y;
private ImageIcon Icotree;
private Image ImgTree;
public Tree(int x,int y) {
	this.x=x;
	this.y=y;
	this.Icotree=new ImageIcon(getClass().getResource("/images/Tree.jpg"));
	this.ImgTree=this.Icotree.getImage();
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
 * @return the imgTree
 */
public Image getImgTree() {
	return ImgTree;
}


}
