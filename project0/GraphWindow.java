/* constructor class for the graphical window
	@author Qijia (Michael) Jin
*/

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class GraphWindow {
	private Frame wframe;
	private Window fwindow;
	private GraphicsConfiguration gc;
	private Color random;
	private Button clicky;
	private CColor cc;
	private BufferedImage img_buff;
	private Graphics bgfx;		//buffered gfx ctx

	public GraphWindow () {
		this.wframe = new Frame("Window 0");
		this.wframe.setLayout(null);
		this.fwindow = new Window(this.wframe);
		this.gc = this.fwindow.getGraphicsConfiguration();
		this.wframe.setSize(640,480);
		this.img_buff = this.gc.createCompatibleImage(this.wframe.getBounds().width, this.wframe.getBounds().height);
		this.bgfx = this.img_buff.getGraphics();
		this.wframe.setLocation(100,100);
		this.clicky = new Button("Change Color");
		this.clicky.setSize(400,200);
		this.random = new Color((float)Math.random(), (float)Math.random(), (float)Math.random(), (float)Math.random());
		this.clicky.setBackground(this.random);
		this.clicky.setForeground(Color.white);
		this.clicky.setLocation(100,100);
		this.wframe.add(this.clicky);
		this.cc = new CColor(this.clicky);
		this.cc.start();
		this.clicky.addActionListener(new RBListener(this.cc));
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
