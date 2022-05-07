import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;

public class CGAssign extends JPanel {
	//private static final Color BACKGROUD_COLOR = new Color(255,205,194);
	private static Color COLOR = new Color(0,0,0);
    public static void main(String[] args) {
        CGAssign m = new CGAssign();
		
		JFrame f = new JFrame();
		f.add(m);
		//f.setTitle("Holiday");
		f.setSize(600,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
    }
    public void paintComponent(Graphics g) 
    {	
		BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = buffer.createGraphics();

		//set background
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, 600, 600);

		//skyPic1
		COLOR = new Color(86,98,138);
		g2.setColor(COLOR);
		bezier(g2, 0, 260, 290, 270, 350, 275, 600, 240);
		/*
		getPoly(g2, 0, 260, 0, 600, 180, 270);
		getPoly (g2, 180, 270, 0, 600, 600, 600);
		getPoly (g2, 180, 270, 330, 270, 600, 600);
		getPoly (g2, 330, 270, 600, 241, 600, 600);

		buffer = floodFill(buffer, 10, 400, Color.WHITE, COLOR);
		buffer = floodFill(buffer, 270, 400, Color.WHITE, COLOR);
		buffer = floodFill(buffer, 300, 330, Color.WHITE, COLOR);
		buffer = floodFill(buffer, 500, 470, Color.WHITE, COLOR);
		*/
		int []xSky  = {0,0,180},ySky  = {260,600,270};
		int []xSky2  = {180,0,600},ySky2  = {270,600,600};
		int []xSky3 = {180,330,600},ySky3 = {270,270,600};
		int []xSky4 = {330,600,600},ySky4 = {270,241,600};
		g2.fillPolygon(xSky, ySky, 3);
		g2.fillPolygon(xSky2, ySky2, 3);
		g2.fillPolygon(xSky3, ySky3, 3);
		g2.fillPolygon(xSky4, ySky4, 3);
		
		//skyPic2
		COLOR = new Color(56,70,107);
		g2.setColor(COLOR);
		bezier(g2, 0, 300, 120, 305, 340, 250, 550, 290);
		getPoly(g2, 0, 300, 110, 300, 0, 600);
		getPoly(g2, 0, 600, 110, 300, 600, 600);
		getPoly(g2, 110, 300, 300, 280, 600, 600);
		getPoly(g2, 300, 280, 600, 285, 370, 355);
		buffer = floodFill(buffer, 10, 400, new Color(86,98,138), COLOR);
		buffer = floodFill(buffer, 300, 500, new Color(86,98,138), COLOR);
		buffer = floodFill(buffer, 200, 300, new Color(86,98,138), COLOR);
		buffer = floodFill(buffer, 350, 300, new Color(86,98,138), COLOR);
		buffer = floodFill(buffer, 550, 350, new Color(86,98,138), COLOR);
		
		//skyPic3
		COLOR = new Color(38,47,86);
		g2.setColor(COLOR);
		bezier(g2, 0, 340, 190, 365, 460, 325, 600, 280);
		getPoly(g2, 0, 345, 90, 345, 0, 600);
		getPoly(g2, 0, 600, 90, 345, 600, 600);
		getPoly(g2, 90, 345, 600, 600, 600, 600);
		buffer = floodFill(buffer, 45, 400, new Color(56,70,107), COLOR);
		buffer = floodFill(buffer, 90, 500, new Color(56,70,107), COLOR);
		buffer = floodFill(buffer, 300, 370, new Color(56,70,107), COLOR);

		//skyPic4
		COLOR = new Color(21,34,68);
		g2.setColor(COLOR);
		getPoly(g2, 0, 470, 0, 500, 140, 485);
		buffer = floodFill(buffer, 5, 480, new Color(38,47,86), COLOR);

		//ground
		COLOR = new Color(14,22,45);
		g2.setColor(COLOR);
		bezier(g2, 0, 500, 360, 460, 300, 450, 600, 440);
		getPoly(g2, 0, 507, 0, 600, 600, 600);
		getPoly(g2, 0, 507, 400, 450, 400, 570);
		getPoly(g2, 400, 570, 400, 450, 600, 440);
		getPoly(g2, 400, 570, 600, 600, 600, 440);
		buffer = floodFill(buffer, 5, 580, new Color(38,47,86), COLOR);
		buffer = floodFill(buffer, 350, 500, new Color(38,47,86), COLOR);
		buffer = floodFill(buffer, 500, 500, new Color(38,47,86), COLOR);
		buffer = floodFill(buffer, 590, 590, new Color(38,47,86), COLOR);

		g.drawImage(buffer, 0, 0, null);
		
		//camp
		int []xCamp  = {540,490,560},yCamp  = {360,450,480};
		int []xCamp2 = {530,510,550},yCamp2 = {390,450,465};
		int []xCamp3 = {540,510,550},yCamp3 = {420,450,465};
		int []xCamp4 = {560,540,600},yCamp4 = {480,360,360};
		int []xCamp5 = {600,560,600},yCamp5 = {360,480,470};

		COLOR = new Color(64,74,109);
		g.setColor(COLOR);
		g.fillPolygon(xCamp, yCamp, 3);
		
		COLOR = new Color(244,124,108);
		g.setColor(COLOR);
		g.fillPolygon(xCamp2, yCamp2, 3);

		COLOR = new Color(36,45,80);
		g.setColor(COLOR);
		g.fillPolygon(xCamp3, yCamp3, 3);
		
		COLOR = new Color(116,104,109);
		g.setColor(COLOR);
		g.fillPolygon(xCamp4, yCamp4, 3);
		g.fillPolygon(xCamp5, yCamp5, 3);
		
		COLOR = new Color(64,74,109);
		g.setColor(COLOR);
		ddaLine(g,530, 390, 530, 455);

		//fire+people
		int []xFP  = {305,290,315},yFP  = {445,466,466};
		int []xFP2 = {305,297,310},yFP2 = {445,455,455};
		int []xFP3 = {280,265,290},yFP3 = {430,466,466};
		int []xFP4 = {325,315,340},yFP4 = {435,460,460};
		int []xFP5 = {360,340,365},yFP5 = {425,460,455};

		COLOR = new Color(234,182,191);
		g.setColor(COLOR);
		g.fillPolygon(xFP, yFP, 3);

		COLOR = new Color(250,132,127);
		g.setColor(COLOR);
		g.fillPolygon(xFP2, yFP2, 3);

		COLOR = new Color(10,13,30);
		g.setColor(COLOR);
		bezier(g, 280, 430, 265, 440, 305, 450, 285, 440);
		bezier(g, 325, 430, 310, 440, 350, 450, 330, 440);
		bezier(g, 355, 420, 340, 430, 380, 440, 360, 430);
		g.fillPolygon(xFP3, yFP3, 3);
		g.fillPolygon(xFP4, yFP4, 3);
		g.fillPolygon(xFP5, yFP5, 3);

	}

