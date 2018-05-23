import java.awt.* ;// import the package
import java.applet.*;
//<applet code = "DemoApplet" width = 400 height = 300> </applet>
public class DemoApplet extends Applet // any applet should subclass Applet
{
	public void init()
{ //SetForeGround(Color.red);
}
	public void paint (Graphics g) // colors, shapes etc are in Graphics g class. Paint is println of graphic
	{ g.setColor(Color.MAGENTA);
		g.drawString("Hello Applet", 20, 40); // displays applet, x=20, y=40
		g.setColor(Color.blue);
		g.drawLine(75, 100, 130, 220);
	}
}
