import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DreidelApp {
	private String TITLE = "Dreidel";
	private static JFrame app;
	
	public static void application() {
		app = new JFrame(); //initializing frame
		
		ImageIcon dreidelImg = new ImageIcon("dreidel.png"); //creating image icon object
		app.setIconImage(dreidelImg.getImage()); //setting it to the jframe
		
		app.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		application();
	}

}
