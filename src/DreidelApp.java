import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DreidelApp {
	private static String TITLE = "Dreidel";
	private static JFrame splashApp;
	private static JFrame gameApp;
	private static String START = "Start";
	
	public static void initialApp() {
		int potSize;
		int playerCount;
		
		splashApp = new JFrame(TITLE); //initializing frame
		
		ImageIcon dreidelImg = new ImageIcon("dreidel.png"); //creating image icon object
		splashApp.setIconImage(dreidelImg.getImage()); //setting it to the jframe
		
		JButton startButton = new JButton(START);
		splashApp.add(startButton);
		
		splashApp.setVisible(true); //making JFrame Visible
	}
	public static void gameApp() {
		int potSize;
		int playerCount;
		
		gameApp = new JFrame(); //initializing frame
		
		ImageIcon dreidelImg = new ImageIcon("dreidel.png"); //creating image icon object
		gameApp.setIconImage(dreidelImg.getImage()); //setting it to the jframe
		
		
		
		gameApp.setVisible(true); //making JFrame Visible
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initialApp(); //creating application
		if (splashApp.isActive() == false) {
			gameApp();
		}
	}

}
