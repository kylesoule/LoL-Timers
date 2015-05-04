package lib;


import gui.Main;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Set;
import javax.imageio.ImageIO;
import org.imgscalr.Scalr;

public class Icon {
	public static final int Q_MIN = 0;
	public static final int Q_MAX = 1;
	public static final int W_MIN = 2;
	public static final int W_MAX = 3;
	public static final int E_MIN = 4;
	public static final int E_MAX = 5;
	public static final int R_MIN = 6;
	public static final int R_MAX = 7;
	
	public static final int rightEdge = Main.canvasSize - ((Main.canvasSize - Main.iconSize) / 2);
	public static final int leftEdge = (Main.canvasSize - Main.iconSize) / 2;
	public static final int topEdge = leftEdge;
	public static final int bottomEdge = rightEdge;
	
	/**
	 * Set icon in HashMap (champs, summoners, jungle, etc.).
	 * @param list
	 * @return
	 */
	public static HashMap<String, Class.ChampionData> setIcon(HashMap<String, Class.ChampionData> list) {
		Set<String> keys = list.keySet();
		
		for(String item : keys) {
			Class.ChampionData data = list.get(item);
			
			BufferedImage img = Image.resizeCanvas(Scalr.resize(data.getImage(), Main.iconSize));
			img = Text.addText(img, data.getQ().getS5(), Q_MIN);
			img = Text.addText(img, data.getQ().getS1(), Q_MAX);
			img = Text.addText(img, data.getW().getS5(), W_MIN);
			img = Text.addText(img, data.getW().getS1(), W_MAX);
			img = Text.addText(img, data.getE().getS5(), E_MIN);
			img = Text.addText(img, data.getE().getS1(), E_MAX);
			img = Text.addText(img, data.getR().getS3(), R_MIN);
			img = Text.addText(img, data.getR().getS1(), R_MAX);
			
			list.get(item).setImage(img);
		}
		
		return list;
	}
	
	/**
	 * Add icon to image.
	 * @param composed
	 * @param icon
	 * @param row
	 * @param line
	 * @return
	 */
	public static BufferedImage addIconToComposed(BufferedImage composed, BufferedImage icon, int row, int line) {
		Graphics2D g = composed.createGraphics();
		g.drawImage(icon, row * Main.canvasSize, line * Main.canvasSize, null);
		g.dispose();
		
		return composed;
	}
	
	/**
	 * Read champion icon from resources.
	 * @param champ
	 * @return
	 */
	public static BufferedImage getIconFromFile(String champ) {
		BufferedImage image;
		
		try {
			image = ImageIO.read(Icon.class.getResourceAsStream("/icons/" + champ + "." + File.imageType));
		} catch (Exception e) {
			return null;
		}
		
		return image;
	}
	
	/**
	 * Specify coordinates on icon for timers.
	 * @param field
	 * @param textWidth
	 * @return
	 */
	public static Class.XY getCoordinates(int field, int textWidth) {
		Class.XY xy = new Class.XY();
		switch(field) {
			case Q_MIN:	xy.setX(leftEdge - textWidth - 1);
						xy.setY(bottomEdge);
						break;
			case Q_MAX:	xy.setX(leftEdge - textWidth - 1);
						xy.setY(topEdge + Main.fontSize);
						break;
			case W_MIN:	xy.setX(rightEdge - textWidth);
						xy.setY(topEdge - 1);
						break;
			case W_MAX: xy.setX(leftEdge);
						xy.setY(topEdge - 1);
						break;
			case E_MIN:	xy.setX(rightEdge + 1);
						xy.setY(bottomEdge);
						break;
			case E_MAX:	xy.setX(rightEdge + 1);
						xy.setY(topEdge + Main.fontSize);
						break;
			case R_MIN:	xy.setX(rightEdge - textWidth);
						xy.setY(bottomEdge + Main.fontSize + 1);
						break;
			case R_MAX:	xy.setX(leftEdge);
						xy.setY(bottomEdge + Main.fontSize + 1);
						break;
			default:	break;
		}
		
		return xy;
	}
	
	/**
	 * Creates an icon-sized letter
	 * @param letter
	 * @return
	 */
	public static BufferedImage createLetter(String letter) {
		BufferedImage image = new BufferedImage(Main.canvasSize, Main.canvasSize, BufferedImage.TYPE_INT_RGB);
		int width = 0;
		int height = 0;
		int fontSize = 0;
		
		while(width < Main.iconSize && height < Main.iconSize) {
			fontSize++;
			
			Graphics2D g = (Graphics2D) image.createGraphics();
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g.setFont(new Font("Arial", Font.PLAIN, fontSize));
			g.drawString(letter, 0, 0);
			
			FontMetrics fm = g.getFontMetrics();
			width = fm.stringWidth(letter);
			height = fm.getHeight();
		}

		// Set text parameters
		Graphics2D g = (Graphics2D) image.createGraphics();
		
		// Set color
		g.setPaint(Main.background);
		g.fillRect(0, 0, Main.canvasSize, Main.canvasSize);
		
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setFont(new Font("Arial", Font.PLAIN, fontSize));
		g.setColor(Main.timerText);

		g.drawString(letter,
					 (int)((Main.canvasSize - width) / 2),
					 (int)((Main.canvasSize - height) / 2) + height);

		return image;
	}
}