package lib;

import gui.Main;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import org.imgscalr.Scalr;
import timers.Timers;

public class Image {
	/**
	 * Set the canvas size to fit icons.
	 * @param image
	 * @return
	 */
	public static BufferedImage resizeCanvas(BufferedImage image) {
		BufferedImage resizedImage = new BufferedImage(Main.canvasSize, Main.canvasSize, image.getType());
		Graphics2D g = resizedImage.createGraphics();
		
		// Set color
		g.setPaint(Main.background);
		g.fillRect(0, 0, resizedImage.getWidth(), resizedImage.getHeight());
		
		g.drawImage(image,
					(Main.canvasSize - Main.iconSize) / 2,
					(Main.canvasSize - Main.iconSize) / 2,
					Main.iconSize,
					Main.iconSize,
					null);
		g.dispose();
		
		return resizedImage;
	}
	
	/**
	 * Start creating image.
	 * @param image
	 * @param data
	 * @param list
	 * @param header
	 * @return
	 */
	public static BufferedImage createImage(BufferedImage image, HashMap<String, Class.ChampionData> data, List<String> list, String header) {
		// Writes header when true
		boolean firstLine = true;
		
		// Reset each time we call this function
		Timers.imgRow = 0;
		
		for(String c : list) {
			// Add header to first row
			if(firstLine) {
				image = Text.createHeader(image, header, Timers.imgLine);
				firstLine = false;
				Timers.imgLine++;
			}

			image = Icon.addIconToComposed(image, data.get(c).getImage(), Timers.imgRow, Timers.imgLine);
			Timers.imgRow++;
				
			if(Timers.imgRow >= Main.champsPerLine) {
				image = createSpaceForNewIcon(image);
				Timers.imgLine++;
				Timers.imgRow = 0;
			}
		}
		
		return image;
	}
	
	/**
	 * Create a new row to place icons in.
	 * @param image
	 * @return
	 */
	public static BufferedImage createSpaceForNewIcon(BufferedImage image) {
		BufferedImage resizedImage = new BufferedImage(image.getWidth(), image.getHeight() + Main.canvasSize, image.getType());
		Graphics2D g = resizedImage.createGraphics();
		
		// Set color
		g.setPaint(Main.background);
		g.fillRect(0, resizedImage.getHeight() - Main.canvasSize, resizedImage.getWidth(), Main.canvasSize);
		
		g.drawImage(image, 0, 0, null);
		g.dispose();
		
		return resizedImage;
	}
	
	/**
	 * Adds logo and text to image.
	 * @param image
	 * @return
	 */
	public static BufferedImage addLogo(BufferedImage image) {
		// Resize to 10% of total canvas size
		BufferedImage icon = Icon.getIconFromFile("logo");
		int width = (int)(image.getWidth() * 0.10);
		int height = (int)(icon.getHeight() * (width / image.getWidth()));
		BufferedImage logo = Scalr.resize(Icon.getIconFromFile("logo"), width, height);
		
		Graphics2D g = image.createGraphics();
		//g.drawImage(logo, image.getWidth() - (int)(image.getWidth() * 0.1), logo.getHeight(), null);
		g.drawImage(logo, image.getWidth() - width, 0, null);
		g.dispose();
		
		return image;
	}
}