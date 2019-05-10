import javax.swing.JFrame;

public class Main {
public static Scene scene;
	public static void main(String[] args) {
char[][] elements= new char[31][10];
		JFrame fenetre=new JFrame();
		scene=new Scene();
		fenetre.setSize(1280,1024);
		fenetre.setResizable(false);
		fenetre.setContentPane(scene);
		fenetre.setVisible(true);
		
	}

}
