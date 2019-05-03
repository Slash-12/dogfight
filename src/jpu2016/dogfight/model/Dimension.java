package jpu2016.dogfight.model;

public class Dimension {
	
	private int width;
	private int height;
	
	public Dimension(int width , int height) {
		this.setWidth(width);
		this.setHeight(height);
		
	}
	public Dimension(Dimension dimension) {
		
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}
