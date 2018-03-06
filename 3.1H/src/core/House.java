package core;
import java.awt.*;
import java.awt.image.BufferedImage;

public class House {
	private double x;
	private double y;
	private double vertex;
	public House(double x,double y, double vertex) {}
	public void draw(Graphics2D g2) {
		int xCoord = 100;
		int yCoord = 50;
		Rectangle house = new Rectangle(xCoord,yCoord);
		g2.draw(house);
	}
	public static void main(String[] args) {
		BufferedImage image = new BufferedImage(500,1000,BufferedImage.TYPE_INT_ARGB);
		House h = new House(1.0,1.0,2.0);
		Graphics2D g2 = image.createGraphics();
		h.draw(g2);
	}
}