	public void getPoly (Graphics g, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		int[] xPoint = {x1,x2,x3};
		int[] yPoint = {y1,y2,y3};
		Polygon p = new Polygon(xPoint,yPoint,xPoint.length); 
		g.drawPolygon(p);
	}

	public void ddaLine (Graphics g, int x1, int y1, int x2, int y2)
    {
        double dx = x2 - x1;
        double dy = y2 - y1;
 
        double x, y;
        double m = dy / dx;
 
        if (m <= 1 && m >= 0)
        {
            y = Math.min(y1, y2);
            for (x = Math.min(x1, x2); x <= Math.max(x1, x2); x++)
            {
                y += m;
                plot(g, (int)x, (int)y,3);
            }
        }
        else if (m >= -1 && m < 0)
        {
            y = Math.min(y1, y2);
            for (x = Math.max(x1, x2); x >= Math.min(x1, x2); x--)
            {
                y -= m;
                plot(g, (int)x, (int)y,3);
            }
        }
        else if (m > 1)
        {
            x = Math.min(x1, x2);
            for (y = Math.min(y1, y2); y <= Math.max(y1, y2); y++)
            {
                x += 1 / m;
                plot(g, (int)x, (int)y,3);
            }
        }
        else
        {
            x = Math.min(x1, x2);
            for (y = Math.max(y1, y2); y >= Math.min(y1, y2); y--)
            {
                x -= 1 / m;
                plot(g, (int)x, (int)y,3);
            }
        }
    }

	public void bezier (Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
	{
		for (int i = 0; i <= 1000; i++)
		{
			double t = i / 1000.0;
			int x = (int)(Math.pow((1 - t), 3)*x1 + 3*t*Math.pow((1-t), 2)*x2 + 3*t*t*(1-t)*x3 + t*t*t*x4);
			int y = (int)(Math.pow((1 - t), 3)*y1 + 3*t*Math.pow((1-t), 2)*y2 + 3*t*t*(1-t)*y3 + t*t*t*y4);
	 
			plot (g, x, y,7);
		}
	}

	public BufferedImage floodFill(BufferedImage m, int x, int y, Color targetColor, Color replacementColor)
	{
		Queue<Point> q = new LinkedList<Point>();
		Graphics2D g2 = m.createGraphics();
		
		if (new Color(m.getRGB(x, y)).equals(targetColor))
		{
			g2.setColor(replacementColor);
			plot(g2, x, y, 1);
			q.add(new Point(x, y));
		}
		
		while (!q.isEmpty())
		{
			Point p = q.poll();
			//south
			if (p.y < 600 && new Color(m.getRGB(p.x, p.y + 1)).equals(targetColor))
			{
				g2.setColor(replacementColor);
				plot(g2, p.x, p.y + 1, 1);
				q.add(new Point(p.x, p.y + 1));	
			}
			
			//north 
			if (p.y > 0 && new Color(m.getRGB(p.x, p.y - 1)).equals(targetColor))
			{
				g2.setColor(replacementColor);
				plot(g2, p.x, p.y - 1, 1);
				q.add(new Point(p.x, p.y - 1));	
			}
			
			//east
			if (p.x < 600 && new Color(m.getRGB(p.x + 1, p.y)).equals(targetColor))
			{
				g2.setColor(replacementColor);
				plot(g2, p.x + 1, p.y, 1);
				q.add(new Point(p.x + 1, p.y));	
			}
			
			//west
			if (p.x > 0 && new Color(m.getRGB(p.x - 1, p.y)).equals(targetColor))
			{
				g2.setColor(replacementColor);
				plot(g2, p.x - 1, p.y, 1);
				q.add(new Point(p.x - 1, p.y));	
			}
		}
		return m;
		
	}

	private void plot(Graphics g, int x, int y,int size) {
		g.fillRect(x, y, size,size);
	}
	
}