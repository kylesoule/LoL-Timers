package lib;


import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import javax.imageio.ImageIO;

public class File {
	// File information
	public static final String imageType = "png";
	public static String exportPath = "";
	
	/**
	 * Read CSV file and return HashMap of data.
	 * @param type
	 * @return
	 * @throws IOException
	 */
	public static HashMap<String, Class.ChampionData> getCSV(String type) throws IOException {
		HashMap<String, Class.ChampionData> champs = new HashMap<String, Class.ChampionData>();
		BufferedReader csvFile = null;
		
		if(type.equals("champions")) {
			csvFile = new BufferedReader(new InputStreamReader(Icon.class.getResourceAsStream("/csv/Champions.csv")));
		} else if(type.equals("summoners")) {
			csvFile = new BufferedReader(new InputStreamReader(Icon.class.getResourceAsStream("/csv/Summoners.csv")));
		} else if(type.equals("jungle")) {
			csvFile = new BufferedReader(new InputStreamReader(Icon.class.getResourceAsStream("/csv/Jungle.csv")));
		} else {
			csvFile = new BufferedReader(new InputStreamReader(Icon.class.getResourceAsStream("/csv/Champions.csv")));
		}

		csvFile.readLine();	// Skip header row
		String dataRow = csvFile.readLine();
		
		while (dataRow != null) {
			Class.ChampionData champData = Data.populateData(dataRow.split(","));
			champs.put(champData.getName(), champData);
			dataRow = csvFile.readLine();
		}
		csvFile.close();
		
		return champs;
	}
	
	/**
	 * Writes final image to disk.
	 * @param image
	 * @param filename
	 * @return
	 */
	public static boolean writeImage(BufferedImage image, String filename) {
		java.io.File file = new java.io.File(lib.File.exportPath + "\\" + filename + "." + imageType);
		
		try {
			ImageIO.write(image, imageType, file);
		} catch(Exception e) { return false; }
		
		return true;
	}
}