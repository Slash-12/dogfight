package jpu2016.dogfight.model;

public class Plane extends Mobile {
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player ;
			
	public Plane(int player , Direction direction , Position position , String image) {
		super(direction , position , null , SPEED , image); // y'a null parce que je sais pas quoi mettre à la place de dimension (c'est bizarre qu'il soit pas dans les parametres du constructeur
		
		
	}
	
	public boolean isPlayer(int player ){
		return false;
		
	}
	public boolean hit(){
		return false;
		
	}
}

