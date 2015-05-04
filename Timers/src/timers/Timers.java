package timers;

import lib.*;

import gui.Main;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Timers {
	public static int imgRow = 0;
	public static int imgLine = 0;
		
	/**
	 * The magic begins here.
	 * @param args
	 * @throws IOException
	 */
	public static boolean createTimers() throws IOException {
		// Create HashMaps for each type of data
		HashMap<String, lib.Class.ChampionData> champList = Icon.setIcon(File.getCSV("champions"));
		HashMap<String, lib.Class.ChampionData> summonersList = Icon.setIcon(File.getCSV("summoners"));
		HashMap<String, lib.Class.ChampionData> jungleList = Icon.setIcon(File.getCSV("jungle"));
		
		// Create key lists and sort
		List<String> sortedChampKeys = new ArrayList<String>(champList.keySet());
		List<String> sortedSummonersKeys = new ArrayList<String>(summonersList.keySet());
		List<String> sortedJungleKeys = new ArrayList<String>(jungleList.keySet());
		Collections.sort(sortedChampKeys);
		Collections.sort(sortedSummonersKeys);
		Collections.sort(sortedJungleKeys);
		
		// Image we are writing to
		BufferedImage composed = new BufferedImage(Main.canvasSize * Main.champsPerLine, Main.canvasSize, BufferedImage.TYPE_INT_RGB);

		// Set color
		Graphics2D g = composed.createGraphics();
		g.setPaint(Main.background);
		g.fillRect(0, 0, composed.getWidth(), composed.getHeight());
		
		// Add groups to image
		composed = Image.createImage(composed, champList, sortedChampKeys, Main.championsHeader);
		composed = Image.createSpaceForNewIcon(composed);	// Spacer
		imgLine++;
		
		composed = Image.createImage(composed, summonersList, sortedSummonersKeys, Main.summonersHeader);
		composed = Image.createSpaceForNewIcon(composed);	// Spacer
		imgLine++;
		
		composed = Image.createImage(composed, jungleList, sortedJungleKeys, Main.jungleHeader);
		
		// Add logo
		composed = Image.addLogo(composed);
		
		boolean written = File.writeImage(composed, "LoL Timers " + Main.version);
		
		// Reset variables
		composed = null;
		imgLine = 0;
		imgRow = 0;
		
		return written;
	}
}