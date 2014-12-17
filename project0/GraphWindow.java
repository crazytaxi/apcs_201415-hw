/* constructor class for the graphical window
	@author Qijia (Michael) Jin
*/

import java.awt.*;
import java.awt.event.*;

public class GraphWindow {
	private Frame wframe;
	private Window fwindow;
	private GraphicsConfiguration gc;

	public GraphWindow () {
		this.wframe = new Frame("Window 0");
		this.fwindow = new Window(this.wframe);
		this.gc = this.fwindow.getGraphicsConfiguration();
		this.wframe.setSize(640,480);
		this.wframe.setLocation(100,100);
		this.wframe.setUndecorated(false);
		this.wframe.setVisible(true);
		this.wframe.addWindowListener(new WindowListener () {

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}
});
	}

}
