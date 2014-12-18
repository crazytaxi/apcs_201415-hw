import java.awt.*;
import java.awt.event.*;

public class CColor implements Runnable {
	private Thread t;
	private Button b;
	private boolean isGen;

	public void start () {
		if (t == null) {
			t = new Thread(this);
			t.start();
		}
	}

	public void stop () {
		if (t != null) {
			t.stop();
			t = null;
		}
	}

	public void run () {
		while (this.isGen) {
			this.b.setBackground(new Color((float)Math.random(), (float)Math.random(), (float)Math.random(), (float)Math.random()));
			Thread.sleep(50);
		}
	}

	public CColor (Button b) {
		this.b = b;
		this.isGen = true;
	}

	public void setGen (boolean tf) {
		this.isGen = tf;
	}

	public Button getButton () {
		return this.b;
	}
}
