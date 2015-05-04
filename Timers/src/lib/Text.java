package lib;


import gui.Main;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Text {
	/**
	 * Add timers to icons.
	 * @param image
	 * @param cd
	 * @param field
	 * @return
	 */
	public static BufferedImage addText(BufferedImage image, float cd, int field) {
		// Remove decimals if ending in zero
		String text = Float.toString(cd).replace(".0", "");
		
		// Replace 0 values with nothing
		if(text.equals("0")) { text = ""; }
		
		// Set text parameters
		Graphics2D g = (Graphics2D)image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setFont(new Font("Arial", Font.PLAIN, Main.fontSize));
		g.setColor(Main.timerText);

		// Get the coordinates for the text to be placed properly
		Class.XY xy = Icon.getCoordinates(field, g.getFontMetrics().stringWidth(text));
		g.drawString(text, xy.getX(), xy.getY());
		
		return image;
	}
	
	/**
	 * Add a header row before icons.
	 * @param image
	 * @param text
	 * @param line
	 * @return
	 */
	public static BufferedImage createHeader(BufferedImage image, String text, int line) {
		Graphics2D g = (Graphics2D)image.createGraphics();
		int x = (int)(Main.canvasSize - Main.iconSize) / 2;
		int y = (line * Main.canvasSize) + (int)(Main.canvasSize * 0.75);
		
		// Add text
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setFont(new Font("Arial", Font.PLAIN, Main.headerFontSize));
		g.setColor(Main.headerText);
		g.drawString(text, x, y);
		
		// Add line
		g.setColor(Main.headerLine);
		g.drawLine(x, y, (Main.champsPerLine * Main.canvasSize) - x, y + 1);
		
		image = Image.createSpaceForNewIcon(image);
		
		return image;
	}
}