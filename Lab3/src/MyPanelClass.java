import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getWidth() - myInsets.right - 1;
                        //second diagonal line coordinates
                        int x3 = getWidth();
                        int y3 = getHeight() - myInsets.bottom - 1;
                        int x4 = getWidth() - myInsets.right - 1;
                        int y4 = myInsets.top;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.YELLOW);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
                        g.setColor(Color.BLUE);
                        g.drawRect(x1, y1, width, height);
                        //Draw a second border inside the first one
                        g.setColor(Color.RED);
                        g.drawRect(x1 + 3, y1 + 3, width - 6, height - 6);
                        //Draw a diagonal line
                        g.setColor(Color.GREEN);
                        g.drawLine(x1, y1, x2, y2);
                        //Draw a second diagonal line
                        g.setColor(Color.BLACK);
                        g.drawLine(x3, y3, x4, y4);
            }
}