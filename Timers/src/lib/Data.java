package lib;

public class Data {
	/**
	 * Populate the data from CSV file information.
	 * @param csvData
	 * @return
	 */
	public static Class.ChampionData populateData(String[] csvData) {
		// Write data from row
		Class.ChampionData champData = new Class.ChampionData();
		Class.Skill q = new Class.Skill();
		Class.Skill w = new Class.Skill();
		Class.Skill e = new Class.Skill();
		Class.Skill r = new Class.Skill();
		champData.setName(csvData[0]);
		champData.setFilename(csvData[0].replace(" ", "-").toLowerCase());
		champData.setPrimary(csvData[1]);
		champData.setSecondary(csvData[2]);
		champData.setAttack(Integer.parseInt(csvData[3]));
		champData.setDefense(Integer.parseInt(csvData[4]));
		champData.setAbility(Integer.parseInt(csvData[5]));
		champData.setDifficulty(Integer.parseInt(csvData[6]));
		
		q.setS1(Float.parseFloat(csvData[7]));
		q.setS2(Float.parseFloat(csvData[8]));
		q.setS3(Float.parseFloat(csvData[9]));
		q.setS4(Float.parseFloat(csvData[10]));
		q.setS5(Float.parseFloat(csvData[11]));
		
		w.setS1(Float.parseFloat(csvData[12]));
		w.setS2(Float.parseFloat(csvData[13]));
		w.setS3(Float.parseFloat(csvData[14]));
		w.setS4(Float.parseFloat(csvData[15]));
		w.setS5(Float.parseFloat(csvData[16]));
		
		e.setS1(Float.parseFloat(csvData[17]));
		e.setS2(Float.parseFloat(csvData[18]));
		e.setS3(Float.parseFloat(csvData[19]));
		e.setS4(Float.parseFloat(csvData[20]));
		e.setS5(Float.parseFloat(csvData[21]));
		
		r.setS1(Float.parseFloat(csvData[22]));
		r.setS2(Float.parseFloat(csvData[23]));
		r.setS3(Float.parseFloat(csvData[24]));
		
		// Only write the alternate row if it exists
		if(csvData.length > 25) {
			r.setS4(Float.parseFloat(csvData[25]));
		}
		
		champData.setQ(q);
		champData.setW(w);
		champData.setE(e);
		champData.setR(r);
		
		if(champData.getPrimary().equals("LETTER")) {
			champData.setImage(Icon.createLetter(champData.getName()));
		} else {
			champData.setImage(Icon.getIconFromFile(champData.getFilename()));
		}
		
		return champData;
	}
}