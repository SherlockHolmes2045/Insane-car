import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Scene extends JPanel{

public ArrayList<Object> tabelements;
private static char[][] elements=new char[31][10];
	
	
	public Scene() {
		tabelements=new ArrayList<Object>();
elements=readFile(elements);

	}
	public static char[][] readFile(char[][] elements) {
		elements=new char[31][10];
		int j=0;
		try {
			String strCurrentLine=null;
			BufferedReader reader = new BufferedReader(new FileReader("Road.txt"));
			try {
				while ((strCurrentLine = reader.readLine()) != null) {
						for(int i=0;i<10;i++) {
							elements[j][i]=strCurrentLine.charAt(i);
						}
						j++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return elements;
	}
}
