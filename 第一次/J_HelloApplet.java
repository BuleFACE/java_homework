import java.awt.Graphics;
import javax.swing.JApplet;
public class J_HelloApplet extends JApplet
{
    public void paint(Graphics g)
    {
        g.clearRect(0,0,getWidth(),getHeight());
        g.drawString("小应用程序，您好!",10,20);
    }
}