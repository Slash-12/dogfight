package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point; //je suis pas sûre de ça mais bon c'est ce qu'ils me proposaient

public class Mobile implements IMobile {
	private int speed;
	
	public Mobile(Direction direction , Position position , Dimension dimension , int speed , String image){
		
	}

	@Override
	public Direction getDirection() {
		
		return null; // on a l'habitude des null maintenant
	}

	@Override
	public void setDirection(Direction direction) {
		
		
	}

	@Override
	public Point getPosition() {
		
		return null; // trop de null à l'aide
	}

	@Override
	public Dimension getDimension() {
		
		return null; // oh encore un null
	}

	@Override
	public int getWidth() {
		
		return 1;
	}

	@Override
	public int getHeight() {
		
		return 1;
	}

	@Override
	public int getSpeed() {
	
		return 1;
	}

	@Override
	public Image getImage() {
	
		return null; // les null c'est la base
	}

	@Override
	public void move() {
		
		
	}

	@Override
	public void placeInArea(IArea area) {
		
		
	}

	@Override
	public boolean isPlayer(int player) {
	
		return false;
	}
	
	private void moveUp(){
		
	}
	private void moveRight(){
		
	}
	private void moveDown(){
		
	}
	private void moveLeft(){
	
	}
	public IDogfightModel getDogfightModel(){
		return null; // yay on aime les null
		
	}
	
	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
			
	}

	@Override
	public boolean hit() {
		
		return false;
	}

	@Override
	public boolean isWeapon() {
		
		return false;
	}

}
