import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

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
                        int y2 = getHeight() - myInsets.right - 1;
                        //second diagonal line coordinates
                        int x3 = myInsets.left;
                        int y3 = getHeight() - myInsets.left ;
                        int x4 = getWidth() - myInsets.right - 1;
                        int y4 = myInsets.top;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Red Rectangle 1
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height/5);
                        //Red Rectangle 2
                        g.setColor(Color.RED);
                        g.fillRect(x1, y2/2 - (height/5)/2, width + 1, height/5);
                        //Red Rectangle 1
                        g.setColor(Color.RED);
                        g.fillRect(x1, height - height/5 + 1, width + 1, height/5);
                        
                        //Draw an arrow
                        Polygon p = new Polygon();
                        p.addPoint(x1, y1);
                        p.addPoint(width/2 + 10, height/2);
                        p.addPoint(x1, height);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        
                      //Draw a star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + (width/4 - 88/3), y1 + (height/2 - 10/3));//48
                        p2.addPoint(x1 + (width/4 - 53/3), y1 + (height/2 - 10/3));//32
                        p2.addPoint(x1 + (width/4 - 44/3), y1 + (height/2 - 40/3));//11
                        p2.addPoint(x1 + (width/4 - 11), y1 + (height/2 - 10/3));//20
                        p2.addPoint(x1 + (width/4), y1 + (height/2 - 10/3));//4
                        p2.addPoint(x1 + (width/4 - 44/3 + 5867/1000), y1 + (height/2 + 8/3));//27
                        p2.addPoint(x1 + (width/4 + 4889/500 - 44/3), y1 + (height/2 + 40/3));//37
                        p2.addPoint(x1 + (width/4 - 44/3), y1 + (height/2 + 40/6));//41
                        p2.addPoint(x1 + (width/4 - 4889/500 - 44/3), y1 + (height/2 + 40/3));//64
                        p2.addPoint(x1 + (width/4 - 5867/1000 - 44/3), y1 + (height/2 + 8/3));//45
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                        
//                        //Draw a circle
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(x1 + (getWidth() - 55)/2, y1 + (getHeight() - 55)/2, 55, 55);
//                        //Draw a border
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1, y1, width, height);
//                        //Draw a second border inside the first one
//                        g.setColor(Color.RED);
//                        g.drawRect(x1 + 3, y1 + 3, width - 6, height - 6);
//                        //Draw a diagonal line
//                        g.setColor(Color.GREEN);
//                        g.drawLine(x1, y1, x2, y2);
//                        //Draw a second diagonal line
//                        g.setColor(Color.BLACK);
//                        g.drawLine(x3, y3, x4, y4);
            }
}