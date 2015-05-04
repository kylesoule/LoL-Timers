package lib;

import java.awt.image.BufferedImage;

public class Class {
	/**
	 * Holds x,y coordinates.
	 */
	public static class XY {
		int x;
		int y;
		
		public int getX() { return x; }
		public int getY() { return y; }
		
		public void setX(int x) { this.x = x; }
		public void setY(int y) { this.y = y; }
	}
	
	/**
	 * Holds skill timers.
	 */
	public static class Skill {
		float s1;
		float s2;
		float s3;
		float s4;
		float s5;
		
		public float getS1() { return s1; }
		public float getS2() { return s2; }
		public float getS3() { return s3; }
		public float getS4() { return s4; }
		public float getS5() { return s5; }
		
		public void setS1(float s1) { this.s1 = s1; }
		public void setS2(float s2) { this.s2 = s2; }
		public void setS3(float s3) { this.s3 = s3; }
		public void setS4(float s4) { this.s4 = s4; }
		public void setS5(float s5) { this.s5 = s5; }
	}
	
	/**
	 * Holds data and icons for each icon.
	 */
	public static class ChampionData {
		String name;
		String filename;
		String primary;
		String Secondary;
		int attack;
		int defense;
		int ability;
		int difficulty;
		Skill q;
		Skill w;
		Skill e;
		Skill r;
		BufferedImage image;
		
		public String getName() { return name; } 
		public String getFilename() { return filename; }
		public String getPrimary() { return primary; }
		public String getSecondary() { return Secondary; }
		public int getAttack() { return attack; }
		public int getDefense() { return defense; }
		public int getAbility() { return ability; }
		public int getDifficulty() { return difficulty; }
		public Skill getQ() { return q; }
		public Skill getW() { return w; }
		public Skill getE() { return e; }
		public Skill getR() { return r; }
		public BufferedImage getImage() { return image; }
		
		public void setName(String name) { this.name = name; }
		public void setFilename(String filename) { this.filename = filename.replace("'", "").replace(".", ""); }
		public void setPrimary(String primary) { this.primary = primary; }
		public void setSecondary(String secondary) { Secondary = secondary; }
		public void setAttack(int attack) { this.attack = attack; }
		public void setDefense(int defense) { this.defense = defense; }
		public void setAbility(int ability) { this.ability = ability; }
		public void setDifficulty(int difficulty) { this.difficulty = difficulty; }
		public void setQ(Skill q) { this.q = q; }
		public void setW(Skill w) { this.w = w; }
		public void setE(Skill e) { this.e = e; }
		public void setR(Skill r) { this.r = r; }
		public void setImage(BufferedImage image) { this.image = image; }
	}
}